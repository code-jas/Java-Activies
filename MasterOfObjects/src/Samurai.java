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

   public void deathBlow(Human human) {
      int deathBlowAttack = human.getHealth();
      int consequenceAttack = this.getHealth() / 2;
      human.setHealth(human.getHealth() - deathBlowAttack);
      this.setHealth(this.getHealth() - consequenceAttack);
      System.out.println("DeathBlow!!!");
      System.out.println("Damage: " + deathBlowAttack);
      System.out.println("The deathblow attacked human has " + human.getHealth() + " health left.");
      System.out.println("The samurai has " + this.getHealth() + " health now.");
      System.out.println();
   }

   public void meditate() {
      int healthRestored = this.getHealth() / 2;
      super.setHealth(this.getHealth() + healthRestored);
      System.out.println("Meditated!!!");
      System.out.println("Health Restored: " + healthRestored);
      System.out.println("The samurai has " + this.getHealth() + " health now.");
      System.out.println();
   }

   public static int howMany() {
      System.out.println("There are " + counter + " samurai.");
      return counter;
   }

}
