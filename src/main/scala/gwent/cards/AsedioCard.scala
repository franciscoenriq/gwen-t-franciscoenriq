package cl.uchile.dcc
package gwent.cards

import gwent.player.{AbstractPlayer, playerMethods}


class AsedioCard(private val name:String, private val force:Int) extends AbstractUnitCard(name, force) {
  private val dni:String =""
  override def toString = s"SiegeZone(name=$name,force=$force)"

  override def equals(obj: Any): Boolean = {
    if (this.getClass().getName == obj.getClass.getName) {
      val otherCpuPlayer = obj.asInstanceOf[AsedioCard]
      this.name == otherCpuPlayer.name
    } else false
  }
  override def play(jugador:playerMethods): Unit = {
    jugador.jugarCartaEnAsedio(this)
  }
}
