public class Wizard extends Human {

   public Wizard() {
      super.setHealth(50);
      super.setIntelligence(8);
   }

   public Wizard(int strength, int stealth, int intelligence, int health) {
      super(strength, stealth, intelligence, health);
   }

   public void heal(Human human) {
      human.setHealth(human.getHealth() + this.getIntelligence());
      System.out.println("Healed!!!");
      System.out.println("Health Added: " + this.getIntelligence());
      System.out.println("The healed human has " + human.getHealth() + " health now.");
      System.out.println();
   }

   public void fireball(Human human) {
      human.setHealth(human.getHealth() - (this.getIntelligence() * 3));
      System.out.println("Fireball!!!");
      System.out.println("Damage: " + this.getIntelligence());
      System.out.println("The fireball attacked human has " + human.getHealth() + " health left.");
      System.out.println();
   }

}
