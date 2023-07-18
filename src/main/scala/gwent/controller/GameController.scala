package cl.uchile.dcc
package gwent.controller

import scala.collection.mutable.ArrayBuffer
import gwent.cards.Cards
import gwent.player.UserPlayer
import gwent.player.CpuPlayer
import gwent.battlefield.Tablero
import gwent.player.playerMethods
import cl.uchile.dcc.gwent.controller.GameInitialization
class GameController(){
   private var gameState :State = new GameInitialization(this)

   /**
    * variables necesarias para inicializar correctamente a los jugadores.
    * Creamos tanto mazos como manos y tableros necesarios para jugar.
    */
   private var handPlayer: ArrayBuffer[Cards] = new ArrayBuffer[Cards]
   private var handCPU: ArrayBuffer[Cards] = new ArrayBuffer[Cards]

   private var deckOfCardsPlayer: ArrayBuffer[Cards] = new ArrayBuffer[Cards]
   private var deckOfCardsCPU: ArrayBuffer[Cards] = new ArrayBuffer[Cards]

   private var tableroPlayer:Tablero = new Tablero()
   private var tableroCpu:Tablero = new Tablero()

   /**  ------------------------------------------------------------------
    */
   private var jugador1: UserPlayer =  new UserPlayer("juanito",2,deckOfCardsPlayer,handPlayer,tableroPlayer)
   private var jugador2Cpu: CpuPlayer =  new CpuPlayer("juancho",2,deckOfCardsCPU,handCPU,tableroCpu)
   
   def setJugador1(jugador:UserPlayer): Unit = {
      jugador1 = jugador
   }
   def setJugador2Cpu(jugador:CpuPlayer): Unit = {
      jugador2Cpu = jugador
   }
   def getJugador1(): playerMethods = {
      jugador1 
   }
   def getJugador2Cpu():playerMethods = {
      jugador2Cpu
   }

   //---------------------------------------------------------------------

    def setState(state: State): Unit = {
      this.gameState = state 
      this.gameState.setContext(this)
   }
   def gameInit(): Unit = {
      gameState.init()
   }








}
