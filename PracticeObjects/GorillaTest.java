public class GorillaTest {
   public void run() {
      // Instance of Gorilla - call Gorilla Class "Gorilla.java"
      Gorilla gorilla = new Gorilla(100);
      // The Gorilla's energy Default
      gorilla.displayEnergy();

      // Gorilla throw three times!
      gorilla.throwSomething();
      gorilla.throwSomething();
      gorilla.throwSomething();
      System.out.println(); // break line

      // Gorilla eat bananas twice!
      gorilla.eatBananas();
      gorilla.eatBananas();
      System.out.println(); // break line

      // Gorilla climb once
      gorilla.climb();
      System.out.println(); // break line

   }
}
