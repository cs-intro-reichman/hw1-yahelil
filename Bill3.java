// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];

		double totalBill = Double.parseDouble(args[3]);
		float totalBillfloat = (float) Math.ceil(totalBill);
		float share = totalBillfloat/3;

		System.out.println(name1 + "'s share: $" + share);
        System.out.println(name2 + "'s share: $" + share);
        System.out.println(name3 + "'s share: $" + share);

		System.out.println("Total bill: $" + totalBill);
	}
}
