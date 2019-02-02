import java.util.Scanner;
class Main
{
  int sqd;
  public static int squareofdigits(int m)
  {
   int  square=m*m;
  
  return square;
  }
	public static void main (String[] args)
    {
	 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=squareofdigits(n);// Type your code here  
      System.out.println(s);
      
	} 
}