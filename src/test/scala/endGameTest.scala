package cl.uchile.dcc

import gwent.controller.GameController

import cl.uchile.dcc.gwent.controller.states.{EndGame, PlayerInit}

class endGameTest  extends munit.FunSuite{
  val gameController: GameController = new  GameController( )
  val endGame: EndGame = new EndGame(gameController)
  val playeInit:PlayerInit = new PlayerInit(gameController)
  test("testeo"){
    assertEquals(endGame.equals(playeInit) ,false)
    println(endGame.takeCard())
  }
}
