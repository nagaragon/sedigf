
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/desconocido/Documentos/Grupo21_Proyecto10/Proyecto10GRUPO21/conf/routes
// @DATE:Tue Dec 06 18:11:14 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_8: controllers.Application,
  // @LINE:8
  UsuarioHome_5: controllers.UsuarioHome,
  // @LINE:10
  EdanHome_2: controllers.EdanHome,
  // @LINE:12
  MunicipioHome_4: controllers.MunicipioHome,
  // @LINE:15
  MunicipioController_3: controllers.MunicipioController,
  // @LINE:18
  UsuarioController_1: controllers.UsuarioController,
  // @LINE:30
  EdanController_0: controllers.EdanController,
  // @LINE:41
  Assets_6: controllers.Assets,
  // @LINE:44
  WebJarAssets_7: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_8: controllers.Application,
    // @LINE:8
    UsuarioHome_5: controllers.UsuarioHome,
    // @LINE:10
    EdanHome_2: controllers.EdanHome,
    // @LINE:12
    MunicipioHome_4: controllers.MunicipioHome,
    // @LINE:15
    MunicipioController_3: controllers.MunicipioController,
    // @LINE:18
    UsuarioController_1: controllers.UsuarioController,
    // @LINE:30
    EdanController_0: controllers.EdanController,
    // @LINE:41
    Assets_6: controllers.Assets,
    // @LINE:44
    WebJarAssets_7: controllers.WebJarAssets
  ) = this(errorHandler, Application_8, UsuarioHome_5, EdanHome_2, MunicipioHome_4, MunicipioController_3, UsuarioController_1, EdanController_0, Assets_6, WebJarAssets_7, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_8, UsuarioHome_5, EdanHome_2, MunicipioHome_4, MunicipioController_3, UsuarioController_1, EdanController_0, Assets_6, WebJarAssets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.UsuarioHome.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fedan""", """controllers.EdanHome.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """municipios""", """controllers.MunicipioHome.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """municipio/list""", """controllers.MunicipioController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/list""", """controllers.UsuarioController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/create""", """controllers.UsuarioController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/edit""", """controllers.UsuarioController.edit(usuId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/update""", """controllers.UsuarioController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/delete""", """controllers.UsuarioController.delete(usuId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/list""", """controllers.EdanController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/create""", """controllers.EdanController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/edit""", """controllers.EdanController.edit(edId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/update""", """controllers.EdanController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/delete""", """controllers.EdanController.delete(edId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_8.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UsuarioHome_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_UsuarioHome_index1_invoker = createInvoker(
    UsuarioHome_5.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioHome",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """usuarios"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_EdanHome_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fedan")))
  )
  private[this] lazy val controllers_EdanHome_index2_invoker = createInvoker(
    EdanHome_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanHome",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """fedan"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_MunicipioHome_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("municipios")))
  )
  private[this] lazy val controllers_MunicipioHome_index3_invoker = createInvoker(
    MunicipioHome_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MunicipioHome",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """municipios"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_MunicipioController_list4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("municipio/list")))
  )
  private[this] lazy val controllers_MunicipioController_list4_invoker = createInvoker(
    MunicipioController_3.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MunicipioController",
      "list",
      Nil,
      "GET",
      """ Rutas municipio""",
      this.prefix + """municipio/list"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UsuarioController_list5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/list")))
  )
  private[this] lazy val controllers_UsuarioController_list5_invoker = createInvoker(
    UsuarioController_1.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "list",
      Nil,
      "GET",
      """ Rutas usuarios""",
      this.prefix + """usu/list"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UsuarioController_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/create")))
  )
  private[this] lazy val controllers_UsuarioController_create6_invoker = createInvoker(
    UsuarioController_1.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """usu/create"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UsuarioController_edit7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/edit")))
  )
  private[this] lazy val controllers_UsuarioController_edit7_invoker = createInvoker(
    UsuarioController_1.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """usu/edit"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UsuarioController_update8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/update")))
  )
  private[this] lazy val controllers_UsuarioController_update8_invoker = createInvoker(
    UsuarioController_1.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """usu/update"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UsuarioController_delete9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/delete")))
  )
  private[this] lazy val controllers_UsuarioController_delete9_invoker = createInvoker(
    UsuarioController_1.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "delete",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """usu/delete"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_EdanController_list10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/list")))
  )
  private[this] lazy val controllers_EdanController_list10_invoker = createInvoker(
    EdanController_0.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """edan/list"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_EdanController_create11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/create")))
  )
  private[this] lazy val controllers_EdanController_create11_invoker = createInvoker(
    EdanController_0.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """edan/create"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_EdanController_edit12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/edit")))
  )
  private[this] lazy val controllers_EdanController_edit12_invoker = createInvoker(
    EdanController_0.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """edan/edit"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_EdanController_update13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/update")))
  )
  private[this] lazy val controllers_EdanController_update13_invoker = createInvoker(
    EdanController_0.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """edan/update"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_EdanController_delete14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/delete")))
  )
  private[this] lazy val controllers_EdanController_delete14_invoker = createInvoker(
    EdanController_0.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "delete",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """edan/delete"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_WebJarAssets_at16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at16_invoker = createInvoker(
    WebJarAssets_7.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """ WebJars""",
      this.prefix + """webjars/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_8.index)
      }
  
    // @LINE:8
    case controllers_UsuarioHome_index1_route(params) =>
      call { 
        controllers_UsuarioHome_index1_invoker.call(UsuarioHome_5.index)
      }
  
    // @LINE:10
    case controllers_EdanHome_index2_route(params) =>
      call { 
        controllers_EdanHome_index2_invoker.call(EdanHome_2.index)
      }
  
    // @LINE:12
    case controllers_MunicipioHome_index3_route(params) =>
      call { 
        controllers_MunicipioHome_index3_invoker.call(MunicipioHome_4.index)
      }
  
    // @LINE:15
    case controllers_MunicipioController_list4_route(params) =>
      call { 
        controllers_MunicipioController_list4_invoker.call(MunicipioController_3.list)
      }
  
    // @LINE:18
    case controllers_UsuarioController_list5_route(params) =>
      call { 
        controllers_UsuarioController_list5_invoker.call(UsuarioController_1.list)
      }
  
    // @LINE:20
    case controllers_UsuarioController_create6_route(params) =>
      call { 
        controllers_UsuarioController_create6_invoker.call(UsuarioController_1.create)
      }
  
    // @LINE:22
    case controllers_UsuarioController_edit7_route(params) =>
      call(params.fromQuery[Int]("usuId", None)) { (usuId) =>
        controllers_UsuarioController_edit7_invoker.call(UsuarioController_1.edit(usuId))
      }
  
    // @LINE:24
    case controllers_UsuarioController_update8_route(params) =>
      call { 
        controllers_UsuarioController_update8_invoker.call(UsuarioController_1.update)
      }
  
    // @LINE:26
    case controllers_UsuarioController_delete9_route(params) =>
      call(params.fromQuery[Int]("usuId", None)) { (usuId) =>
        controllers_UsuarioController_delete9_invoker.call(UsuarioController_1.delete(usuId))
      }
  
    // @LINE:30
    case controllers_EdanController_list10_route(params) =>
      call { 
        controllers_EdanController_list10_invoker.call(EdanController_0.list)
      }
  
    // @LINE:32
    case controllers_EdanController_create11_route(params) =>
      call { 
        controllers_EdanController_create11_invoker.call(EdanController_0.create)
      }
  
    // @LINE:34
    case controllers_EdanController_edit12_route(params) =>
      call(params.fromQuery[Int]("edId", None)) { (edId) =>
        controllers_EdanController_edit12_invoker.call(EdanController_0.edit(edId))
      }
  
    // @LINE:36
    case controllers_EdanController_update13_route(params) =>
      call { 
        controllers_EdanController_update13_invoker.call(EdanController_0.update)
      }
  
    // @LINE:38
    case controllers_EdanController_delete14_route(params) =>
      call(params.fromQuery[Int]("edId", None)) { (edId) =>
        controllers_EdanController_delete14_invoker.call(EdanController_0.delete(edId))
      }
  
    // @LINE:41
    case controllers_Assets_versioned15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_6.versioned(path, file))
      }
  
    // @LINE:44
    case controllers_WebJarAssets_at16_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at16_invoker.call(WebJarAssets_7.at(file))
      }
  }
}
