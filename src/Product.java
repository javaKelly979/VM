

public enum Product {
	TAKIS(1,229),HERSHEY(2,149),WATER(3,129),BURGER(4,250),EMPTY(0,00);
	private int id;
	private int price;
	Product(int id, int price){
		this.id=id;
		this.price=price;
	}
	public int getId() {
		return this.id;
	}
	public int getPrice() {
		return this.price;
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
