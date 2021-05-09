//Q.1 Write a Java program to print 'Hello' on screen and then print your name on a separate line. //

public class Assignment1
{
 public static void main(String []args)
 {
  System.out.println("Hello\n Chinmay Deshmukh");
  }
  }
  
  
 //Q.2 Write a Java program to print the sum of two numbers//
class Assignment1
 {
	 public static void main(String [] args)
	 {
      int sum;		 
	  String s1 = args[0];
	  String s2 = args[1];
	  
	  int a =Integer.parseInt(s1);
      int b =Integer.parseInt(s2);
      sum = a+b;
 	  
	  System.out.println("Addition of both the numbers is :" + sum);
	  }
 }
 
 //Q.3 Write a Java program to divide two numbers and print on the screen.//
 import java.util.Scanner;
	
	class Assignment1
	{
		public static void main(String []args)
		{
	Scanner input = new Scanner(System.in);
	System.out.println("First number :");
	int a = input.nextInt();
	System.out.println("Second number :");
	int b = input.nextInt();
	int d = (a/b);
	System.out.println();
	
	System.out.println("Division of both the numbers is :" + d);
	
	  }
  }
  
  //Q.4 Write a Java program to print the result of the following operations.//
  class Assignment1
  {
	  public static void main(String []args)
	  {
		  int a = (-5+8*6);
		  int b = ((55+9)%9);
		  int c = (20+-3*5/8);
		  int d = (5+15/3*2-8%3);
		  System.out.println("Answer 1 :"+a);
		  System.out.println("Answer 2 :"+b);
		  System.out.println("Answer 3 :"+c);
		  System.out.println("Answer 4 :"+d);
	  }
  }
  
  //Q.5 Write a Java program that takes two numbers as input and display the product of two numbers//
  import java.util.Scanner;
  
  class Assignment1
  {
	  public static void main(String []args)
	  {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int a = input.nextInt();
        System.out.println("Enter the Second number :");
        int b = input.nextInt();
        int d = a*b;
        System.out.println("Product of two numbers is :" +a+"*"+b+"="+d);		
	  }
  }
  
  //Q.6 Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.//
  import java.util.Scanner;
  
  
   public class Assignment1
   {
	   public static void main(String []args)
	   { 
	   Scanner input = new Scanner(System.in);
	   System.out.println("Input first number :");
	   int a = input.nextInt();
	   System.out.println("Input Second number :");
	   int b = input.nextInt();
	   int c = a+b;
	   int d = a-b;
	   int e = a*b;
	   
	   System.out.println("Addition of both the numbers is :" +a+"+"+b+"="+c);
	   System.out.println("Substraction of both the numbers is :" +a+"-"+b+"="+d);
	   System.out.println("Multiplication of both the numbers is :" +a+"*"+b+"="+e);
	   
	   
	   }
   }
   
   //Q.7 Write a Java program that takes a number as input and prints its multiplication table upto 10.//
  import java.util.Scanner;
  
  class Assignment1
   {
	   public static void main(String []args)
	   {
		   Scanner input = new Scanner(System.in);
		   System.out.println("Input number :");
		   int a = input.nextInt();
		   
		       for (int i = 1;i<=10;i++)
			   {  
		       System.out.println("Expected output :"+a+"*"+i+"="+a*i);
			   }
		   
	   }
  
   }
   
   //Q.8 Write a Java program to display the following pattern.//
 
   class Assignment1
   {
	   public static void main(String []args)
	   {
		   System.out.println("   J     a     V     V     a");
		   System.out.println("   J    a a     V   V     a a");
		   System.out.println(" J J   a a a     V V     a a a");
		   System.out.println(" JJJ  a     a     V     a     a");
	   }
   }
   
   //Q.9 Write a Java program to compute the specified expressions and print the output.//
  /class Assignment1
   {
	   public static void main(String []args)
	   {
		   
		   System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5));
	   }
	   
   }
   
   //Q.10 Write a Java program to compute a specified formula.//
   class Assignment1
   {
	   public static void main(String []args)
	   {
		   System.out.println(4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));
		   
	   }
   }
   
  //Q.11 Write a Java program to print the area and perimeter of a circle.//
  import java.util.Scanner;
  
  class Assignment1
  {
	  public static void main(String []args)
	  {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Radius of circle :");
		  double r = input.nextDouble();
		  double pie = 3.14;
		  double i = 2*pie*r;
		  double j = pie*r*r;
		  
		  System.out.println("The perimeter of circle is :"+i);
		  System.out.println("The area of circle is :"+j);
		  
		  
	  }
  }
  
  //Q.12 Write a Java program that takes three numbers as input to calculate and print the average of the numbers.//
  import java.util.Scanner;
  
  class Assignment1
  {
	  public static void main(String []args)
	  
		  {
			  Scanner input = new Scanner(System.in);
			  System.out.println("1st number :");
			  int a = input.nextInt();
			  System.out.println("2nd number :");
			  int b = input.nextInt();
			  System.out.println("3rd number :");
			  int c = input.nextInt();
			  int i = a+b+c;
			  int j = i/3;
			  
			  System.out.println("The average of the numbers is :"+j);
			  
			
			  
		  }
	  
  }
  
  //Q.13 Write a Java program to print the area and perimeter of a rectangle.//
  import java.util.Scanner;
  
  class Assignment1
  {
	  public static void main(String [] args)
	  {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter the width :");
		  double w = input.nextDouble();
		  System.out.println("Enter the height :");
		  double h = input.nextDouble();
		  double a = w*h;
		  double p = 2*(w+h);
		  
		  System.out.println("Area of rectangle is :"+a+"\n"+"Perimeter of rectangle is :"+p);
		  
	  }
  }
  
  //Q.14 Write a Java program to print an American flag on the screen.//
  class Assignment1
  {
	  public static void main(String [] args)
	  {
		  for(int i = 1;i<=15;i++)
		  {
			  if(i<=9)
			  {	  
			    if(i%2==1)
			  {
				  System.out.println("* * * * * * ==================================");
			  }
			    else
				  System.out.println(" * * * * *  ==================================");
		      }
			  else
				  System.out.println("==============================================");
 		  }  
			  
	  }
 
  }
  
  
  //Q.15 Write a Java program to swap two variables.//
  import java.util.Scanner;
  
  class Assignment1
  {
	  public static void main(String [] args)
	  {
		  Scanner input = new Scanner(System.in);
		  System.out.println("First number :");
		  int a = input.nextInt();
		  System.out.println("Second number :");
		  int b = input.nextInt();
		  int x;
		  x=a;
		  a=b;
		  b=x;
		  
		  System.out.println("After swapping :"+a+ " "+b);
		  
	  }
  }
  
  //16. Write a Java program to print a face.//
  class Assignment1
  {
	  public static void main(String [] args)
	  {
		  System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
	  }
  }
  
  //Q.17 Write a Java program to add two binary numbers.//
  import java.util.Scanner;
  
  class Assignment1
  {
	  public static void main(String []args)
	  {
		  long b1,b2; // Two variable to hold binary no
		  int i=0, carry=0;
		  int[] sum = new int[10]; //hold binary output
		  
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter first binary number: ");
		  b1=scanner.nextLong();
		  System.out.print("Enter second binary number: ");
		  b2=scanner.nextLong();
		  
	  while(b1 != 0 || b2 != 0)
	  {
		  sum[i++] = (int)((b1%10 + b2%10 + carry)%2);
		  carry= (int)((b1%10 + b2%10 + carry)/2);
		  b1=b1/10;
		  b2=b2/10;
	  }
		  if (carry != 0)
		  {
			  sum[i++] = carry;
		  }
		  --i;
		  System.out.print("Output :");
		  while(i>=0)
		  {
			  System.out.print(sum[i--]);
		  }
		  System.out.print("\n");
		  
	  } 
	  
  }
  



  