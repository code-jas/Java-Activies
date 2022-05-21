public class BatTest {
   public void run() {

      // Instance of Gorilla - call Gorilla Class "Gorilla.java"
      Bat bat = new Bat();

      // The Bat's energy Default
      bat.displayEnergy();

      // Bat attack three towns
      bat.attackTowns();
      bat.attackTowns();
      bat.attackTowns();
      System.out.println(); // break line

      // Bat eat humans
      bat.eatHumans();
      bat.eatHumans();
      System.out.println(); // break line

      // Bat fly
      bat.fly();
      bat.fly();
   }
}
