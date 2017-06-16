import java.io.*;
import java.util.Scanner;
class palindrome
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
System.out.println(sum);
}
}
