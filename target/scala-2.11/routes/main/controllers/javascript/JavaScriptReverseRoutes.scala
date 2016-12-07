
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/desconocido/Documentos/Grupo21_Proyecto10/Proyecto10GRUPO21/conf/routes
// @DATE:Tue Dec 06 18:11:14 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:41
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:44
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseUsuarioHome(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioHome.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseEdanController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/create"})
        }
      """
    )
  
    // @LINE:38
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.delete",
      """
        function(edId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/delete" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("edId", edId0)])})
        }
      """
    )
  
    // @LINE:30
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/list"})
        }
      """
    )
  
    // @LINE:34
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.edit",
      """
        function(edId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/edit" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("edId", edId0)])})
        }
      """
    )
  
    // @LINE:36
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/update"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseMunicipioHome(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MunicipioHome.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "municipios"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseMunicipioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MunicipioController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "municipio/list"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseEdanHome(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanHome.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fedan"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/create"})
        }
      """
    )
  
    // @LINE:26
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.delete",
      """
        function(usuId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/delete" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("usuId", usuId0)])})
        }
      """
    )
  
    // @LINE:18
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/list"})
        }
      """
    )
  
    // @LINE:22
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.edit",
      """
        function(usuId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/edit" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("usuId", usuId0)])})
        }
      """
    )
  
    // @LINE:24
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/update"})
        }
      """
    )
  
  }


}
