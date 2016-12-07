package controllers

import com.google.inject.Inject
import models.Municipio
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.{JsError, JsValue, Json}
import play.api.libs.json.Json._
import play.api.mvc._
import repo.MunicipioRepository
import utils.Constants
import utils.JsonFormat._

import scala.concurrent.Future


class MunicipioController @Inject()(munRepository: MunicipioRepository) extends Controller {

  import Constants._

  val logger = Logger(this.getClass())

  private def successResponse(data: JsValue, message: String) = {
    obj("status" -> SUCCESS, "data" -> data, "msg" -> message)
  }


  def list() = Action.async {
    munRepository.getAll().map { res =>
      logger.info("Mun list: " + res)
      Ok(successResponse(Json.toJson(res), "Datos obtenidos de forma exitosa"))
    }
  }


}



