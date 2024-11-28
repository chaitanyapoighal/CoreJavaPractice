class Employee{
 	int eId;
 	String name;
 	int salary;
 	public Employee(){
  		System.out.println("Employee object created");
  		}
	public Employee(int eId,String name,int salary){
		System.out.println("Employee object created");
		this.eId=eId;
		this.name=name;
		this.salary=salary;
		}
   	public void display(){
		System.out.println("Employee Details:"+eId+" "+name+" "+salary);
		}
   }
