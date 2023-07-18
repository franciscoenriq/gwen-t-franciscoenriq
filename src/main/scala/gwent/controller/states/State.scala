package cl.uchile.dcc
package gwent.controller.states

import gwent.controller.GameController
trait State {
  def setContext(gameController: GameController): Unit = {}
  def init(): Unit = {}
  def initPlayer()={}
}
