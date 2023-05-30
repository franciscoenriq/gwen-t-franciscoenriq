package cl.uchile.dcc
package gwent.cards

import gwent.player.{AbstractPlayer, playerMethods}

class DistanceCard(private val name:String,private val force:Int) extends AbstractUnitCard(name,force){

  override def toString = s"DistanceCard(name=$name,force=$force)"
  override def equals(obj: Any): Boolean = {
    if (this.getClass().getName == obj.getClass.getName) {
      val otherCpuPlayer = obj.asInstanceOf[DistanceCard]
      this.name == otherCpuPlayer.name
    } else false
  }

  override def play(jugador: playerMethods): Unit = {
    jugador.jugarCartaEnDistancia(this)
  }

}
