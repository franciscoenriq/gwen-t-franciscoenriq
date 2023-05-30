package cl.uchile.dcc
package gwent.cards

import gwent.player.{AbstractPlayer, playerMethods}

class ClimateCard(private val name: String) extends AbstractCard(name){



  override def toString = s"ClimateCard(name=$name)"
  override def equals(obj: Any): Boolean = {
    if (this.getClass().getName == obj.getClass.getName) {
      val otherCpuPlayer = obj.asInstanceOf[ClimateCard]
      this.name == otherCpuPlayer.name
    } else false
  }

  override def play(jugador: playerMethods ): Unit = {
    jugador.jugarCartaEnClima(this)
  }

}
