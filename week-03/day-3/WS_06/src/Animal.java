public class Animal {

  int hunger;
  int thirst;

  public Animal () {
    hunger = 50;
    thirst = 50;
  };

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public int eat() {
    return hunger -= 1;
  }

  public int drink(){
    return thirst -= 1;
  }

  public void play(){
    hunger += 1;
    thirst += 1;
  }

  public static void main(String[] args) {
    Animal animal = new Animal();
    System.out.println(animal.hunger);
    System.out.println(animal.thirst);

    System.out.println(animal.eat());
    System.out.println(animal.drink());
    animal.play();
    System.out.println(animal.hunger);
    System.out.println(animal.thirst);

    }
  }
