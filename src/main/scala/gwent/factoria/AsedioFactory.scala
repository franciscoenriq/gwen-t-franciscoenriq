package cl.uchile.dcc
package gwent.controller.factoria
import gwent.controller.factoria.CardFactory
import gwent.cards.Cards
import gwent.cards.AsedioCard 
import scala.util.Random
class AsedioFactory extends CardFactory {

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
      new AsedioCard(generarStringAzar(4),generarNumeroAleatorio())
    }
}
