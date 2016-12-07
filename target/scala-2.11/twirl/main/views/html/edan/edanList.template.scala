
package views.html.edan

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edanList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class edanList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<table class="table table-hover">
    <thead>
    <th>Evento</th>
    <th>Direccion</th>
    <th>Departamento</th>
    <th>Vias de Acceso Terrestre</th>
    <th>Ruta Alterna</th>
    <th>Punto de Referencia</th>
    <th>Albergados</th>
    <th>Evacuados</th>
    <th>Fallecidos</th>
    <th></th>
    <th></th>
    </thead>
    <tbody>
    <tr ng-repeat="eds in fichas | filter: searchEdan">
        <td>"""),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""{"""),format.raw/*17.15*/("""eds.evento"""),format.raw/*17.25*/("""}"""),format.raw/*17.26*/("""}"""),format.raw/*17.27*/("""</td>
        <td>"""),format.raw/*18.13*/("""{"""),format.raw/*18.14*/("""{"""),format.raw/*18.15*/("""eds.direccion"""),format.raw/*18.28*/("""}"""),format.raw/*18.29*/("""}"""),format.raw/*18.30*/("""</td>
        <td>"""),format.raw/*19.13*/("""{"""),format.raw/*19.14*/("""{"""),format.raw/*19.15*/("""eds.departamento"""),format.raw/*19.31*/("""}"""),format.raw/*19.32*/("""}"""),format.raw/*19.33*/("""</td>
        <td>"""),format.raw/*20.13*/("""{"""),format.raw/*20.14*/("""{"""),format.raw/*20.15*/("""eds.vterrestre"""),format.raw/*20.29*/("""}"""),format.raw/*20.30*/("""}"""),format.raw/*20.31*/("""</td>
        <td>"""),format.raw/*21.13*/("""{"""),format.raw/*21.14*/("""{"""),format.raw/*21.15*/("""eds.rutaalterna"""),format.raw/*21.30*/("""}"""),format.raw/*21.31*/("""}"""),format.raw/*21.32*/("""</td>
        <td>"""),format.raw/*22.13*/("""{"""),format.raw/*22.14*/("""{"""),format.raw/*22.15*/("""eds.puntoreferencia"""),format.raw/*22.34*/("""}"""),format.raw/*22.35*/("""}"""),format.raw/*22.36*/("""</td>
        <td>"""),format.raw/*23.13*/("""{"""),format.raw/*23.14*/("""{"""),format.raw/*23.15*/("""eds.albergados"""),format.raw/*23.29*/("""}"""),format.raw/*23.30*/("""}"""),format.raw/*23.31*/("""</td>
        <td>"""),format.raw/*24.13*/("""{"""),format.raw/*24.14*/("""{"""),format.raw/*24.15*/("""eds.evacuados"""),format.raw/*24.28*/("""}"""),format.raw/*24.29*/("""}"""),format.raw/*24.30*/("""</td>
        <td>"""),format.raw/*25.13*/("""{"""),format.raw/*25.14*/("""{"""),format.raw/*25.15*/("""eds.fallecidos"""),format.raw/*25.29*/("""}"""),format.raw/*25.30*/("""}"""),format.raw/*25.31*/("""</td>
        <td>
            <i title="Edit" style="color: #128d36;" data-toggle="modal" data-target="#editarEdanModal" class="glyphicon glyphicon-edit cursorPointer" ng-click="editEdan(eds)">
            </i>
        </td>
        <td>
            <i title="Delete" style="color: #d85010;" class="glyphicon glyphicon-trash cursorPointer" ng-confirm-message="Seguro que desea borrar?" ng-confirm-click="deleteEdan(eds.id)">
            </i>
        </td>
    </tr>
    </tbody>
</table>

<p style="color: rgb(110, 114, 114)">Mostrando <strong style="color: rgb(42, 41, 41);">"""),format.raw/*38.88*/("""{"""),format.raw/*38.89*/("""{"""),format.raw/*38.90*/(""" """),format.raw/*38.91*/("""(fichas | filter:searchEdan).length """),format.raw/*38.127*/("""}"""),format.raw/*38.128*/("""}"""),format.raw/*38.129*/("""</strong> de <strong style="color: rgb(16, 106, 135);">"""),format.raw/*38.184*/("""{"""),format.raw/*38.185*/("""{"""),format.raw/*38.186*/("""fichas.length"""),format.raw/*38.199*/("""}"""),format.raw/*38.200*/("""}"""),format.raw/*38.201*/("""</strong> Registros</p>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object edanList extends edanList_Scope0.edanList
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 18:11:15 CST 2016
                  SOURCE: /home/desconocido/Documentos/Grupo21_Proyecto10/Proyecto10GRUPO21/app/views/edan/edanList.scala.html
                  HASH: 825b5039191c54ad70bd17de16dd932bd51606f0
                  MATRIX: 620->0|1052->404|1081->405|1110->406|1148->416|1177->417|1206->418|1252->436|1281->437|1310->438|1351->451|1380->452|1409->453|1455->471|1484->472|1513->473|1557->489|1586->490|1615->491|1661->509|1690->510|1719->511|1761->525|1790->526|1819->527|1865->545|1894->546|1923->547|1966->562|1995->563|2024->564|2070->582|2099->583|2128->584|2175->603|2204->604|2233->605|2279->623|2308->624|2337->625|2379->639|2408->640|2437->641|2483->659|2512->660|2541->661|2582->674|2611->675|2640->676|2686->694|2715->695|2744->696|2786->710|2815->711|2844->712|3449->1289|3478->1290|3507->1291|3536->1292|3601->1328|3631->1329|3661->1330|3745->1385|3775->1386|3805->1387|3847->1400|3877->1401|3907->1402
                  LINES: 25->1|41->17|41->17|41->17|41->17|41->17|41->17|42->18|42->18|42->18|42->18|42->18|42->18|43->19|43->19|43->19|43->19|43->19|43->19|44->20|44->20|44->20|44->20|44->20|44->20|45->21|45->21|45->21|45->21|45->21|45->21|46->22|46->22|46->22|46->22|46->22|46->22|47->23|47->23|47->23|47->23|47->23|47->23|48->24|48->24|48->24|48->24|48->24|48->24|49->25|49->25|49->25|49->25|49->25|49->25|62->38|62->38|62->38|62->38|62->38|62->38|62->38|62->38|62->38|62->38|62->38|62->38|62->38
                  -- GENERATED --
              */
          