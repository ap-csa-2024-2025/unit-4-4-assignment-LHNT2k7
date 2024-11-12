import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
      String str = "peter piper blah";
      int count = 0;
      for (int i = 0, i < str.length()-1; i++)
      {
        String pair = input.substring(i, i+2);
  if (pair.equals("pa") || pair.equals("pe") || pair.equals("pi") || pair.equals("po") || pair.equals("pu"))
          {
              count++;
          }
      }
  }
System.out.println("Contains p followed by a vowel " + count + " times."); 

Scanner sc = new Scanner(System.in);
String input;
String other = "";

System.out.println("Input String:");
input = sc.nextLine();

for (int i = 0; i < input.length(); i++)
{
  String ch = input.substring(i, i+1);
  if (! (ch.equals("e") || ch.equals("t") || ch.equals("a") || ch.equals("i") || ch.equals("o")) )
  {
    other += ch;
  }
}
System.out.println(other);
 
 
 
 
 
  public static boolean isPrime(int N)
  {
    
    return false;
  }
}
