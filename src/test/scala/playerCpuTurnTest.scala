package cl.uchile.dcc

import gwent.controller.GameController
import gwent.controller.states.{EndGame, PlayerCpuInit, PlayerCpuTurn, PlayerInit, PlayerTurn}


class PlayerCpuTurnTest  extends munit.FunSuite{
  val gameController: GameController = new GameController()
  val endGame: EndGame = new EndGame(gameController)
  val playerCpuInit: PlayerCpuInit = new PlayerCpuInit(gameController)
  val playerCpuTurn  :PlayerCpuTurn= new PlayerCpuTurn(gameController)

  test("testeo"){
    assertEquals(playerCpuInit.equals(endGame),false)
    assertEquals(playerCpuTurn.equals(endGame),false)
    gameController.setState(playerCpuInit)
    gameController.finalizarTurno()
    val playerTurno:PlayerTurn = new PlayerTurn(gameController)
    assertEquals(gameController.getState().equals(playerTurno),true)
  }
  test("testeando otras transiciones") {
    gameController.setState(playerCpuTurn)
    gameController.endGame()
    val endGame1: EndGame = new EndGame(gameController)
    assertEquals(gameController.getState().equals(endGame1), true)
  }
  test("testeando mas transiciones"){
    gameController.setState(playerCpuTurn)
    gameController.finalizarTurno()
    val playerTurno: PlayerTurn = new PlayerTurn(gameController)
    assertEquals(gameController.getState().equals(playerTurno), true)
  }

}

