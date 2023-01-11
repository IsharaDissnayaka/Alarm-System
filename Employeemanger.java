

package employee;
import java.util.Scanner;

public class Employee {
	private String empid,name,address;
	
	
	public Employee() {}
	
	public Employee(String empid,String name,String address) {
		this.address=empid;
		this.empid=empid;
		this.name=name;
	}
	
	
	public void read() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter name");
		name=s1.next();
		System.out.println("Enter empid");
		empid=s1.next();
		System.out.println("Enter address");
		address = s1.next();
		
		
	}
	
	public void print() {
		System.out.println("Employee name is "+this.name);
		System.out.println("Employee empid is "+this.empid);
		System.out.println("Employee address is "+this.address);
	}
	
	

}










package employee;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class Manager extends Employee{
	private String department;
	private int productno1,productno2,productno3;
	public Manager() {
		
	}
	
	public Manager(String empid,String name,String address,String department,int productno1,int productno2,int productno3) {
		super(empid,name,address);
		this.department=department;
		this.productno1=productno1;
		this.productno2=productno2;
		this.productno3=productno3;
	}
	
	
	public void read() {
		
		try {
			super.read();
			
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter department");
			department=s2.next();
			System.out.println("Enter productno1");
			productno1=s2.nextInt();
			System.out.println("Enter productno2");
			productno2 = s2.nextInt();
			System.out.println("Enter productno2");
			productno3 = s2.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Number format is worng");
		}
		
	}
	
	
	public void print() {
		super.print();
		
		System.out.println("Manager department is "+this.department);
		System.out.println("Manager productno1 is "+this.productno1);
		System.out.println("Manager productno2 is "+this.productno2);
		System.out.println("Manager productno3 is "+this.productno3);
	}
	
	
}
