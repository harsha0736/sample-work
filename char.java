import java.util.*;
class Char
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of characters:");
int n=sc.nextInt();
String in[]=new String[n];
for(int i=0;i<n;i++)
{
in[i]=sc.next();
}
for(int i=0;i<n;i++)
{
if(in[i].equals("dle"))
{
in[i]="dle dle";
}
}
System.out.println("TRANSMITTED MESSAGE IS:");
System.out.println("FLAG ESC");
for(int i=0;i<n;i++)
{
System.out.print(in[i]+"");
}
System.out.print("dle");
}
}