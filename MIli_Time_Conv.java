 
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Mili_Time_Conv
{

    public static void main(String args[])throws IOException
{
    Scanner sc = new Scanner(System.in);
    String s  = sc.next();
    String pm = "12:00:00PM";
    String am = "12:00:00AM";
  int h=0;
 String hh=s.substring(0,2);
 String mm=s.substring(3,5);
 String ss=s.substring(6,8);
 String t = s.substring(8,10);
 String res="";
 s=s+"";
 if(t==("AM"))  //if input string is in am but 
 {
       if(s==("12:00:00AM"))  //if input string matches to 12:00:00AM
 {
 System.out.println("00:00:00");
}
    else if(hh==("12"))
    {
    h=Integer.parseInt(hh);
    h=0;
    res = h + ':' + mm + ':' + ss;
    System.out.println(res);
    }
    else
    {
        System.out.println(s.substring(0,8));        
    }
    
}
else if(t==("PM"))
{
      if(s==(pm)) //if string matches to 12:00:00PM
{
    System.out.println("12:00:00");
}
else
{
    h=Integer.parseInt(hh);
   res=(h+12)+":"+mm+":"+ss;
    System.out.println(res);
}
    }
}
}
