package aircraftcarrier;

public class Aircraft {
  int maxAmmo;
  int currentAmmo;
  int baseDmg;
  int totalDmg;
  String type;

  public Aircraft() {
    totalDmg = 0;
    currentAmmo = 0;
  }

  int fight() {
    int ammoUsed = this.currentAmmo;
    this.currentAmmo = 0;
    int damage = ammoUsed * this.baseDmg;
    totalDmg += damage;
    return damage;
  }

  boolean needsRefill () {
    return this.currentAmmo < this.maxAmmo;
  }

  public int refill(int fillAmmo) {
    int remainingAmmo = fillAmmo;

    if (this.needsRefill()) {
      remainingAmmo = fillAmmo - this.maxAmmo;
      this.currentAmmo = this.maxAmmo;
    }
    return remainingAmmo;
  }

  String getType() {
    String type = this.type;
    return type;
  }

  void getStatus() {
    System.out.println(("Type: " + this.getType() + ", Ammo: " + this.currentAmmo + ", Base Damage: " + this.baseDmg + ", All Damage: " + this.totalDmg));
    System.out.println();
  }


}
