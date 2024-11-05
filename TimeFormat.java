// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		String am_pm = "AM";
		String hours = "" + args[0].charAt(0) + args[0].charAt(1);
		int hours_int = Integer.parseInt(hours);
		// Does the same with the minutes part of the input.
		String minutes = "" + args[0].charAt(3) + args[0].charAt(4);
		int length = minutes.length();
		if (length == 1){
			minutes = '0' + minutes;
		}
		length = hours.length();
		if (length == 1){
			hours = '0' + hours;
		}
		if (hours_int > 12){
			hours_int -= 12;
			am_pm = "PM";
		}
		
		System.out.print(hours_int);
		System.out.print(':');
		System.out.print(minutes);
		System.out.println(' ' +am_pm);

	}
}