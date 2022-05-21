
// Parent Class
public class Mammal {
   // Attributes of Mammal - Global variable
   private int energyLevel = 100; // default energy level of mammal

   // Default Constructor
   public Mammal() {
   }

   // Constructor with energy level parameter
   public Mammal(int energyLevel) {
      this.energyLevel = energyLevel;
   }

   // function to display Energy Level and return it
   public int displayEnergy() {
      System.out.println("\nEnergy level : " + this.getEnergyLevel());
      return this.getEnergyLevel();
   }

   // getter of attributes
   public int getEnergyLevel() {
      return energyLevel;
   }

   // setter of attributes
   public void setEnergyLevel(int energyLevel) {
      this.energyLevel = energyLevel;
   }

}
