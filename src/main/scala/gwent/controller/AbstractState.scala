package cl.uchile.dcc
package gwent.controller
import gwent.controller.GameController
import scala.util.Random
import scala.collection.mutable.ArrayBuffer
abstract class AbstractState(private var context: GameController) extends State {
   

  override def setContext(gameController: GameController): Unit = {
    context = gameController
  }
  override  def init(): Unit = {
    println("metodo invalido")
  }



}
