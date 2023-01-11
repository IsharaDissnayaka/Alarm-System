
package array;

public class CharArray {
	
	private char mychararray[];
	
	public CharArray(char[] mychararray) {
		
		this.mychararray=mychararray;
	}
	
	public void swapFirstAndLast() {
		char c1 = mychararray[0];
		mychararray[0]=mychararray[mychararray.length-1];
		mychararray[mychararray.length-1]=c1;
	}
	
	public void DisplayString() {
		for(int a=0;a<mychararray.length;a++) {
			System.out.println(this.mychararray[a]);
		}
	}

}


package array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'m','h','a','n','k','Y','0','u','M','a','d','a','T'};
		CharArray c1 = new CharArray(a);
		c1.swapFirstAndLast();
		c1.DisplayString();

	}

}
