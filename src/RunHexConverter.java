import java.util.Scanner;

public class RunHexConverter {

	public static void main(String[] args) {
		
		//psuedo-code
		/*
		 * syso" enter your hex number"
		 * scanner read as String (0-9,A-F)
		 * parse that String( disect it, pull out a char at a time)
		 * use magic math, to do the amazing conversion from hex to decimal, abd 
		 * after that to binary
		 * syso "Hex number aaa.... converts to 10011.... binary
		 * syso"hex number abas.... convert to 123 ....decimal
		 * 
		 * Essential to know! from right to left b^0 = 1 always then it is b^1 = 16h, b^2 = 256 etc.
		 */
		//use ab25 as testing
		Scanner sc = new Scanner(System.in);
		String hex;
		int numberChars = 0;
		int totalDecimal = 0;
		System.out.println("Enter your hexadecimal number: ");
		//Scanner sc = new Scanner(System.in);
		hex = sc.next();
		hex = hex.toUpperCase();
		
		System.out.println(" you have entered: " + hex);
		numberChars = hex.length();
		System.out.println("your input has " + numberChars + " chars");
		System.out.println();
		for(int i=hex.length()-1; i>=0; i--){
			System.out.println("Char at index: " + i +" is: " + hex.charAt(i) );
			if(i==3){
				int decNmbr = charToInt(hex.charAt(i));
				totalDecimal += decNmbr * 1;
				System.out.println("char: " +hex.charAt(i) + " is decimal: " + decNmbr+ "total Number = " + totalDecimal);
			}
			if(i==2){
				int decNmbr = charToInt(hex.charAt(i));
				totalDecimal += decNmbr * 16;
				System.out.println("char: " +hex.charAt(i) + " is decimal: " + decNmbr+ "total Number = " + totalDecimal);
			}
			if(i==1){
				int decNmbr = charToInt(hex.charAt(i));
				totalDecimal += decNmbr * 256;
				System.out.println("char: " +hex.charAt(i) + " is decimal: " + decNmbr + " total Number = " + totalDecimal);
			}
			if(i==0){
				int decNmbr = charToInt(hex.charAt(i));
				totalDecimal += decNmbr * 4096;
				System.out.println("char: " + hex.charAt(i) + " is decimal: " + decNmbr + " total Number = " + totalDecimal);
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println();
			}
			if(i==3){
				int decNmbr = charTobin(hex.charAt(i));
				totalDecimal += decNmbr * 1;
				System.out.println("char: " +hex.charAt(i) + " is decimal: " + decNmbr+ "total Number = " + totalDecimal);
			}
			if(i==2){
				int decNmbr = charTobin(hex.charAt(i));
				totalDecimal += decNmbr * 2;
				System.out.println("char: " +hex.charAt(i) + " is decimal: " + decNmbr+ "total Number = " + totalDecimal);
			}
			if(i==1){
				int decNmbr = charTobin(hex.charAt(i));
				totalDecimal += decNmbr * 4;
				System.out.println("char: " +hex.charAt(i) + " is decimal: " + decNmbr + " total Number = " + totalDecimal);
			}
			if(i==0){
				int decNmbr = charTobin(hex.charAt(i));
				totalDecimal += decNmbr * 8;
				System.out.println("char: " + hex.charAt(i) + " is decimal: " + decNmbr + " total Number = " + totalDecimal);
			}
			
			
			//index=hex.length()-1;
			
					
			
		}
		
	}//end main

	private static int charToInt(char c) {
		int nbr =0;
		switch (c){
		case '0':
			nbr=0;
			break;
		case '1':
			nbr=1;
			break;
		case '2':
			nbr=2;
			break;
		case '3':
			nbr=3;
			break;
		case '4':
			nbr=4;
			break;
		case '5':
			nbr=5;
			break;
		case '6':
			nbr=6;
			break;
		case '7':
			nbr=7;
			break;
		case '8':
			nbr=8;
			break;
		case '9':
			nbr=9;
			break;
		case 'A':
			nbr=10;
			break;
		case 'B':
			nbr=11;
			break;
		case 'C':
			nbr=12;
			break;
		case 'D':
			nbr=13;
			break;
		case 'E':
			nbr=14;
			break;
		case 'F':
			nbr=15;
			break;
	
		}
		
		return nbr;
	}
	private static int charTobin(char c) {
		int nbr =0;
		switch (c){
		case '0':
			nbr=0000;
			break;
		case '1':
			nbr=0001;
			break;
		case '2':
			nbr=0010;
			break;
		case '3':
			nbr=0011;
			break;
		case '4':
			nbr=0100;
			break;
		case '5':
			nbr=0101;
			break;
		case '6':
			nbr=0110;
			break;
		case '7':
			nbr=0111;
			break;
		case '8':
			nbr=1000;
			break;
		case '9':
			nbr=1001;
			break;
		case 'A':
			nbr=1010;
			break;
		case 'B':
			nbr=1011;
			break;
		case 'C':
			nbr=1100;
			break;
		case 'D':
			nbr=1101;
			break;
		case 'E':
			nbr=1110;
			break;
		case 'F':
			nbr=1111;
			break;
	
		}
		
		return nbr;
	}
	

}//end class
