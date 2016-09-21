package mrabezreb.scalajsthingy.dungeonsandlizards.character

import org.scalajs.dom.html
import mrabezreb.scalajsthingy.dungeonsandlizards.Renderable

abstract class Character extends Renderable {
  def inventory(): Inventory
}