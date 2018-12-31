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

  public String toString(){
    return password;
  }

}
