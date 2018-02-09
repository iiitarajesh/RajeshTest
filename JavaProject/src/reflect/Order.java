package reflect;

public class Order {
	private int orderId;
	private String product;
	public Order() {
		System.out.println("Default Constructor");
	}
	public Order(int orderId,String product) {
		super();
		this.orderId=orderId;
		this.product=product;
		System.out.println("two var constuctor");
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public void method1() {
		System.out.println("Public Method");
	}
	private void method2() {
		System.out.println("private Method");
	}
	
}
