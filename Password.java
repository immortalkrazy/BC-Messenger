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
    while(verify){
      if(length<=8){
        System.out.println("password to long");
        verify=true;
      }
      changePassword(password);
    }
  }

  public String toString(){
    return password;
  }

}
