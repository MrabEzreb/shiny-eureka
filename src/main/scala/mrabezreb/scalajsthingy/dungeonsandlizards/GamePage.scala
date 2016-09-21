package mrabezreb.scalajsthingy.dungeonsandlizards

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import mrabezreb.scalajsthingy.Bootstrap
import scalatags.JsDom
import scalatags.JsDom.all._
import org.scalajs.dom.html
import scala.scalajs.js.annotation.JSExport

object GamePage extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }
  def setupUI(): Unit = {
    Bootstrap()
    jQuery("body").append(h1("H1 HIELLO WORLDOIAN").render)
    createLoadingBar(10f)
    var i = 10
    while (i > 0) {
      jQuery("body").append("<script>window.setTimeout(function() {mrabezreb.scalajsthingy.dungeonsandlizards.GamePage().updateLoadingBar(" + i + ", \"message 1234 " + i + "\")}, " + i*1000 + ")</script>")
      i -= 1
    }
    jQuery("body").append("<script>window.setTimeout(function() {mrabezreb.scalajsthingy.dungeonsandlizards.GamePage().removeLoadingBar()}, 15000)</script>")
  }
  var max1 = -1f
  def createLoadingBar(max: Float): Unit = {
    val p123 = p(style:="font-size: 50px; height: 50px; position: absolute; bottom: 55%; text-align: center; width: 100%;",id:="mainloadingp")()
    val loadingBar = div(cls:="progress",style:="left: 15%; width: 70%; height: 50px; position: absolute; top: 50%")(div(cls:="progress-bar progress-bar-info",id:="mainloading",style:="line-height: 50px; font-size: 40px; color: black;",attr("role"):="progressbar",attr("aria-valuenow"):="0",attr("aria-valuemin"):="0",attr("aria-valuemax"):=max.toString())())
    val cover = div(style:="position: absolute; width: 100%; height: 100%; background: white;",id:="cover123")(p123, loadingBar)
    jQuery("body").prepend(cover.render)
    max1 = max
  }
  @JSExport
  def updateLoadingBar(progress: Int, message: String): Unit = {
    jQuery("#mainloading").css("width", (progress / max1) * 100 + "%")
    jQuery("#mainloadingp").html(message)
  }
  @JSExport
  def removeLoadingBar(): Unit = {
    jQuery("#cover123").fadeTo(2000, 0, { () => jQuery("#cover123").remove() })
  }
}