package entities;

public class produit {
	private String id;
	private String name;
	private int price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public produit(String id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
