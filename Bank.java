import java.util.*;
class BankingSystem{
    private static int accNumber;
    private static String accHolderName;
    private static int accountBalance;
    public BankingSystem(int accNumber , String accHolderName,int accountBalance){
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.accountBalance = accountBalance;
    }
    static void addBalance(int balance){
        if(balance >0){
            accountBalance+=balance;
        }
        else{
            System.out.println("paise ni h to yaha ku aya");
        }
    }
    static int withdraw(int balance){
        if(accountBalance<0){
            System.out.println("Bhai paise to dal de pahle");
        }
        else if(accountBalance > 0){
            accountBalance-=balance;
        }
        return accountBalance;
    }
    static boolean checkBalance(){
        return accountBalance>0;
    }
    public static void display() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
}
class Bank{
    public static void main(String[] args){
        BankingSystem bs = new BankingSystem(1234567890,"Ayush",10000);
        bs.addBalance(500);
        bs.withdraw(200);
        bs.display();
        if(bs.checkBalance()){
            System.out.print("High on Money");
        }
        else{
            System.out.print("low on Money");
        }

    }
}