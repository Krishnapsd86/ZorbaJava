package userDefineData;

public class assignmentOf {

	public static void main(String[] args) {

		Bank Icic = new Bank(1000, 1230, "Icic", "Current");
		Bank Icic1 = new Bank(1000, 1231, "Icic1", "Checking");
		Bank Icic2 = new Bank(1000, 12302, "Icic2", "Current");
		Bank Icic3 = new Bank(1000, 12303, "Icic3", "Checking");

		System.out.println(Icic1.accName);
		Icic1.Deposit(1000, Icic1.type);

		Icic1.Withdraw(5000);
		// Icic1.transactions();
		System.out.println("--------------------------------------------");
		System.out.println(Icic2.accName);
		Icic2.Deposit(1000, Icic2.type);
		Icic2.Deposit(100000, Icic2.type);
		Icic2.Withdraw(50000);
		System.out.println("--------------------------------------------");
		System.out.println(Icic3.accName);
		Icic3.Deposit(107000, Icic3.type);
		Icic3.Deposit(17000, Icic3.type);
		Icic3.Withdraw(500);
		System.out.println("--------------------------------------------");
		System.out.println(Icic.accName);
		Icic.Deposit(7000, Icic.type);
		Icic.Withdraw(5000);

	}

}

class Bank {
	public static String Checking;
	public static String Current;
	int bal;
	int accNo;
	String accName;
	String type;
	String country;
	int[] transactions;
	// ArrayList<int[]> transactions;

	public Bank(int bal, int accNo, String accName, String type) {
		this.bal = bal;
		this.accNo = accNo;
		this.accName = accName;
		this.type = type;
		this.country = "Nepal";
		this.transactions = new int[5];

	}

//class Transaction extends Bank {
//
//	public Transaction(int bal, int accNo, String accName, String type, int transactions) {
//		super(bal, accNo, accName, type);
//		this.transactions = new ArrayList<int[]>();
//		
//	}
//
//}

	class Checking extends Bank {

		public Checking(int bal, int accNo, String accName, String type) {
			super(bal, accNo, accName, type);

			this.accName = accName;
			this.type = "Checking";
			this.bal = bal;
		}

	}

	class Current extends Bank {

		public Current(int bal, int accNo, String accName, String type) {
			super(bal, accNo, accName, type);
			this.accName = accName;
			this.type = "Current";
			this.bal = bal;

		}

	}

//	public void transactions() {
//		ArrayList<int[]>Trans= new ArrayList<int[]>();
//		
//		}
//class Deposit extends Transaction {
//	int[] amount;
//
//	public Deposit(int bal, int accNo, String accName, String type, int transactions, int[] amount) {
//		super(bal, accNo, accName, type, transactions);
//		this.amount = amount;
//	}
//
//	public int Deposit(int bal, String type, int transactions, int amount) {
//
//		if (type.equals("Checking")) {
//			this.bal = this.bal + amount;
//			int interest = this.bal * 5 / 100;
//			this.bal = this.bal + interest;
//			System.out.println("Deposit successful");
//			System.out.println("After Deposit, Checking Balance is: " + this.bal);
//			// transactions.equals(Checking);
//
//			return this.bal;
//		}
//		return transactions;
//	}
//
//	class Withdraw extends Deposit {
//
//		public Withdraw(int bal, int accNo, String accName, String type, int transactions, int[] amount) {
//			super(bal, accNo, accName, type, transactions, amount);
//
//		}
//
//	}
//
	public int Deposit(int amount, String accType) {

		if (accType.equals("Checking")) {
			this.bal = this.bal + amount;
			int interest = this.bal * 5 / 100;
			this.bal = this.bal + interest;
			System.out.println("Deposit successful");
			System.out.println("Checking Balance is: " + this.bal);
			transactions.equals(Checking);

			return this.bal;

		} else {
			this.bal = this.bal + amount;
			int interest = this.bal * 10 / 100;
			this.bal = this.bal + interest;
			System.out.println("Deposit successful");
			System.out.println("Current Balance is: " + this.bal);
			transactions.equals(Current);
//			transactions();
//			transaction= new ArrayList<int>(amount);
//			transactions.add(amount, 5);
			return this.bal;
		}

	}

	public void Withdraw(int amount) {

		if (amount == 0 || amount > this.bal) {
			System.out.println("Insufficient Balance, Please Enter valid amount ");
		}

		else if (Bank.Checking == "Checking") {
			this.bal = this.bal - amount;
			int interest = this.bal * 5 / 100;
			this.bal = this.bal - interest;
			System.out.println("Now Available Balance in Checking account after Current Withdrawl is: " + this.bal);
			// transactions.equals(Checking);
		} else {
			this.bal = this.bal - amount;
			int interest = this.bal * 10 / 100;
			this.bal = this.bal - interest;
			System.out.println("Available Balance in Current account after Current Withdrawl is: " + this.bal);
			// transactions.equals(Current);
			// return this.bal;

		}

	}

}
