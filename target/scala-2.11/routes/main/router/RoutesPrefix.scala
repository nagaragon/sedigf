
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/desconocido/Documentos/Grupo21_Proyecto10/Proyecto10GRUPO21/conf/routes
// @DATE:Tue Dec 06 18:11:14 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
