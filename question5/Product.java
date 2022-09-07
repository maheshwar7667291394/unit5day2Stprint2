package question5;

public class Product {

	private int productid;
	private String productname;
	private int quality;
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", quality=" + quality + ", price="
				+ price + "]";
	}

	private int price;
	
	public Product() {}

	public Product(int productid, String productname, int quality, int price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.quality = quality;
		this.price = price;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	};
	
	
	


}
