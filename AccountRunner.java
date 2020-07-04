package udemyPractice;

public class AccountRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account bobsAccount = new Account();// ("123445", 0.00,"Bob Brown", "myemail@bob.com",
				//" (087)123-4567");
		System.out.println(bobsAccount.getNumber());
		System.out.println(bobsAccount.getBalance());
		
		
		bobsAccount.withdrawal (100.0);
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);
	}

}
