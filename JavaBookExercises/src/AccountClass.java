

import java.util.Calendar;
import java.util.Date;

public class AccountClass {
private int id = 0;
private double balance = 0;
private double annualIntrestRate =0;
private Date dateCreateDate  ;
	public AccountClass() {
		dateCreateDate = new  Date();
	}
	public AccountClass(int id , double balance) {
		dateCreateDate = new Date();
		this.id = id;
		this.balance = balance;
	}
	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
	}
	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public Date getDateCreateDate() {
		return dateCreateDate;
	}
	public double getMonthlyInterest() {
		double monthlyInterestRate = (getAnnualIntrestRate() / 12)/100;
		return balance * monthlyInterestRate;
		
	}
	public void withdraw(double amount) {
		setBalance(getBalance()-amount);
	}
	public void deposit(double amount) {
		setBalance(getBalance()+amount);
	}
	public static void main(String[] args) {
		AccountClass accountClass = new AccountClass(1122,20000);
		accountClass.setAnnualIntrestRate(4.5);
		accountClass.withdraw(2500);
		accountClass.deposit(3000);
		System.out.println(accountClass.getBalance());
		System.out.println(accountClass.getMonthlyInterest());
		System.out.println(accountClass.getDateCreateDate());
	}
}
