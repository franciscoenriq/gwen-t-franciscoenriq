package cl.uchile.dcc
package gwent.controller.factoria

import gwent.cards.{Cards, ClimateCard}

import scala.util.Random
class climateCardFactory extends CardFactory {
  def generarStringAzar(longitud: Int): String = {
    val caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    val random = new Random()
    val sb = new StringBuilder()

    for (_ <- 1 to longitud) {
      val indice = random.nextInt(caracteres.length)
      sb.append(caracteres.charAt(indice))
    }
    sb.toString()
  }
  override def create(): Cards = {
    new ClimateCard(generarStringAzar(4))
  }
}
