public class App {
    public static void main(String[] args) throws Exception {
        Human human1 = new Human();
        Human human2 = new Human();
        Wizard wizard1 = new Wizard();
        Ninja ninja1 = new Ninja();
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai();
        Samurai samurai3 = new Samurai();
        Samurai samurai4 = new Samurai();
        Samurai samurai5 = new Samurai();
        Samurai samurai6 = new Samurai();

        Samurai samurai7 = new Samurai();
        Samurai samurai8 = new Samurai();
        Samurai samurai9 = new Samurai();

        human1.attack(human2);

        wizard1.heal(human2);
        wizard1.fireball(human2);

        ninja1.steal(wizard1);
        ninja1.runAway();

        System.out.println("The health is : ");
        System.out.println("HEALTH: " + samurai1.getHealth());
        System.out.println(samurai1.getIntelligence());
        System.out.println(samurai1.getStealth());
        System.out.println(samurai1.getStrength());
        samurai1.deathBlow(ninja1);
        samurai1.meditate();
        Samurai.howMany();

        Knight knight1 = new Knight();
        System.out.println("The health is : ");
        System.out.println("HEALTH: " + knight1.getHealth());
        System.out.println(knight1.getIntelligence());
        System.out.println(knight1.getStealth());
        System.out.println(knight1.getStrength());

        knight1.isArmorDestroyed();

    }
}
