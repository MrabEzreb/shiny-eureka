package mrabezreb.scalajsthingy.dungeonsandlizards.character.item

trait Equippable extends Item {
  def equip(): String
}