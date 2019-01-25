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
  private String yearin;
  private String friends;
  private int age;
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
  public void setusername(String username){
      this.username = username;
  }
  public void setpassword(String password){
      this.password = password;
  }
  public String getyearin(){
  return  this.yearin;
  }
  public String getfriends(){
  return this.friends;
}
public String setyearin(String yearin){
  return this.yearin = yearin;
}
public String setfriends(String friends){
  return this.friends = friends;
}
public int getage(){
  return this.age;
}
public int setage(int age){
  return this.age= age;
}
}
