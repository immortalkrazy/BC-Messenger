<<<<<<< HEAD

=======
import java.lang.Object;
>>>>>>> baf467826416b2ca9e2d078deff014915d4cef15
public class Password {

  private String password;

  public Password(){
    this.password = generateRandomPassword(20);
  }

  private String generateRandomPassword(int length){
  char[] possibleCharacters = (new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?")).toCharArray();
  String randomStr = RandomStringUtils.random( randomStrLength, 0, possibleCharacters.length-1, false, false, possibleCharacters, new SecureRandom() );
  System.out.println( randomStr );

  }
  private void changePassword(String newPword){
    System.out.println("Password must contain at least 8 characters");
    System.out.println("Enter new password: ");
    password=newPword;
    verifyPassword(password);
  }
  public void verifyPassword(String password){
    boolean verify=false;
    int length=password.length();
    boolean hasDigit= false;
    boolean hasLetter=false;
    while(verify){
<<<<<<< HEAD
      if(length>=8){
        for(int i=0;i<length;i++){
          char x= password.charAt(i);
          if(Character.isLetter(x)){
            hasLetter=true;
        }
          if(Character.isDigit(x)){
            hasDigit=true;

        }
        if(hasDigit&&hasLetter){
          break;
        }
=======
      if(length<=8){
        System.out.println("Password too long");
        verify=true;
>>>>>>> baf467826416b2ca9e2d078deff014915d4cef15
      }

      }
     if(hasDigit&&hasLetter){
       System.out.println("Strong Password");
       verify=true;
     }
     else{
          System.out.println("WEAK Password");
      changePassword(password);
    }
    }
  }

  public String toString(){
    return password;
  }

}
