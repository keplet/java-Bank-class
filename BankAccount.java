/*
 * @Author Keplet Saintil
 * Date: 13/03/2024
 * @Description: This is a project I started working on for my Java learning path.
 */
//import the java.time.format package
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
public class BankAccount extends Bank{
  //get the current transaction time
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
  LocalDateTime now = LocalDateTime.now();
  //Instantiating the fields
  private String accountOwner;
  private double balance;
  private int accountId;
  private int accountNumber;
  //this is the constructor
public  BankAccount(String name, String location, int code,String accountOwner, int balance, int accountId, int accountNumber){
  //calling the super constructor
  super(name, location,code);
  this.accountOwner = accountOwner;
  this.balance = balance;
  this.accountId = accountId;
  this.accountNumber = accountNumber;
}
//Account details using toString() method
public String toString(){
  return "\n" +"Account Owner: " + this.accountOwner.toUpperCase() +"\n"+ "Actual balance: " 
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
  //Using ternary operator to simplify code
            System.out.println(amountToWithdraw > this.balance
        ? "You don't have this amount available"
        : "You withdrew an amount of " + amountToWithdraw + "$ from your account on "+ dtf.format(now) +"\n"+
          "Your actual balance is " + (this.balance -= amountToWithdraw) + "$");
}
//check account details
public void checkDetails(){
  System.out.println(toString());
}
}