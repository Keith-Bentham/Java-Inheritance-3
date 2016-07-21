public class RestrictedOuting extends Outing {

	private int max;

	public RestrictedOuting(int count, int m) {
		super(count);
		max = m;
	}

	public boolean add() {
		if (count == max) {
			return false;
		} else
			this.count++;
		return true;
	}

	public int check_avail_places() {
		int diff = 0;
		diff = max - count;
		return diff;
	}

	public void print_details() {
		super.print_details();
		System.out.println("Max:  " + max);
	}
}
