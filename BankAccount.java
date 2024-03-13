import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
public class BankAccount extends Bank{
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
  LocalDateTime now = LocalDateTime.now();

          String accountName;
  private double balance;
  private int accountId;
  private int accountNumber;
  //this is the constructor
public  BankAccount(String name, String location, int code,String accountName, int balance, int accountId, int accountNumber){
  //calling the super constructor
  super(name, location,code);
  this.accountName = accountName;
  this.balance = balance;
  this.accountId = accountId;
  this.accountNumber = accountNumber;
}
//Account details using toString() method
public String toString(){
  return "\n" +"Account Owner: " + this.accountName.toUpperCase() +"\n"+ "Actual balance: " 
  + this.balance +"$\n" +"Account Id: " + this.accountId +
  "\n"+"Number: " + this.accountNumber+"\nBank Name: "+this.name +"\nLocation: "+this.location;
};
//this is the get balance method
public void getBalance(){
    System.out.println("Available funds: "+this.balance+"$\n"+"Last activity date "+dtf.format(now));
}
//this is the deposit method
public void deposit(double amount){
  this.balance += amount;
  System.out.println("You added an amount of "+amount + "$"+" to your account on "+dtf.format(now)+"\nYour actual balance is "+this.balance+"$");
} 
//this is the withdraw method
public void withdraw(double amountToWithdraw){
  /*if(amountToWithdraw > this.balance){
    System.out.println("You don't have this amount available");
  } else{
      System.out.println("You withdrew an amount of " +amountToWithdraw +"$" +"from your account on "+dtf.format(now));
  this.balance -=amountToWithdraw;
  System.out.println("your actual balance is "+this.balance+"$");
  }*/
  //Using ternary operator to simplify code
  /*String message = amountToWithdraw > this.balance
            ? "Insufficient balance "  
            : "Your actual balance is " + (this.balance-= amountToWithdraw) + "$";
            System.out.println(message);*/
            System.out.println(amountToWithdraw > this.balance
        ? "You don't have this amount available"
        : "You withdrew an amount of " + amountToWithdraw + "$ from your account on "+ dtf.format(now) +"\n"+
          "Your actual balance is " + (this.balance -= amountToWithdraw) + "$");

}
}