package cl.uchile.dcc
package gwent.cards

import gwent.player.playerMethods

class CuerpoACuerpoCard(private val name: String, private val force:Int) extends AbstractUnitCard(name,force) {

  override def toString = s"HandToHandCard(name=$name,force=$force)"
  override def equals(obj: Any): Boolean = {
    if (this.getClass().getName == obj.getClass.getName) {
      val otherCpuPlayer = obj.asInstanceOf[CuerpoACuerpoCard]
      this.name == otherCpuPlayer.name
    } else false
  }

  override def play(jugador: playerMethods): Unit = {
    jugador.jugarCartaEnCuerpoCuerpo(this)
  }
}
