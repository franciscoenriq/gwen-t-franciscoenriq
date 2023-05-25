package cl.uchile.dcc
package gwent.player

import gwent.cards.{AbstractCard, AsedioCard, ClimateCard, CuerpoACuerpoCard, DistanceCard}

trait playerMethods {
  def takeCard():Unit


  /**
   *
   * The next methods are use to implements the
   *
   */
  def playCard(i:Int):Unit
  def jugarCartaEnAsedio(a: AsedioCard): Unit
  def jugarCartaEnCuerpoCuerpo(a: CuerpoACuerpoCard): Unit
  def jugarCartaEnDistancia(a: DistanceCard): Unit
  def jugarCartaEnClima(a: ClimateCard): Unit

}
