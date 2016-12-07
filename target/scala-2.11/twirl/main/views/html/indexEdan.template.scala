
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object indexEdan_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class indexEdan extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("SED")/*3.13*/(webJarAssets)/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
"""),format.raw/*4.1*/("""<div ng-controller="edCtrl">

    <div>
        <div class="row app-header">
            <!-- Employee search -->
        <div class="col-sm-4 col-md-4 col-lg-4">
            <input class="form-control" style="width: 100%;" type="text" ng-model="searchEdan" placeholder="Buscar ..."/>
        </div>
            <!-- Alert messages -->
            <div class="col-sm-4 col-md-4 col-lg-4">
                <div ng-repeat="alert in alerts">
                <notification ng-model="alert"></notification>
                </div>
            </div>

        <div class="col-sm-4 col-md-4 col-lg-4">
          <botton class="btn btn-success btn-sm add-button" style="font-weight: 600;" data-toggle="modal" data-target="#nuevoEdanModal">Agregar Ficha Edan</botton>
        </div>
        </div>
     </div>
    <hr>

    """),_display_(/*26.6*/views/*26.11*/.html.edan.edanList()),format.raw/*26.32*/("""
    """),_display_(/*27.6*/views/*27.11*/.html.edan.nuevoEdanForm()),format.raw/*27.37*/("""
    """),_display_(/*28.6*/views/*28.11*/.html.edan.editarEdanForm()),format.raw/*28.38*/("""

"""),format.raw/*30.1*/("""</div>
""")))}),format.raw/*31.2*/("""

"""),format.raw/*33.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*33.46*/routes/*33.52*/.Assets.versioned("stylesheets/formulario.css")),format.raw/*33.99*/("""">
<script type="text/javascript" src=""""),_display_(/*34.38*/routes/*34.44*/.Assets.versioned("javascripts/cedan.js")),format.raw/*34.85*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*35.38*/routes/*35.44*/.Assets.versioned("javascripts/formulario.js")),format.raw/*35.90*/(""""></script>"""))
      }
    }
  }

  def render(webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(webJarAssets)

  def f:((WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (webJarAssets) => apply(webJarAssets)

  def ref: this.type = this

}


}

/**/
object indexEdan extends indexEdan_Scope0.indexEdan
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 18:11:15 CST 2016
                  SOURCE: /home/desconocido/Documentos/Grupo21_Proyecto10/Proyecto10GRUPO21/app/views/indexEdan.scala.html
                  HASH: e22f021bae1932085428d2964f5e8af8160a1a4e
                  MATRIX: 541->1|664->29|692->32|711->43|733->57|772->59|799->60|1640->875|1654->880|1696->901|1728->907|1742->912|1789->938|1821->944|1835->949|1883->976|1912->978|1950->986|1979->988|2051->1033|2066->1039|2134->1086|2201->1126|2216->1132|2278->1173|2354->1222|2369->1228|2436->1274
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|28->4|50->26|50->26|50->26|51->27|51->27|51->27|52->28|52->28|52->28|54->30|55->31|57->33|57->33|57->33|57->33|58->34|58->34|58->34|59->35|59->35|59->35
                  -- GENERATED --
              */
          