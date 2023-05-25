package day02;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean a=true;
{
	System.out.println(a);//we cannot use same variable for diff data type r same datatype for storage purpose
}
a=false;//but we can reassign the value 
{
	System.out.println(a);
}
byte a1=127;//8bit 
{
	System.out.println(a1);
}
short a2=32767;//16 bit
{
	System.out.println(a2);
}
int a3=2345678;   //32 bit
{
		System.out.println(a3);
	}//we cant assign less storage to store higher storage ex a2=a3 short to int
long a4=1234567;//32 bit + 32 bit 
{
	System.out.println(a4);
}
long a5=123456789890l;// it will store 32+32 bit so we shd mention l but it will not prine in console
{
	System.out.println(a5);
}
float a6=23456.234567f;//shd mention f 32 bit
{
	System.out.println(a6);
}
double a7=23456.3456788999777d;//shd mention d 32+32 bit
{
	System.out.println(a7);	
}
char a8='m';//single char in singlle quotes
{
		System.out.println(a8);
	}
String a9="fs234457789$&";//non primitive no fixed memory no limit we can store any kind of datatype in double quotes
{
	System.out.println(a9);//string is predefined class but acts as datatypes starts with caps
}
	}

}
