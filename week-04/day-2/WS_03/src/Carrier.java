import java.util.ArrayList;

public class Carrier {

  private String name;
  private ArrayList<Aircraft> aircrafts;
  private double storeOfAmmo;
  private double initialAmmo;
  private double healthPoint;

  public Carrier(String name, double initialAmmo, double healthPoint) {
    this.name = name;
    this.storeOfAmmo = 500;
    this.aircrafts = new ArrayList<>();
    this.initialAmmo = initialAmmo;
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public void fill() {
    for (int i = 0; i < aircrafts.size() ; i++) {
      aircrafts.get(i).refill(aircrafts.get(i).getAmmoMax()-aircrafts.get(i).getAmmoStore());
      storeOfAmmo -= aircrafts.get(i).getAmmoMax()-aircrafts.get(i).getAmmoStore();

//      If there is not enough ammo than it should start to fill the aircraftis with priority first
//      If there is no ammo when this method is called it should throw an exception

    }
  }

  public void fight(Carrier targetCarrier) {
    double aircraftDamage = 0;
    for (int i = 0; i < aircrafts.size(); i++) {
      aircraftDamage += aircrafts.get(i).fight();
    }
    targetCarrier.healthPoint -= aircraftDamage;

    for (int i = 0; i < aircrafts.size(); i++) {
      aircrafts.get(i).setAmmoStore(0);
    }
  }

  public void getStatus() {

    double aircraftDamage = 0;
    for (int i = 0; i < aircrafts.size(); i++) {
      aircraftDamage += aircrafts.get(i).fight();
    }

    System.out.println("HP: " + healthPoint + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: "
        + storeOfAmmo + ", Total damage: " + aircraftDamage);

    for (int i = 0; i < aircrafts.size() ; i++) {
      System.out.println("Type " + aircrafts.get(i).getType() + ", Ammo: "
          + aircrafts.get(i).getAmmoStore() + ", Base Damage: "
          + aircrafts.get(i).getDamageBase() + ", All Damage: "
          + ((aircrafts.get(i).getDamageBase() * aircrafts.get(i).getAmmoStore()))
      );

    }

  }

}
