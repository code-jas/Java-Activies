// Inheritance Class - child class na iinherit si parent class na si Mammal
public class Gorilla extends Mammal {

   // Default Constructor
   public Gorilla() {

   }

   // Constructor with parameter
   public Gorilla(int energyLevel) {
      super(energyLevel); // used to refer immediate parent class object
   }

   // function of throwSomething
   public void throwSomething() {
      int loseEnergy = 5;
      int newEnergyLevel = this.getEnergyLevel() - loseEnergy;
      this.setEnergyLevel(newEnergyLevel);
      System.out.println("The gorilla threw something at the people." +
            "\nGorilla decreased the energy level by " + loseEnergy + " (-" + loseEnergy + ")" +
            "\nThe Gorilla energy level now is " + this.getEnergyLevel());
   }

   // function of eatBananas
   public void eatBananas() {
      int gainEnergy = 10;
      int newEnergyLevel = this.getEnergyLevel() + gainEnergy;
      this.setEnergyLevel(newEnergyLevel);
      System.out.println("The gorilla eat bananas." +
            "\nGorilla increased the energy level by " + gainEnergy + " (+" + gainEnergy + ")" +
            "\nThe Gorilla energy level now is " + this.getEnergyLevel());
   }

   // function of climb
   public void climb() {
      int loseEnergy = 10;
      int newEnergyLevel = this.getEnergyLevel() - loseEnergy;
      this.setEnergyLevel(newEnergyLevel);
      System.out.println("The gorilla climb." +
            "\nGorilla decreased the energy level by " + loseEnergy + " (-" + loseEnergy + ")" +
            "\nThe Gorilla energy level now is " + this.getEnergyLevel());
   }

}
