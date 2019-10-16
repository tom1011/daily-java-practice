import java.util.Scanner;

class dailyjavaone {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String str1 = "word";
         System.out.print("Input Username: ");
         String string1 = in.nextLine();
         System.out.print("Input Password: ");
         String string2 = in.nextLine();
         System.out.print("Input Number: ");
         int int1 = in.nextInt();

        if (string2.equals(str1) ) 
		  {
			System.out.println("Welcome Back " + string1 + ".");

            }
		else
			{
			System.out.println("Wrong Password");
		}
  }
}