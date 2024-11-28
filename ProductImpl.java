public class ProductImpl{
	public static void main(String args[])
	{
		Product product1=new Product();
		Product product2=new Product(123,"AC",45000,3.5,"LG AirConditioner Dual Inverter Compressor");
                product1=product1.getProduct(product2);
                product1.displayProduct();
		product1.displayProduct();
 	}
 }