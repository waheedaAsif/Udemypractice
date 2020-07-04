package udemyPractice;

public class Account {
	
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public Account() {
	this("56743", 2.50,"Default name", "Default address", " default phone");
		System.out.println("Empt constructor called");
	} 
	
	public Account(String number, double balance, String customerName, String customerEmailAddress,
			String customerPhoneNumber) {
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance );
	}
	public void withdrawal (double withdrawalAmount) {
		if (this.balance - withdrawalAmount <=0) {
			System.out.println("Only " + this.balance + " avaliable.withdrawal not processed");
		}else {
			System.out.println("withdrawal of " + withdrawalAmount + " processed. Remaining balance =" 
		+ this.balance);
		}
	}
	
	
	public String getNumber() {
		 return number;
	}	 
    public void setNumber(String number) {
    	this.number = number;
    }
    
   public double getBalance() {
	   return balance;
   }
    
	public void setBalance(double balance) {	
        this.balance = balance;
	}
    public String getcustomerName() {
    	return customerName;
    }
    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getcustomerEmailAddress() {
    	 return customerEmailAddress;
    }
    public void  setcustomerEmailAddress(String customerEmailAddress) {
    	 this.customerEmailAddress = customerEmailAddress;
    }
    public String getcustomerPhoneNumber() {
    	return customerPhoneNumber;
    }
    public void setcustomerPhoneNumber(String customerPhoneNumber) {
    	this.customerPhoneNumber = customerPhoneNumber;
    }
    
    
    


}