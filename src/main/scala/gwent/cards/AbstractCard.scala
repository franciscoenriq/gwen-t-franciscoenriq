package cl.uchile.dcc
package gwent.cards
import scala.collection.mutable.ArrayBuffer
/**
 * Clase padre para cada carta del juego , cada una debe ser implementada con el trait
 * Cards.
 * @param name : nombre de la carta
 */
abstract class AbstractCard(private val name:String) extends Cards  {
  def getName(): String = {
    this.name
  }

}
