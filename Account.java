//super class of so we can manipulae Accounts
public class Account{
  private String firstName;
  private String lastName;
  private String emplID;
  private String phoneNumber;
  private String email;
  private Address address;
  private String username;
  private String password;
  public Account(){

  }
  public Account(String emplID){
    this.emplID=emplID;
  }
  public Account(String firstName, String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
  }
  public String getusername(){
    return this.username;
  }
  public String getpassword(){
    return  this.password;
  }
  public String setusername(){
      return this.username;
  }
  public String setpassword(){
    return this.password;
  }
}
