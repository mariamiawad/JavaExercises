import java.util.Date;

public class TransactionClass {
	private Date dateCreateDate;
	private char type;
	private double amount;
	private double balance ;
	private String description;
	public TransactionClass() {
		// 
	}
	public TransactionClass(char type, double amount, double balance, String description ) {
		this.type =type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		this.dateCreateDate = new Date();
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public Date getDateCreateDate() {
		return dateCreateDate;
	}
	public String getDescription() {
		return description;
	}
	public char getType() {
		return type;
	}

}
