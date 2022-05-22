public class HumanTest {
      // Declaring ANSI_RESET so that we can reset the color
      public static final String ANSI_RESET = "\u001B[0m";

      // Declaring the color
      // Custom declaration
      public static final String ANSI_RED = "\u001B[31m";

      public void run() {
            // INSTANCES OF CLASSES
            Human human1 = new Human();
            Human human2 = new Human();
            Wizard wizard = new Wizard();
            Ninja ninja = new Ninja();
            Samurai samurai1 = new Samurai();
            Samurai samurai2 = new Samurai();
            Samurai samurai3 = new Samurai();
            Knight knight = new Knight();

            /**
             * TESTING CHARACTER METHODS
             */

            // Human Testing
            System.out.println(ANSI_RED
                        + "HUMAN TEST" + ANSI_RESET);
            System.out.println("Human 1 attacks Human 2");
            human1.attack(human2);
            System.out.println("Human 1 attacks Human 2");
            human2.attack(human1);
            System.out.println();

            // Wizard Testing
            System.out.println(ANSI_RED
                        + "WIZARD TEST" + ANSI_RESET);
            wizard.fireball(ninja);
            wizard.heal(ninja);
            wizard.fireball(knight);
            System.out.println();

            // Ninja Testing
            System.out.println(ANSI_RED
                        + "NINJA TEST" + ANSI_RESET);
            ninja.attack(samurai1);
            ninja.steal(samurai1);
            ninja.runAway();
            ninja.steal(knight);
            System.out.println();

            // Samurai Testing
            System.out.println(ANSI_RED
                        + "SAMURAI TEST" + ANSI_RESET);
            samurai1.deathBlow(wizard);
            samurai1.meditate();
            Samurai.howMany();
            System.out.println();

            // Knight Testing
            System.out.println(ANSI_RED
                        + "KNIGHT TEST" + ANSI_RESET);
            knight.attack(samurai1);
            knight.Reinforce();
            wizard.fireball(knight);
            knight.HolyStrike(human1);
            System.out.println();

      }

}
