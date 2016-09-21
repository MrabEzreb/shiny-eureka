package mrabezreb.scalajsthingy.dungeonsandlizards.character.item

import mrabezreb.scalajsthingy.dungeonsandlizards.Renderable

abstract class Item extends Renderable {
  def name(): String
  def description(): String
}