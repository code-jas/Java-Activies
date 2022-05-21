public class Ninja extends Human {

   public Ninja() {
      super.setStealth(10);
   }

   public Ninja(int strength, int stealth, int intelligence, int health) {
      super(strength, stealth, intelligence, health);
   }

   public void steal(Human human) {
      human.setHealth(human.getHealth() - this.getStealth());
      this.setHealth(this.getHealth() + this.getStealth());
      System.out.println("Stealed!!!");
      System.out.println("Damage: " + this.getStealth());
      System.out.println("The stolen human has " + human.getHealth() + " health left.");
      System.out.println("The ninja has " + this.getHealth() + " health now.");
      System.out.println();
   }

   public void runAway() {
      this.setHealth(this.getHealth() - 10);
      System.out.println("Ran Away!!!");
      System.out.println("Damage: " + 10);
      System.out.println("The ninja has " + this.getHealth() + " health left.");
      System.out.println();
   }

}
