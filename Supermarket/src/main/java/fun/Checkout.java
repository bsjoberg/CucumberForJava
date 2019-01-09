package fun;

import java.util.HashMap;

public class Checkout {
	int total = 0;
	
	HashMap<String, Integer> itemPrices = new HashMap();
	
	public void add(int count, int price) {
		total += (count * price);
	}

	public int total() {
		return total;
	}

	public void setItemPrice(String name, int price) {
		itemPrices.put(name, price);
	}

	public int getItemPrice(String name) {
		return itemPrices.get(name).intValue();
	}
}
