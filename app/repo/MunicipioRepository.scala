package repo

import javax.inject.{ Inject, Singleton }
import models.{Municipio, Departamento}
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.driver.JdbcProfile
import scala.concurrent.Future
import java.util.Date

@Singleton()
class MunicipioRepository @Inject() (protected val dbConfigProvider: DatabaseConfigProvider) extends MunicipioTable with HasDatabaseConfigProvider[JdbcProfile]
{

  import driver.api._

  def insertAll(municipios: List[Municipio]): Future[Seq[Int]] = db.run { munTableQueryInc ++= municipios } 
  
  def getAll(): Future[List[Municipio]] = db.run { munTableQuery.to[List].result }

  def getById(munId: Int): Future[Option[Municipio]] = db.run { munTableQuery.filter(_.id === munId).result.headOption }
  
  def ddl = munTableQuery.schema

}

private[repo] trait MunicipioTable  { self: HasDatabaseConfigProvider[JdbcProfile] =>

  import driver.api._

  private[MunicipioTable] class MunicipioTable(tag: Tag) extends Table[Municipio](tag, "municipio") {
 
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    val departamentoid: Rep[Int] = column[Int]("departamentoid", O.SqlType("INTEGER"))
    val nombre: Rep[String] = column[String]("nombre", O.SqlType("VARCHAR(50)"))
    def * = (departamentoid, nombre, id.?) <> (Municipio.tupled, Municipio.unapply)
  }

  lazy protected val munTableQuery = TableQuery[MunicipioTable]

  lazy protected val munTableQueryInc = munTableQuery returning munTableQuery.map(_.id)

}



