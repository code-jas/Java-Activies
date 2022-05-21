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

   public void attack(Human human) {
      human.health -= this.getStrength();
      System.out.println("Attacked!!!");
      System.out.println("Damage: " + this.getStrength());
      System.out.println("The damaged  attacked human has " + human.getHealth() + " health left.");
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
