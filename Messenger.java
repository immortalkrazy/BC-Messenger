import java.util.Scanner;
public class Messenger{
  private String receive;
  private String sent;

   public static void main(String[]args){

     System.out.println("Welcome to BC Messenger!");
     System.out.println("1: Log In \n2: Sign Up");
     Scanner sc = new Scanner(System.in);
     int choice = sc.nextInt();
     switch(choice){
       case 1:
       logIn("user","pass");

       case 2:
       Account a = new Account("John Doe");
     }
     System.out.println("Password is: " + new Password());

     Address address1 = new Address();
     System.out.println(address1);

   }
   public static void logIn(String username, String password){
   }
   public static void signUp(String username, String password){

   }
   public Messeger(String receive, String sent){
     this.receive=receive;
     this.sent=sent;
   }

   public String setMesseger(String sent){
    return this.sent;
   }
   public String getMesseger(String receive){
     return this.receive;
   }
}
