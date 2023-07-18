package cl.uchile.dcc
package gwent.controller.factoria

import gwent.cards.Cards
trait CardFactory {
  def create(): Cards 
}
