package cl.uchile.dcc
package gwent.controller.states

import gwent.controller.GameController
trait State {
  def setContext(gameController: GameController): Unit = {}
  def getContext():GameController
  def init(): Unit = {}
  def takeCard():Unit={}

  def playCard(i:Int): Unit = {}
  def passTurn(): Unit = {}
  def finalizarTurno(): Unit = {}
  def takeCardInit():Unit={}
  def endGame():Unit={}
}
