
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,WebJarAssets,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*8.2*/(title: String)(webJarAssets: WebJarAssets)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.60*/("""

"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="myApp">
    <head>
        <title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">

        <!-- Bootstrap 3.3.6 -->
        <link rel='stylesheet' href='"""),_display_(/*18.39*/routes/*18.45*/.WebJarAssets.at(webJarAssets.locate("css/bootstrap.min.css"))),format.raw/*18.107*/("""'>
        <!-- Custom CSS Links -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*20.101*/("""">

    </head>
    <body>

    <header>
         <ul class="nav nav-tabs">
          <li class="active"><a href=""""),_display_(/*27.40*/routes/*27.46*/.Application.index),format.raw/*27.64*/("""">Inicio</a></li>
          <li><a href=""""),_display_(/*28.25*/routes/*28.31*/.EdanHome.index),format.raw/*28.46*/("""">Ficha Edan</a></li>
          <li><a href=""""),_display_(/*29.25*/routes/*29.31*/.UsuarioHome.index),format.raw/*29.49*/("""">Usuarios</a></li>
          <li><a href=""""),_display_(/*30.25*/routes/*30.31*/.MunicipioHome.index),format.raw/*30.51*/("""">Municipio</a></li>
        </ul>
    </header>

        <div class="container-fluid body-content">
            """),_display_(/*35.14*/content),format.raw/*35.21*/("""
        """),format.raw/*36.9*/("""</div>

        <!-- Plugin Javascript -->
        <script type="text/javascript" src='"""),_display_(/*39.46*/routes/*39.52*/.WebJarAssets.at(webJarAssets.locate("jquery.min.js"))),format.raw/*39.106*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*40.46*/routes/*40.52*/.WebJarAssets.at(webJarAssets.locate("js/bootstrap.min.js"))),format.raw/*40.112*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*41.46*/routes/*41.52*/.WebJarAssets.at(webJarAssets.locate("angular.min.js"))),format.raw/*41.107*/("""'></script>
       <script type="text/javascript" src='"""),_display_(/*42.45*/routes/*42.51*/.WebJarAssets.at(webJarAssets.locate("ui-bootstrap-tpls.min.js"))),format.raw/*42.116*/("""'></script>
       <script type="text/javascript" src='"""),_display_(/*43.45*/routes/*43.51*/.WebJarAssets.at(webJarAssets.locate("angular-animate.min.js"))),format.raw/*43.114*/("""'></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,webJarAssets:WebJarAssets,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(webJarAssets)(content)

  def f:((String) => (WebJarAssets) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (webJarAssets) => (content) => apply(title)(webJarAssets)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 18:11:15 CST 2016
                  SOURCE: /home/desconocido/Documentos/Grupo21_Proyecto10/Proyecto10GRUPO21/app/views/main.scala.html
                  HASH: 01ead50cfb45757436503fbfe39b4a82d9759bd3
                  MATRIX: 797->261|950->319|979->321|1081->396|1107->401|1202->469|1217->475|1278->514|1380->589|1395->595|1479->657|1596->747|1611->753|1674->794|1816->909|1831->915|1870->933|1939->975|1954->981|1990->996|2063->1042|2078->1048|2117->1066|2188->1110|2203->1116|2244->1136|2385->1250|2413->1257|2449->1266|2564->1354|2579->1360|2655->1414|2739->1471|2754->1477|2836->1537|2920->1594|2935->1600|3012->1655|3095->1711|3110->1717|3197->1782|3280->1838|3295->1844|3380->1907
                  LINES: 25->8|30->8|32->10|35->13|35->13|37->15|37->15|37->15|40->18|40->18|40->18|42->20|42->20|42->20|49->27|49->27|49->27|50->28|50->28|50->28|51->29|51->29|51->29|52->30|52->30|52->30|57->35|57->35|58->36|61->39|61->39|61->39|62->40|62->40|62->40|63->41|63->41|63->41|64->42|64->42|64->42|65->43|65->43|65->43
                  -- GENERATED --
              */
          