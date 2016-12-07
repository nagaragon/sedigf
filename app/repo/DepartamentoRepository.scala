package repo

import javax.inject.{ Inject, Singleton }
import models.Departamento
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.driver.JdbcProfile
import scala.concurrent.Future
import java.util.Date

@Singleton()
class DepartamentoRepository @Inject() (protected val dbConfigProvider: DatabaseConfigProvider) extends DepartamentoTable with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  def insertAll(departamentos: List[Departamento]): Future[Seq[Int]] = db.run { deptoTableQueryInc ++= departamentos } 
  
  def getAll(): Future[List[Departamento]] = db.run { deptoTableQuery.to[List].result }

  def getById(deptoId: Int): Future[Option[Departamento]] = db.run { deptoTableQuery.filter(_.id === deptoId).result.headOption }
  
  def ddl = deptoTableQuery.schema

}

private[repo] trait DepartamentoTable  { self: HasDatabaseConfigProvider[JdbcProfile] =>

  import driver.api._

  private[DepartamentoTable] class DepartamentoTable(tag: Tag) extends Table[Departamento](tag, "departamento") {
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    val nombre: Rep[String] = column[String]("nombre", O.SqlType("VARCHAR(25)"))
    def * = (nombre, id.?) <> (Departamento.tupled, Departamento.unapply)
  }

  lazy protected val deptoTableQuery = TableQuery[DepartamentoTable]

  lazy protected val deptoTableQueryInc = deptoTableQuery returning deptoTableQuery.map(_.id)

}

