//private acssess with in the class

class Encap{
  private long accountNumber;
private String password;  //setpassword, forgot password
 
  public void setAccountNumber(long accountNumber){
    this.accountNumber=accountNumber;
  }
  public long getAccountNumber(){
    return accountNumber;
  }
  public void setPassword(String password){
    this.password=password;
  }
  public String getPassword(){
    return password;
  }
 
  
}
public class EncapDemo{
  public static void main(String[] args){
    Encap obj=new Encap();
    obj.setAccountNumber(1234567);
    obj.setPassword("madar123");
    System.out.println(obj.getAccountNumber()+"  "+obj.getPassword());
  }
}