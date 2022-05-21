import java.text.DecimalFormat;
import java.text.NumberFormat;

/***
 * 
 * Note:
 * Palitan mo lang yung mga variable names wag function names
 * pero wag masyadong malayo sa variable name ko paiksiin mo lang or pahabain
 * HAHAHAHAHAAHHAAHHAHAHAHAHAHAHAHAHAHA
 */

// Main Class
public class Main {

   // Main method - Dito narurun yung codes
   public static void main(String[] args) {

      // GorillaTest Instance - Call GorillaTest.java
      GorillaTest gorillaTest = new GorillaTest();
      gorillaTest.run(); // call run() function in GorillaTest

      // BatTest Instance - Call BatTest.java
      BatTest batTest = new BatTest();
      batTest.run(); // call run() function in BatTest

      // DecimalFormat decimalFormat = new DecimalFormat("#.##");
      // decimalFormat.setGroupingUsed(true);
      // decimalFormat.setGroupingSize(3);

      // NumberFormat myFormat = NumberFormat.getInstance();
      // myFormat.setGroupingUsed(true);
      // String str = "123,47891.000";
      // str = str.replaceAll(",", "");

      // System.out.println(str);
      // try {
      // double num = Double.parseDouble(str);
      // System.out.println(decimalFormat.format(num));
      // } catch (NumberFormatException ex) {
      // ex.printStackTrace();
      // }

   }
}
