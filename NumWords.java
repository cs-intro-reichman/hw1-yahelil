// Print a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        System.out.print(hundreds + " hundreds" + ", ");
        System.out.print(tens + " tens" +", and ");
        System.out.print(units + " ones" + '.');
	}
}
