// Generates three integer random numbers in a given range,
// and prints them in increasing order.
import java.util.Arrays;
public class Ascend {
	public static void main(String[] args) {
		int upperBound = Integer.parseInt(args[0]); // Set this to your desired upper bound "I'm"
		int[] numbers_list = new int[3];
		numbers_list[0] = (int)(Math.random() * upperBound);
		numbers_list[1] = (int)(Math.random() * upperBound);
		numbers_list[2] = (int)(Math.random() * upperBound);
		Arrays.sort(numbers_list);
		System.out.println("Random numbers: " + numbers_list[0] + ", " + numbers_list[1] + ", " + numbers_list[2]);


		
	}
}
