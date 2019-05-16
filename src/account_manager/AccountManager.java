package account_manager;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {

	// private instance variables
	private Map<String, String> users;
	
	// constructor
	public AccountManager() {
		users = new HashMap<String, String>();
		
		// put starter accounts into map
		users.put("Patrick", "1234");
		users.put("Molly", "FloPup");
	}
	
	// determines if this user name already used
	public boolean accountExists(String userName) {
		return users.containsKey(userName);
	}
	
	// determines if the password is correct
	public boolean isCorrectPassword(String userName, String password) {
		if(accountExists(userName)) {
			return password.equals(users.get(userName));
		}
		
		return false;
	}
	
	// creates new account
	public void createNewAccount(String userName, String password) {
		if(!accountExists(userName)) {
			users.put(userName, password);
		}
	}
	
	
}
