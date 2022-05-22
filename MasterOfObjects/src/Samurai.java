public class Samurai extends Human {
   private static int counter;

   public Samurai() {
      super.setHealth(200);
      counter++;
   }

   public Samurai(int strength, int stealth, int intelligence, int health) {
      super(strength, stealth, intelligence, health);
      counter++;
   }

   // attack method
   public void deathBlow(Human human) {
      int deathBlowAttack = human.getHealth();
      int consequenceAttack = this.getHealth() / 2;
      human.setHealth(human.getHealth() - deathBlowAttack);
      this.setHealth(this.getHealth() - consequenceAttack);
      System.out.println("\"DeathBlow!!!\"");
      System.out.println("The attacker dealt " + deathBlowAttack + " damage with his attack.");
      System.out.println("The target was killed by " + deathBlowAttack + " damage.");
      System.out.println("Because of this ability, the samurai's health was decreased by half.");
      System.out.println("The samurai has now " + this.getHealth() + " health.");
      System.out.println();
   }

   // heal method
   public void meditate() {
      int healthRestored = this.getHealth() / 2;
      super.setHealth(this.getHealth() + healthRestored);
      System.out.println("Meditated!!!");
      System.out.println("Health Restored: " + healthRestored);
      System.out.println("The samurai has " + this.getHealth() + " health now.");
      System.out.println();
   }

   public static int howMany() {
      System.out.println("howMany Samurai instance/s method!");
      System.out.println("There are " + counter + " samurai.");
      return counter;
   }

}
