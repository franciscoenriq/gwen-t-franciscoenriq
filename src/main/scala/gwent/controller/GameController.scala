package cl.uchile.dcc
package gwent.controller

import scala.collection.mutable.ArrayBuffer
import gwent.cards.Cards
import gwent.player.UserPlayer
import gwent.player.CpuPlayer
import gwent.battlefield.Tablero
import gwent.player.playerMethods

import cl.uchile.dcc.gwent.controller.states.{GameInitialization, State}

/**
 * El objetivo del juego es acumular más fuerza en el campo de batalla
 * que el oponente al final de cada ronda.
 * Al finalizar una ronda, el jugador que tenga menos fuerza total en su zona pierde una gema.
 * El juego finaliza cuandoun jugador pierde todas sus gemas
 */
/**
 * GameController funciona en base a estados
 * Dependiendo del estado en que se encuentre este hará una u otra cosa
 * Tendremos un estado inicial incial para poder settear to do lo necesario
 * El primer turno de cada jugador tambien será especial ya que solo por ser este turno
 * el jugador podrá sacar 10 cartas , el resto de turno es especial

 */
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

   def getJugador1(): playerMethods = {
      jugador1 
   }
   def getJugador2Cpu():playerMethods = {
      jugador2Cpu
   }
   def getState(): State = {
      gameState
   }
   //---------------------------------------------------------------------
    def setState(state: State): Unit = {
      this.gameState = state 
      this.gameState.setContext(this)
   }
   /**
    * funciones propias que se tendrán que ejecutar para poder manejar el juego
    *
    */
   /**
    * gameInit podria ser algo así como lo que se ejecuta cuando re aprieta el boton "play"
    * Las funciones payerInit y playerCpuInit van a ser los primeros turnos de cada jugador
    */
   def gameInit(): Unit = {
      gameState.init()
   }
   def takeCard(): Unit = {
      gameState.takeCard()
   }
   def playCard(i:Int): Unit = {
      gameState.playCard(i)
   }
   def passTurn(): Unit = {
      gameState.passTurn()
   }
   def finalizarTurno(): Unit = {
      gameState.finalizarTurno()
   }
   def endGame(): Unit = {
      gameState.endGame()
   }
}
