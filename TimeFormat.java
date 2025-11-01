// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = (args[0]);
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
		String hoursString;
		if (hours < 10) {
			hoursString = "0" + hours;
		} else {
			hoursString = "" + hours;
		}

		String minuteString;
		if (minutes < 10) {
			minuteString = "0" + minutes;
		} else {
			minuteString = "" + minutes;	
		}
		String ampm;
		if (hours >= 12) {
			ampm = "PM";
		} else {
			ampm = "AM";
			}
		if (hours > 12) {
			hours = (hours - 12);
		}
		System.out.println(hours + ":" + minuteString + " " + ampm);
	}
}