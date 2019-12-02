import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class NewAccountClass {
private int id = 0;
private double balance = 0;
private double annualIntrestRate =0;
private String name;
private List<TransactionClass> list = new ArrayList<TransactionClass>();
private Date dateCreateDate  ;
	public NewAccountClass() {
		dateCreateDate = new  Date();
	}
	public NewAccountClass(int id , double balance) {
		dateCreateDate = new Date();
		this.id = id;
		this.balance = balance;
	}
	public NewAccountClass(int id , double balance, String name) {
		dateCreateDate = new Date();
		this.id = id;
		this.balance = balance;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public Date getDateCreateDate() {
		return dateCreateDate;
	}
	public double getMonthlyInterest() {
		double monthlyInterestRate = (getAnnualIntrestRate() / 12)/100;
		return balance * monthlyInterestRate;
		
	}
	public List<TransactionClass> transactionClasses() {
		return list;
	}
	public void withdraw(double amount) {
		TransactionClass transactionClass =new TransactionClass('W', amount, getBalance(), "Withdraw");
		this.list.add(transactionClass);
		setBalance(getBalance()-amount);
	}
	
	public void deposit(double amount) {
		
		setBalance(getBalance()+amount);
		
		TransactionClass transactionClass =new TransactionClass('D', amount, getBalance(), "Deposit");
		this.list.add(transactionClass);
	}
	public static void main(String[] args) {
		NewAccountClass accountClass = new NewAccountClass(1122,20000, "Mariam");
		accountClass.setAnnualIntrestRate(4.5);
		accountClass.withdraw(2500);
		accountClass.deposit(3000);
		List<TransactionClass> list = accountClass.transactionClasses();
		System.out.println(accountClass.getName());
		System.out.println(accountClass.getBalance());
		System.out.println(accountClass.getMonthlyInterest());
		System.out.println(accountClass.getDateCreateDate());
		for (TransactionClass transactionClass : list) {
			System.out.println(transactionClass.getType());
			System.out.println(transactionClass.getAmount());
			System.out.println(transactionClass.getBalance());
			System.out.println(transactionClass.getDescription());
			System.out.println(transactionClass.getDateCreateDate());
		}
		
	}
}
