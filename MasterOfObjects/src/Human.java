public class Human {
   private int strength = 3;
   private int stealth = 3;
   private int intelligence = 3;
   private int health = 100;

   public Human() {
   }

   public Human(int strength, int stealth, int intelligence, int health) {
      this.strength = strength;
      this.stealth = stealth;
      this.intelligence = intelligence;
      this.health = health;
   }

   // attack method
   public void attack(Human human) {
      human.health -= this.getStrength();
      System.out.println("\"Attacked!\"");
      System.out.println("The attacker dealt " + this.getStrength() + " damage with his attack.");
      System.out.println("The target has now " + human.getHealth() + " health.");
      System.out.println();
   }

   public void attack(Knight knight) {
      // knight.health = knight.health - this.getStrength();
      int newHealth;
      System.out.println("\"Attacked!\"");
      System.out.println("The attacker dealt " + this.getStrength() + " damage with his attack.");
      if (!knight.isArmorDestroyed()) {
         System.out.println("Armor is still intact.");
         newHealth = knight.checkArmor(this.getStrength());
      } else {
         System.out.println("Armor Destroyed!!!");

         newHealth = knight.getHealth() - this.getStrength();
      }

      knight.setHealth(newHealth);

      System.out.println(
            "The target has now " + knight.getHealth() + " health and "
                  + knight.getArmor() + " armor.");
      System.out.println();
   }

   public int getStrength() {
      return strength;
   }

   public void setStrength(int strength) {
      this.strength = strength;
   }

   public int getStealth() {
      return stealth;
   }

   public void setStealth(int stealth) {
      this.stealth = stealth;
   }

   public int getIntelligence() {
      return intelligence;
   }

   public void setIntelligence(int intelligence) {
      this.intelligence = intelligence;
   }

   public int getHealth() {
      return health;
   }

   public void setHealth(int health) {
      this.health = health;
   }
}
