package cl.uchile.dcc
package gwent.player

import gwent.cards.AbstractCard

trait playerMethods {
  def takeCard():Unit
  def playCard(i:Int):AbstractCard
}
