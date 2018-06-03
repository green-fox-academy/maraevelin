package animal_shelter;

public class Animal{
  private String name;
  private boolean isHealthy;
  private int healCost;

  public Animal() {
    this.name = getClass().getSimpleName();
    this.isHealthy = false;
    this.healCost = getHealCost();
  }

  public Animal(String name) {
    setName(name);
  }

  public void heal() {
    setHealthy(true);
  }

  public boolean isAdoptable() {
    if (isHealthy()) {
      return true;
    } return false;
  }

  public String toString() {
    if (isAdoptable()) {
      return getName() + " is healthy and adoptable\n";
    }
    return getName() + " is neither healthy (" + healCost + "€) nor adoptable\n";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isHealthy() {
    return isHealthy;
  }

  public void setHealthy(boolean healthy) {
    isHealthy = healthy;
  }

  public int getHealCost() {
    return healCost;
  }

  public void setHealCost(int healCost) {
    this.healCost = healCost;
  }

}
