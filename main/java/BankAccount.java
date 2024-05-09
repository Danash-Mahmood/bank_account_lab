import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private long accountNumber;
    private double balance;

    private String accountType;

    double overdraft;



    public BankAccount(String firstName,String lastName, String dateOfBirth,int accountNumber, double balance,String accountType,double overdraft){
                this.firstName = firstName;
                this.lastName = lastName;
                this.dateOfBirth = dateOfBirth;
                this.accountNumber = accountNumber;
                this.balance = 0;
                this.accountType = accountType;
                this.overdraft = overdraft;






    }

    public void setFirstName(String input){
        this.firstName = input;

    }

    public void setLastName(String input){
        this.lastName = input;
    }


    public String getFirstName(){
        return this.firstName;


    }

    public String getLastName(){
        return this.lastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String inputD0B){
        this.dateOfBirth = inputD0B;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    //account numbers shouldn't change so this method will be redundant

    public void setAccountNumber(long input){
        this.accountNumber = input;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double addMoney){
        this.balance += addMoney;
    }

    public void withdraw(double minusMoney){
        if (this.balance - minusMoney < -1*this.overdraft){
            System.out.println("You cannot withdraw this amount - insufficent funds");
        }
        this.balance -= minusMoney;
    }

    public void payInterest(double interestRateDecimal){
        if (this.accountType.equalsIgnoreCase("savings")){

        this.balance = this.balance*(1+interestRateDecimal);
    }
        else{

        this.balance = this.balance*(1+(interestRateDecimal/2));
        }
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setAccountType(String newAccountType){
        this.accountType = newAccountType;
    }

    public double getOverdraft(){
        return this.overdraft;
    }









}
