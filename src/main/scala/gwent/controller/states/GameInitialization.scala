package cl.uchile.dcc
package gwent.controller.states

import gwent.cards.{Cards, ClimateCard}
import gwent.controller.GameController
import gwent.controller.factoria.{CardFactory, CuerpoCuerpoFactory, DistanceCardFactory, climateCardFactory}
import gwent.controller.states.AbstractState

import scala.util.Random
class GameInitialization(private var context: GameController) extends AbstractState(context) {
    

    private var cardFactory: CardFactory = null

    def setFactory(i: CardFactory): Unit = {
        cardFactory = i
    }
    override def init(): Unit = {
        
        setFactory(new climateCardFactory())
        for( i <- 1 to 10){
            context.getJugador1().getDeckOfCards().append(cardFactory.create())
            context.getJugador2Cpu().getDeckOfCards().append(cardFactory.create())
        }
        setFactory(new CuerpoCuerpoFactory())
        for( i <- 1 to 5 ){
            context.getJugador1().getDeckOfCards().append(cardFactory.create())
            context.getJugador2Cpu().getDeckOfCards().append(cardFactory.create())
        }
        setFactory(new DistanceCardFactory())
        for (i <- 1 to 5) {
            context.getJugador1().getDeckOfCards().append(cardFactory.create())
            context.getJugador2Cpu().getDeckOfCards().append(cardFactory.create())
        }
        setFactory(new CuerpoCuerpoFactory())
        for (i <- 1 to 5) {
            context.getJugador1().getDeckOfCards().append(cardFactory.create())
            context.getJugador2Cpu().getDeckOfCards().append(cardFactory.create())
        }
        
        //TODO HACER QUE LOS ARREGLOS DE CARTAS DEL MAZO PUEDAN REVUELTAS UNAS VEZ QUE SE SETTEAN  
        

    }
}
