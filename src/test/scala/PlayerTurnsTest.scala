package cl.uchile.dcc

import gwent.controller.GameController

import cl.uchile.dcc.gwent.controller.states.{EndGame, PlayerCpuInit, PlayerCpuTurn, PlayerInit, PlayerTurn}

class PlayerTurnsTest  extends munit.FunSuite{
  val gameController: GameController = new GameController()
  val endGame: EndGame = new EndGame(gameController)
  val playeInit: PlayerInit = new PlayerInit(gameController)
  val playerTurn  :PlayerTurn= new PlayerTurn(gameController)
  test("testeo"){
    assertEquals(playeInit.equals(endGame),false)
    assertEquals(playerTurn.equals(endGame),false)
    gameController.setState(playeInit)
    gameController.finalizarTurno()
    val cpuTurnInit:PlayerCpuInit = new PlayerCpuInit(gameController)
    assertEquals(gameController.getState().equals(cpuTurnInit),true)
  }
  test("testeando otras transiciones") {
    gameController.setState(playerTurn)
    gameController.finalizarTurno()
    var playerCpuTurn:PlayerCpuTurn = new PlayerCpuTurn(gameController)
    assertEquals(gameController.getState().equals(playerCpuTurn),true)
  }
  test("testeando otras transiciones") {
    gameController.setState(playerTurn)
    gameController.endGame()
    val endGame1: EndGame = new EndGame(gameController)
    assertEquals(gameController.getState().equals(endGame1), true)
  }
}
