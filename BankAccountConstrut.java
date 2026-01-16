package ProgramsPractices;

public class BankAccountConstrut 
{
	 BankAccountConstrut(double balance)
	 {
		 if (balance<=0) 
		 {
			System.out.println("Insufficient balance");
		}
		 else 
		 {
			 System.out.println("Proceed payment");
		}
	 }
	 public static void main(String[] args) 
	 {
		 BankAccountConstrut n1=new BankAccountConstrut(-12);
		n1.getClass();
		
	}

}
