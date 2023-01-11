package Alarm;

public class ExceptionForInput extends Exception {
	
	public ExceptionForInput(String msg) {
		super(msg);
	}

}


package Alarm;
import java.util.Scanner;
import java.io.*;


public class AlamClock {
	private int Hour,Minute,Second;
	
	public AlamClock()
	{
		this.Hour=12;
		this.Minute=0;
	   this.Second=	0;
		
	}
	
	public void inputAlarm() {
		
		
		try {
			
			
			
			Scanner s = new Scanner(System.in);
			
			System.out.print("Input Hour");
			this.Hour=s.nextInt();
			System.out.print("Input Minute ");
			this.Minute=s.nextInt();
			System.out.print("Input Second");
			this.Second=s.nextInt();
			
			
			if((Hour<=0 || Hour>12)||(Minute<=0 || Minute>59)||(Second<=0 || Second>59)) {
				
				throw new ExceptionForInput("Inavlid Input");
				
			}
			
		}catch(ExceptionForInput e) {
			System.out.println("Time is worng a");
		}catch(NumberFormatException e) {
			System.out.println("Time is worng b");
		}
		
	}
	
	public void setAlarm(int Hour,int Minute,int Second) {
		
		try {
				this.Hour=Hour;
				this.Minute=Minute;
				this.Second=Second;
				
				
				if((Hour<=0 || Hour>12)||(Minute<=0 || Minute>59)||(Second<=0 || Second>59)) {
					
					throw new ExceptionForInput("Inavlid Input");
					
				}
				
			}catch(ExceptionForInput e) {
				System.out.print("Time is worng c");
			}catch(NumberFormatException e) {
				System.out.print("Time is worng d");
			}
		
		
	}
	public void showAlarm() {
		System.out.println(this.Hour+":"+this.Minute+":"+this.Second);
	}

}


package Alarm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlamClock al = new AlamClock();
		al.inputAlarm();
		al.showAlarm();
		
		
		AlamClock al1 = new AlamClock();
		al1.setAlarm(1, 3, 45);
		al1.showAlarm();
		
	}

}
