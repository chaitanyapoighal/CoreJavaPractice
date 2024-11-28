public class Product{
  	int productId;
  	String productName;
  	int price;
  	double rating;
  	String description;
	public Product(){}
	public Product(int productId,String productName,int price,double rating,String description){
		this.productId=productId;
  		this.productName=productName;
  		this.price=price;
  		this.rating=rating;
  		this.description=description;
	}
        public Product getProduct(Product p)
		{
          	  return p;
   		}
	public void displayProduct(){
		System.out.println("Product Details:"+productId+","+productName+","+price+","+rating+","+description);
	}
 
}