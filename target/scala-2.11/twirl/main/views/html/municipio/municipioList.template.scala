
package views.html.municipio

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object municipioList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class municipioList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<table class="table table-hover">
    <thead>
    <th>Departamento</th>
    <th>Municipio</th>
    <th></th>
    <th></th>
    </thead>
    <tbody>
    <tr ng-repeat="muni in muns | filter: searchMunicipio">
        <td>"""),format.raw/*10.13*/("""{"""),format.raw/*10.14*/("""{"""),format.raw/*10.15*/("""muni.departamentoid"""),format.raw/*10.34*/("""}"""),format.raw/*10.35*/("""}"""),format.raw/*10.36*/("""</td>
        <td>"""),format.raw/*11.13*/("""{"""),format.raw/*11.14*/("""{"""),format.raw/*11.15*/("""muni.nombre"""),format.raw/*11.26*/("""}"""),format.raw/*11.27*/("""}"""),format.raw/*11.28*/("""</td>
    </tr>
    </tbody>
</table>

<p style="color: rgb(110, 114, 114)">Mostrando <strong style="color: rgb(42, 41, 41);">"""),format.raw/*16.88*/("""{"""),format.raw/*16.89*/("""{"""),format.raw/*16.90*/(""" """),format.raw/*16.91*/("""(muns | filter:searchMunicipio).length """),format.raw/*16.130*/("""}"""),format.raw/*16.131*/("""}"""),format.raw/*16.132*/("""</strong> de <strong style="color: rgb(16, 106, 135);">"""),format.raw/*16.187*/("""{"""),format.raw/*16.188*/("""{"""),format.raw/*16.189*/("""muns.length"""),format.raw/*16.200*/("""}"""),format.raw/*16.201*/("""}"""),format.raw/*16.202*/("""</strong> Registros</p>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object municipioList extends municipioList_Scope0.municipioList
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 18:11:15 CST 2016
                  SOURCE: /home/desconocido/Documentos/Grupo21_Proyecto10/Proyecto10GRUPO21/app/views/municipio/municipioList.scala.html
                  HASH: 02451c5e070d5fc5a702a80f1989d4889ea25347
                  MATRIX: 635->0|883->220|912->221|941->222|988->241|1017->242|1046->243|1092->261|1121->262|1150->263|1189->274|1218->275|1247->276|1401->402|1430->403|1459->404|1488->405|1556->444|1586->445|1616->446|1700->501|1730->502|1760->503|1800->514|1830->515|1860->516
                  LINES: 25->1|34->10|34->10|34->10|34->10|34->10|34->10|35->11|35->11|35->11|35->11|35->11|35->11|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16
                  -- GENERATED --
              */
          