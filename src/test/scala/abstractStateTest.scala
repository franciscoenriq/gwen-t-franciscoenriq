package cl.uchile.dcc
import cl.uchile.dcc.gwent.controller.GameController
import cl.uchile.dcc.gwent.controller.states.PlayerInit
import munit.FunSuite
class abstractStateTest extends munit.FunSuite{
  val gameController: GameController = new  GameController( )
  val playerInit:PlayerInit = new PlayerInit(gameController)
  val gameController2:GameController = new GameController()
  test("que pasa"){
  }

}
