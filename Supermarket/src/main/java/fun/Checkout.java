package fun;

public class Checkout {
	int total = 0;
	
	public void add(int count, int price) {
		// TODO Auto-generated method stub
		total = count * price;
	}

	public int total() {
		return total;
	}
}
