import java.lang.Math;

public class Knight extends Human {
   private int armor = 30;

   public Knight() {
      super.setHealth(80);
   }

   public Knight(int strength, int stealth, int intelligence, int health) {
      super(strength, stealth, intelligence, health);
   }

   public void Reinforce() {
      this.setArmor(this.getArmor() + 5);
      System.out.println("\"Armor regeneration!\"");
      System.out.println("The armor increased by 5");
      System.out.println("The total amount of armor is " + this.getArmor() + ".");
      System.out.println();
   }

   public void HolyStrike(Human human) {
      int damage = (int) Math.round((double) 10 + ((double) this.getArmor() * (double) 20 / 100));
      int newHealth = human.getHealth() - damage;
      // System.out.println("Armor : " + this.getArmor());
      // System.out.println("Percentage of Damage:" + ((double) this.getArmor() *
      // (double) 20 / 100));
      // System.out.println("Damage:" + damage);

      human.setHealth(newHealth);
      System.out.println("\"Holy Strike!\"");
      System.out.println("The attacker dealt estimated " + damage + " damage with his attack.");
      System.out.println("The target has now " + newHealth + " health.");
      System.out.println();
      // System.out.println("The health is now " + target.getHealth() + ".");
   }

   public void HolyStrike(Knight knight) {
      int damage = (int) ((double) 10 + ((double) this.getArmor() * (double) 20 / 100));
      int newHealth;
      System.out.println("\"Holy Strike!\"");
      System.out.println("The attacker dealt estimated " + damage + " damage with his attack.");

      if (!knight.isArmorDestroyed()) {
         System.out.println("Armor is still intact.");
         newHealth = knight.checkArmor(damage);
      } else {
         System.out.println("Armor Destroyed!!!");

         newHealth = knight.getHealth() - damage;
      }
      // System.out.println("Armor : " + this.getArmor());
      // System.out.println("Percentage of Damage:" + ((double) this.getArmor() *
      // (double) 20 / 100));
      // System.out.println("Damage:" + damage);

      knight.setHealth(newHealth);
      System.out.println("The target has now " + newHealth + " health and "
            + knight.getArmor() + " armor.");
      System.out.println();
      // System.out.println("The health is now " + target.getHealth() + ".");
   }

   public boolean isArmorDestroyed() {

      if (this.getArmor() <= 0) { // armor destroyed

         return true;
      }
      // armor is still intact.
      return false;
   }

   public int checkArmor(int damageTaken) {
      int newArmor = this.getArmor() - damageTaken;
      if (newArmor <= 0) { // negative value
         System.out.println("The damage penetrated the armor!");
         this.setArmor(0);
         this.setHealth(this.getHealth() - Math.abs(newArmor));
      } else { // positive value
         this.setArmor(newArmor);
      }
      return this.getHealth();
   }

   public int getArmor() {
      return armor;
   }

   public void setArmor(int armor) {
      this.armor = armor;
   }

}
