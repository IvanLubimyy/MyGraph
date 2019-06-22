package testWork;

public class DaysOfMonth {

	public static void main(String[] args) {
		/*
		 * 01 - month Jan
		 *
		 * “31”
		 *
		 */
		int month = 4;
		int[] month31 = new int[] { 1, 3, 5, 7, 8, 10, 12 };

		if (month < 1 || month > 12) {
			System.out.println("Error month");

		} else {

			// if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
			// month == 10 || month == 12){
			if (checkInArray(month31, month)) {
				System.out.println("Month has 31 days");
			} else {
				System.out.println("Month has 30 days or less");

			}
		}

	}

	private static boolean checkInArray(int[] arr, int targetValue) {
		for (int s : arr) {
			if (s == targetValue)
				return true;
		}
		return false;
	}

}
