import java.io.*;
import java.util.*;
public class order
{
public static void main(String args[])throws Exception
{
int d=0,reverse,last;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
d=Integer.parseInt(br.readLine());
reverse=0;
while(d!=0)
{
last=d%10;
reverse=(reverse*10)+last;
d=d/10;
}
System.out.print(reverse);
}
}
