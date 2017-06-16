import java.io.*;
import java.util.Scanner;
class palindrome1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int number=s.nextInt();
int rem,sum=0;
while(number>0)
{
rem=number%10;
sum=(sum*10)+rem;
number=number/10;
}
if(number==sum)
{
System.out.println("number is palindrome");
}
else
{
System.out.println(number is not palindrome");
}
}
}
