package account;


public class Main {
	public static void main(String[] args)
	{
        Account sehyunAccount = new Account("Sehyun", "sehyun@email.com","12345");
        System.out.println(sehyunAccount.getNumber() + " name " + sehyunAccount.getCustomerName());
        System.out.println("Current balance is " + sehyunAccount.getBalance());
        sehyunAccount.withdrawal(100.55);
	}
}
