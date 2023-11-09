
public class SavingsAccount extends BankAccount {
	
	private static final double RATE = 0.025;
	
	private int savingsNumber; 
	
	private String accountNumber;

	public SavingsAccount(String name, double initialAmount) {
		
		super(name, initialAmount);
		savingsNumber = 0;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;

	}
	
	public SavingsAccount(String name, double initialAmount, int savingsNumber) 
	{
		super(name, initialAmount); 
		this.savingsNumber = savingsNumber; 
		accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
	public void postInterest() 
	{
		double interest = getBalance() * RATE / 12;
		deposit(interest);
	}
	
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
	
    public SavingsAccount(SavingsAccount originalAccount, double initialAmount) {
        super(originalAccount, initialAmount); // Call the copy constructor of the superclass
        this.savingsNumber = originalAccount.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }
    
    
}
