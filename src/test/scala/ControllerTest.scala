package cl.uchile.dcc

import cl.uchile.dcc.gwent.controller.GameController
import cl.uchile.dcc.gwent.controller.states.PlayerInit
import munit.FunSuite
import munit.Clue.generate

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.util
import scala.util.Random

class ControllerTest extends FunSuite{
  var controller = new GameController()
  val array :ArrayBuffer[Int] = new ArrayBuffer[Int]()
  array.append(2)
  array.append(4)
  array.append(7)
  test("vemos que sucedeee"){
    controller.gameInit()

    println(controller.getJugador1().getDeckOfCards())
    println(controller.getJugador2Cpu().getDeckOfCards())

    println(controller.getState())


  }
}
