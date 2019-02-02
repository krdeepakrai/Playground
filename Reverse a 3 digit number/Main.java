import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int l=num%10;
    int s=((num/10)%10);//Type your code here
    int f=num/100;
    int sum=(l*100)+(s*10)+f;
    System.out.println(sum);
  }
}