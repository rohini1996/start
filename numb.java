import java.io.*;
import java.util.Scanner;
class numb
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int count=0,t;
while(num>0)
{

num=num/10;
count=count+1;
}
System.out.println(count);
}
}
