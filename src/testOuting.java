public class testOuting {
	public static void main(String[] args) {
		RestrictedOuting ro = new RestrictedOuting(49, 53);
		int choice = 1;
		while (choice != 5) {
			System.out.println();
			System.out.println("1.Book place");
			System.out.println("2.Cancel");
			System.out.println("3.Places available");
			System.out.println("4.Print details");
			System.out.println("5.Exit");
			choice = Console.readInt("Please enter a value-->");
			if (choice == 1) {
				boolean place = ro.add();

				if (place == true) {
					System.out.println("Place booked successfully.");
				} else {
					System.out.println("Not booked successfully.");
				}
			} else if (choice == 2) {
				boolean res1 = ro.cancel();
				if (res1 == true) {
					System.out.println("Cancelled successfully.");
				} else {
					System.out.println("Not Cancelled successfully.");
				}
			} else if (choice == 3) {
				int res = ro.check_avail_places();
				System.out.println("Places=" + res);
			} else if (choice == 4) {
				ro.print_details();
			}
		}
	}
}