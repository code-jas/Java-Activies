// Inheritance Class - child class na iinherit si parent class na si Mammal
public class Bat extends Mammal {

   // Default Constructor
   public Bat() {
      super.setEnergyLevel(300);
   }

   // Constructor with parameter
   public Bat(int energyLevel) {
      super(energyLevel);
   }

   // function of fly
   public void fly() {
      int loseEnergy = 50;
      int newEnergyLevel = this.getEnergyLevel() - loseEnergy;
      this.setEnergyLevel(newEnergyLevel);
      System.out.println("The bat taking off that sounds like: \"clicks! clicks! clicks! clicks! clicks!\"" +
            "\nBat decreased the energy level by " + loseEnergy + " (-" + loseEnergy + ")" +
            "\nThe Bat energy level now is " + this.getEnergyLevel());
   }

   // function of eatHumans
   public void eatHumans() {
      int gainEnergy = 25;
      int newEnergyLevel = this.getEnergyLevel() + gainEnergy;
      this.setEnergyLevel(newEnergyLevel);
      System.out.println(
            "Bat increased the energy level by " + gainEnergy + " (+" + gainEnergy + ")" +
                  "\nThe Bat energy level now is " + this.getEnergyLevel());
   }

   // function of attackTowns
   public void attackTowns() {
      int loseEnergy = 100;
      int newEnergyLevel = this.getEnergyLevel() - loseEnergy;
      this.setEnergyLevel(newEnergyLevel);
      System.out.println("\"snip-snap-whoosh! snip-snap-whoosh! snip-snap-whoosh!\"" +
            "\nBat decreased the energy level by " + loseEnergy + " (-" + loseEnergy + ")" +
            "\nThe Bat energy level now is " + this.getEnergyLevel());
   }

}
