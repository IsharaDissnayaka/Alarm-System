package ITNUMBER;
import java.io.*;

public class InvalidITNumberException extends Exception{
	
	InvalidITNumberException(String msg){
		super(msg);
	}

}


package ITNUMBER;

public class Student {
	private String StudentID,StudentName;
	
	public Student(String StudentID,String StudentName) {
		this.StudentID=StudentID;
		this.StudentName=StudentName;
	}
   public void Display() {
	   try {
		   if((StudentID.length()!=10 || (StudentID.substring(0,2).equals("IT"))==false) && (StudentID.length()!=10 || (StudentID.substring(0,2).equals("it"))==false)) {
			   throw new InvalidITNumberException("Inavlid IT Number");
			   
		   }
		   
		   try {
			   long number = Integer.parseInt(StudentID.substring(2,9));
		   }catch(NumberFormatException e1){
			   throw new InvalidITNumberException("Invalid IT Number");
		   }
		   
		   System.out.println("Id number is"+this.StudentID);
		   System.out.println("Id number is"+this.StudentName);
	   }catch(Exception e2) {
		   System.out.println(e2.getMessage());
		   
	   }
   }
}

package ITNUMBER;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("IT21174780","IsharaTharindu");
		s1.Display();
		// TODO Auto-generated method stub

	}

}


