package cl.uchile.dcc
package gwent.controller.factoria
import gwent.cards.Cards
import gwent.cards.CuerpoACuerpoCard
import gwent.controller.factoria.CardFactory
import scala.util.Random
import gwent.cards.DistanceCard
class DistanceCardFactory extends CardFactory {
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
  def generarNumeroAleatorio(): Int = {
    val random = new Random()
    random.nextInt(20) + 1
  }
  override def create(): Cards = {
    val random = new Random()
    new DistanceCard(generarStringAzar(4), generarNumeroAleatorio())
  }
}
