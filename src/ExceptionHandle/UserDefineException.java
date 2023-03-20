package ExceptionHandle;

class InvalidAgeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String msg){
		System.out.println(msg);
	}
}

public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Vote(90);
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	public static void Vote(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Not Eligible for Vote");
		}else if(age>80){
			throw new InvalidAgeException("Please verify your age with Voter Staff");
		}else{
			System.out.println("Eligible for Voting...");
		}
	}

}

