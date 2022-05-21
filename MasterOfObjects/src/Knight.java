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
      System.out.println("Armor regenerated!");
      System.out.println("Regenerated Armor: 5");
      System.out.println("The armor is now " + this.getArmor() + ".");
   }

   public void HolyStrike(Human target) {
      int damage = this.getStrength() * 2;
      target.setHealth(target.getHealth() - damage);
      System.out.println("Holy Strike!");
      System.out.println("Damage: " + damage);
      System.out.println("The health is now " + target.getHealth() + ".");
   }

   public boolean isArmorDestroyed() {

      if (this.getArmor() <= 0) {
         // System.out.println("Armor Destroyed!!!");
         return true;
      }
      // System.out.println("Armor is still intact.");
      return false;
   }

   public int getArmor() {
      return armor;
   }

   public void setArmor(int armor) {
      this.armor = armor;
   }
}
