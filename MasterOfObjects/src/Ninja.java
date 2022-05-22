public class Ninja extends Human {

   public Ninja() {
      super.setStealth(10);
   }

   public Ninja(int strength, int stealth, int intelligence, int health) {
      super(strength, stealth, intelligence, health);
   }

   // attack method
   public void steal(Human human) {
      human.setHealth(human.getHealth() - this.getStealth());
      this.setHealth(this.getHealth() + this.getStealth());
      System.out.println("\"Stealed!!!\"");
      System.out.println("The attacker dealt " + this.getStealth() + " damage with his attack.");
      System.out.println("The target has " + human.getHealth() + " health left.");
      System.out.println("The ninja has " + this.getHealth() + " health now.");
      System.out.println();
   }

   public void steal(Knight knight) {
      int newHealth;

      System.out.println("\"Stealed!!!\"");
      System.out.println("The attacker dealt " + this.getStealth() + " damage with his attack.");

      if (!knight.isArmorDestroyed()) {
         System.out.println("Armor is still intact.");
         newHealth = knight.checkArmor(this.getStealth());
      } else {
         System.out.println("Armor Destroyed!!!");

         newHealth = knight.getHealth() - this.getStealth();
      }

      knight.setHealth(newHealth);
      this.setHealth(this.getHealth() + this.getStealth());

      System.out.println("The target has now " + knight.getHealth() + " health and " +
            knight.getArmor() + " armor.");
      System.out.println("The Ninja has " + this.getHealth() + " health now.");
      System.out.println();
   }

   // self-defense method
   public void runAway() {
      this.setHealth(this.getHealth() - 10);
      System.out.println("\"Ran Away!!!\"");
      System.out.println("The ninja decreased his health by 10.");
      System.out.println("The ninja has now " + this.getHealth() + " health.");
      System.out.println();
   }

}
