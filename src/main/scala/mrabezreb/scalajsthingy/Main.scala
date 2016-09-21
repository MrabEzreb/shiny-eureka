package mrabezreb.scalajsthingy

import scala.scalajs.js.JSApp
import org.scalajs.dom
import scalatags.JsDom.all._
import dom.document
import org.scalajs.jquery.jQuery
import scala.scalajs.js.annotation.JSExport
import mrabezreb.scalajsthingy.dungeonsandlizards.GamePage

object Main extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }
  def setupUI(): Unit = {
    Bootstrap()
    jQuery("head").append("<style>.btn-circle {text-align: center; border-radius: 50%; padding: 0;}</style>")
    jQuery("body").append(p("Hello, World!").render)
    jQuery("body").append(a(id:="hei", style:="width: 100px; height: 100px; line-height: 100px; background: red; font-size: 50px;", onclick:= {() => addClickedMessage() }, cls:="btn btn-default btn-circle")(span(cls:="glyphicon glyphicon-warning-sign")).render)
//    "Click the BIG RED BUTTON"
//    jQuery("#hei").click(addClickedMessage _)
  }
  var times = 0
  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>you click big red button you go boom</p>")
//    jQuery("body").append("<div style='position: fixed;' id='img"+times+"'><img src='http://bestanimations.com/Military/Explosions/fire-explosion-animation-3-s.gif' width='500' height='500' loop='1'><script>setTimeout(function() {$('#img"+times+"').remove()}, 1000)</script></div>")
  }
}