package Pack1;

public class TaskReturnemail {

	public static void main(String[] args) {
		
		
		TaskReturnemail trial=new TaskReturnemail();
		String email=trial.createEmail("john", "snow", "gmail");
         System.out.println(email);
	}
	
	
	
	
	String createEmail(String name, String lastName, String emailType) {
		
		String email=name+lastName+ "@" + emailType + "com";
		return email.toLowerCase();
	}
	
	
	}

