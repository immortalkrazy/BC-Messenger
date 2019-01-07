import java.lang.Object;
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
    while(verify){
      if(length<=8){
        System.out.println("Password too long");
        verify=true;
      }
      changePassword(password);
    }
  }

  public String toString(){
    return password;
  }

}
