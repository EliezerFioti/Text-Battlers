import java.util.HashMap;
import java.util.Map;

public class Shop {
	
	private int itemPrice;
	private Map<String, Integer> potion;
	
	
	public Shop(int itemPrice) {
		
		this.itemPrice = itemPrice;
		
		this.potion = new HashMap<>();
		
	}
	
	public int getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public Map<String, Integer> getPotion() {
		return potion;
	}
	
	public void setPotion(String potionName, int potionRegeneration) {
		potion.put(potionName, potionRegeneration);
	}

}
