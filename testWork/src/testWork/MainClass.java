package testWork;

public class MainClass {

public static void main(String[] args) {
	//can you help me for writing this program

	/*  1234321
	*   12321
	*    121
	*    1
	*   input - is number of numbers 
	*   output - multi strings input-numbers-lenght, input-numbers-lenght - 2, …, 1
	*  input = 5 (max = 10 digitals)
	*  output : 123454321
	*               1234321
	*         12321
	*         121
	*         1
	*/
	int input = 9;
	System.out.println("Start:");
	    for (int j = input; j>=1; j--)
	    	{  	for (int i=1; i <= j; i++) { System.out.print(i);}
	        	for (int i = j-1; i >= 1; i--) {  System.out.print(i);    	}
	        	   System.out.println();
	    	}
	  	}

}