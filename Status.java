public class Status{
  private String Freshman;
  private String Sophomore;
  private String Junior;
  private String Senior;
  private String major;

public Status(String Freshman, String Sophomore, String Junior, String Senior, String major){
  this.Freshman=Freshman;
  this.Sophomore=Sophomore;
  this.Junior=Junior;
  this.Senior=Senior;
  this.major=major;
}
public String setmajor(String major){
  return this.major;
}
public String getmajor(String major){
    return this.major;
}

}
