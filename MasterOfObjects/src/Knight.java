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
      int damage = 10 + (this.getArmor() * (20 / 100));
      // target.setHealth(target.getHealth() - damage);
      System.out.println("\"Holy Strike!\"");
      System.out.println("The attacker dealt " + damage + " damage with his attack.");
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
