
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("SED")/*3.13*/(webJarAssets)/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

"""),format.raw/*5.1*/("""<div ng-controller="munCtrl">

    <div>
        <div class="row app-header">
            <!-- Employee search -->
        <div class="col-sm-4 col-md-4 col-lg-4">
            <input class="form-control" style="width: 70%;" type="text" ng-model="searchMunicipio" placeholder="Buscar ..."/>
        </div>
            <!-- Alert messages -->
            <div class="col-sm-4 col-md-4 col-lg-4">
                <div ng-repeat="alert in alerts">
                <notification ng-model="alert"></notification>
                </div>
            </div>
        </div>
     </div>
    <hr>

    """),_display_(/*23.6*/views/*23.11*/.html.municipio.municipioList()),format.raw/*23.42*/("""

"""),format.raw/*25.1*/("""</div>

""")))}),format.raw/*27.2*/("""

 """),format.raw/*29.2*/("""<script type="text/javascript" src=""""),_display_(/*29.39*/routes/*29.45*/.Assets.versioned("javascripts/cmunicipio.js")),format.raw/*29.91*/(""""></script>
"""))
      }
    }
  }

  def render(webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(webJarAssets)

  def f:((WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (webJarAssets) => apply(webJarAssets)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 18:11:15 CST 2016
                  SOURCE: /home/desconocido/Documentos/Grupo21_Proyecto10/Proyecto10GRUPO21/app/views/index.scala.html
                  HASH: 7ecbb67ec6d2b26b86796b2440eb9a044bcc078b
                  MATRIX: 533->1|656->29|684->32|703->43|725->57|764->59|792->61|1409->652|1423->657|1475->688|1504->690|1543->699|1573->702|1637->739|1652->745|1719->791
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|47->23|47->23|47->23|49->25|51->27|53->29|53->29|53->29|53->29
                  -- GENERATED --
              */
          