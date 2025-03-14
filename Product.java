package dsaAssignmentTwo;

public class Product
		{
		int pid;
		double price;
		static double tot_price;
		public Product(int p, double pr) 
		{
		pid = p;
		price = pr;
		tot_price += price;
		}
		public void display() 
		{
		System.out.println("Product ID: " + pid);
		System.out.println("Price: $" + price);
		}
		public static double getTotalPrice() 
		{
		return tot_price;
		}
		public static void main(String[] args) 
		{
		Product[] products = new Product[5];
		products[0] = new Product(1, 10.0);
		products[1] = new Product(2, 20.0);
		products[2] = new Product(3, 30.0);
		products[3] = new Product(4, 40.0);
		products[4] = new Product(5, 50.0);
		System.out.println("Details of purchased products:");
		for (int i = 0; i < products.length; i++) {
		products[i].display();
		}
		System.out.println("Total cost: $" + Product.getTotalPrice());
		}
	

}
