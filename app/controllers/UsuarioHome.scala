package controllers

import javax.inject.Inject

import play.api.mvc._
import views.html

class UsuarioHome @Inject()(webJarAssets: WebJarAssets) extends Controller {

  def index = Action {Ok(html.indexUsuario(webJarAssets))}

}
