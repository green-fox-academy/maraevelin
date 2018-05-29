public class Aircraft {

  private String type;
  private double ammoMax;
  private double damageBase;
  private double ammoStore;

  public Aircraft() {
    this.type = "aircraft";
    this.ammoMax = 5;
    this.damageBase = 10;
    this.ammoStore = 0;
    System.out.println("Current ammo: " + ammoStore);
  }

  public Aircraft(String type, double ammoMax, double damageBase) {
    this.type = type;
    this.ammoMax = ammoMax;
    this.damageBase = damageBase;
    this.ammoStore = getAmmoStore();
    System.out.println("Current ammo: " + ammoStore);

  }

  public double fight() {
      double damageDealt = getDamageBase() * getAmmoStore();
      setAmmoStore(0);
    return damageDealt;
  }

  public double refill(double plusAmmo) {
    double remainingAmmo = 0;
    if (plusAmmo <=  getAmmoMax() - getAmmoStore()) {
      remainingAmmo = getAmmoStore() + plusAmmo;
    } else {
      remainingAmmo = getAmmoMax() - getAmmoStore();
    }
    return remainingAmmo;
  }

  public String getStatus() {
    String status = "";
    return status = "Type " + getType() + ", Ammo: " + getAmmoStore() + ", Base Damage: " + getDamageBase() + ", All Damage: " + fight();
  }

// PUBLIC BOOLEAN

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getAmmoMax() {
    return ammoMax;
  }

  public void setAmmoMax(double ammoMax) {
    this.ammoMax = ammoMax;
  }

  public double getDamageBase() {
    return damageBase;
  }

  public void setDamageBase(double damageBase) {
    this.damageBase = damageBase;
  }

  public double getAmmoStore() {
    return ammoStore;
  }

  public void setAmmoStore(double ammoStore) {
    this.ammoStore = ammoStore;
  }

}