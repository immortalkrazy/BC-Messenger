
public class Password {

  private String password;

  public Password(){
    this.password = generateRandomPassword(20);
  }

  private String generateRandomPassword(int length){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
    char[] password = new char[length];
    for (int i = 0; i < length; i++){
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }
  private void changePassword(String newPword){
    System.out.println("password must contain atleast 8 characters");
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
