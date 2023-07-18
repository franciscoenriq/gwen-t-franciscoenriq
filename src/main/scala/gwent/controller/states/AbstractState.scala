package cl.uchile.dcc
package gwent.controller.states

import gwent.controller.GameController

import scala.collection.mutable.ArrayBuffer
import scala.util.Random
abstract class AbstractState(private var context: GameController) extends State {
   

  override def setContext(gameController: GameController): Unit = {
    context = gameController
  }
  override  def init(): Unit = {
    println("metodo invalido")
  }



}
