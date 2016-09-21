package mrabezreb.scalajsthingy.dungeonsandlizards.character.item

import mrabezreb.scalajsthingy.dungeonsandlizards.character.Character

trait Useable extends Item {
  def use(target: Object): String
}