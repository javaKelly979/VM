

public enum Product {
	TAKIS(1,229),HERSHEY(2,149),WATER(3,129),BURGER(4,250); // All the Products Mentioned here with ID and Value of it
	private int id;
	private int value;
	Product(int id, int value){
		this.id=id;
		this.value=value;
	}
	public int getId() {
		return this.id;
	}
	public int getValue() {
		return this.value;
	}
	public static Product valueOf(int productSelected) {
		for(Product product:Product.values()) {
			if(productSelected==product.getId()) {
				return product;
			}
		}
		return null;
	}
}
