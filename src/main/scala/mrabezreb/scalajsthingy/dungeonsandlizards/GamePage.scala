package mrabezreb.scalajsthingy.dungeonsandlizards

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import mrabezreb.scalajsthingy.Bootstrap
import scalatags.JsDom
import scalatags.JsDom.all._
import org.scalajs.dom.html

object GamePage extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }
  def setupUI(): Unit = {
    Bootstrap()
  }
}