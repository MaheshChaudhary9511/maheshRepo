import java.util.*;
class Employe
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   String str[]={"Mahesh","Anand","Arpita","Deepak"};
   for(String i:str)
{
   System.out.println("value is="+i);
 }

// here we are converting the string array to simple array as per as possible 
   String str1[]={"Mahesh","Anand","Arpita","Deepak"};
    String s=Arrays.toString(str1);
    System.out.println(s);
}
} 