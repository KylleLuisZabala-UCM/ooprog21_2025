public class FixDebug One
{
   /* This program displays a greeting */
   public static void Main(String args)   
   {
      Systm.out.println("Hello World!")         
   }
}

/*
List down the spotted bugs below:
e.g.
- // wrong syntax for access modifier "publlic" instead of "public"
Bugs:
1. Wrong class name format: "FixDebug1 One" should be "FixDebug One"         
2. wrong syntax method "Main" should be "main"
3. wrong syntax "Systm.out.println" should be "System.out.println"
4. Missing the statement ending semi-colon for the Hello world line.
*/

/** Debugged Code: 

public class FixDebugOne
{
//This program displays a greeting
public static void main(String[] args) 
{
System.out.println("Hello World");
}

}

 */