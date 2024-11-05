// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int current_value = Integer.parseInt(args[0]);
		double intrest_rate = Double.parseDouble(args[1])/100;
		int years = Integer.parseInt(args[2]);

		double future_value = (current_value * Math.pow(1+intrest_rate, years));

		System.out.println("After " + years + " years, $" + current_value + " saved at " + intrest_rate*100 +"% will yeid $" +(int)future_value);
	}
}