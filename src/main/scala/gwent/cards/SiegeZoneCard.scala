package cl.uchile.dcc
package gwent.cards


class SiegeZoneCard(private val name:String,private val force:Int) extends AbstractUnitCard(name, force) {
  private val dni:String =""
  override def toString = s"SiegeZone()"

  override def equals(obj: Any): Boolean = {
    if (this.getClass().getName == obj.getClass.getName) {
      val otherCpuPlayer = obj.asInstanceOf[SiegeZoneCard]
      this.name == otherCpuPlayer.name
    } else false
  }
}
