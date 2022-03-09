//CHECK WHETHER GIVEN NUMBERS ARE FRIENDLY PAIR OR NOT
import java.io.*;
import java.util.*;

public class FRIENDLY_PAIR
{
public static void main(String args[])
{
int sum=0,sum1=0;
Scanner s=new Scanner(System.in);

System.out.println("Enter two numbers");

System.out.print("first number :");
int n=s.nextInt();

System.out.print("second number :");
int n1=s.nextInt();

for(int i=1;i<=n;i++)
{
  if(n%i==0)
   {
     sum=sum+i;
    }
}

for(int i=1;i<=n1;i++)
{
  if(n1%i==0)
   {
    sum1=sum1+i;
   }
}

float div=sum/n;
float div1=sum1/n1;

if(div==div1)
{
System.out.println(n+" and "+n1+" is friendly pair");
}
else
{
System.out.println(n+" and "+n1+" is not a friendly pair");
}
}
}
/*
INPUT - Enter two numbers
        first number :6
        second number :28

OUTPUT - 6 and 28 is friendly pair*/
        