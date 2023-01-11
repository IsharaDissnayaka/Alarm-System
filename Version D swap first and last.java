package VersionD;


public class CharArray {
	
	char myCharArray[];

	public CharArray(char[] myCharArray) {
		super();
		this.myCharArray = myCharArray;
	}
	
	void swapFirstandLast() {
		char x=myCharArray[0];
		char y=myCharArray[myCharArray.length-1];
		myCharArray[0]=y;
		myCharArray[myCharArray.length-1]=x;
	}
	void displayatrry() {
		for (int x=0;x<myCharArray.length;x++) {
			System.out.println(myCharArray[x]);
		}
	}
	void displayString() {
		System.out.println(String.valueOf(myCharArray));
	}
public static void main(String[] args) {
	char a[]= {'a','b','c','d'};
	CharArray c =new CharArray(a);
	c.swapFirstandLast();
	c.displayatrry();
	c.displayString();
	
}
}