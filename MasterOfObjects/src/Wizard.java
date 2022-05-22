public class Wizard extends Human {

   public Wizard() {
      super.setHealth(50);
      super.setIntelligence(8);
   }

   public Wizard(int strength, int stealth, int intelligence, int health) {
      super(strength, stealth, intelligence, health);
   }

   // heal method
   public void heal(Human human) {
      human.setHealth(human.getHealth() + this.getIntelligence());
      System.out.println("\"Healed!!!\"");
      System.out.println("Wizard healed human by " + this.getIntelligence() + ".");
      System.out.println("The target human has " + human.getHealth() + " health now.");
      System.out.println();
   }

   // attack method
   public void fireball(Human human) {
      int fireballDamage = this.getIntelligence() * 3;
      int newHealth = human.getHealth() - fireballDamage;
      human.setHealth(newHealth);
      System.out.println("\"Fireball!!!\"");
      System.out.println("The attacker dealt " + fireballDamage + " damage with his attack.");
      System.out.println("The target has now " + newHealth + " health.");
      System.out.println();
   }

   public void fireball(Knight knight) {

      int fireballDamage = this.getIntelligence() * 3;
      int newHealth;
      System.out.println("\"Fireball!!!\"");
      System.out.println("The attacker dealt " + fireballDamage + " damage with his attack.");

      if (!knight.isArmorDestroyed()) {
         System.out.println("Armor is still intact.");
         newHealth = knight.checkArmor(fireballDamage);
      } else {
         System.out.println("Armor Destroyed!!!");

         newHealth = knight.getHealth() - fireballDamage;
      }

      knight.setHealth(newHealth);

      System.out.println(
            "The target has now " + knight.getHealth() + " health and "
                  + knight.getArmor() + " armor.");
      System.out.println();
   }

}
