package cl.uchile.dcc
package gwent.controller.states

import gwent.controller.GameController

import scala.collection.mutable.ArrayBuffer
import scala.util.Random
abstract class AbstractState(private var context: GameController) extends State {
  override def setContext(gameController: GameController): Unit = {
    context = gameController
  }
  override def getContext():GameController ={
    context
  }
  override  def init(): Unit = {
    println("metodo invalido")
  }
  override def playCard(i:Int):Unit={
    println("metodo invalido papito")
  }

  override def takeCard(): Unit = {
    println(s"metodo invalido")
  }

  override def passTurn(): Unit ={
    println("meotdo invalido")
  }

  override def finalizarTurno(): Unit = {
    println("meotdo invalido")
  }
  override def takeCardInit():Unit = {
    println("meotdo invalido")
  } 
  override  def endGame():Unit={
    println("metodo invalido")
  }
}
