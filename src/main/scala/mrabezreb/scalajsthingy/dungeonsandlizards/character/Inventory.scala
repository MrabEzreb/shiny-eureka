package mrabezreb.scalajsthingy.dungeonsandlizards.character

import org.scalajs.dom.html
import mrabezreb.scalajsthingy.dungeonsandlizards.character.item.Item
import mrabezreb.scalajsthingy.dungeonsandlizards.Renderable

abstract class Inventory extends Renderable {
  def apply(index: Int): Item
}