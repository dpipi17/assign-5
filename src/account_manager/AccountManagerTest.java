package account_manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState.PassType;

class AccountManagerTest {

	@Test
	public void accountExistsTest() {
		AccountManager aM = new AccountManager();
		
		assertEquals(aM.accountExists("Molly"), true);
		assertEquals(aM.accountExists("Patrick"), true);
		assertEquals(aM.accountExists("Demetre"), false);
		assertEquals(aM.accountExists("Lebron"), false);
	}
	
	
	
	@Test
	public void isCorrectPasswordtest() {
		AccountManager aM = new AccountManager();
		
		assertEquals(aM.isCorrectPassword("Molly", "FloPup"), true);
		assertEquals(aM.isCorrectPassword("Patrick", "1234" ), true);
		assertEquals(aM.isCorrectPassword("Demetre", "1234"), false);
		assertEquals(aM.isCorrectPassword("Lebron", "James"), false);
	
	}
	
	
	
	@Test
	public void createNewAccounttest() {
		AccountManager aM = new AccountManager();
		
		assertEquals(aM.accountExists("Demetre"), false);
		assertEquals(aM.isCorrectPassword("Demetre", "1234"), false);
		aM.createNewAccount("Demetre", "1234");
		assertEquals(aM.accountExists("Demetre"), true);
		assertEquals(aM.isCorrectPassword("Demetre", "1234"), true);
		
		
		assertEquals(aM.accountExists("Lebron"), false);
		assertEquals(aM.isCorrectPassword("Lebron", "James"), false);
		aM.createNewAccount("Lebron", "James");
		assertEquals(aM.accountExists("Lebron"), true);
		assertEquals(aM.isCorrectPassword("Lebron", "James"), true);
		
		
		assertEquals(aM.accountExists("Molly"), true);
		assertEquals(aM.isCorrectPassword("Molly", "FloPup"), true);
		aM.createNewAccount("Molly", "newPassword");
		assertEquals(aM.accountExists("Molly"), true);
		assertEquals(aM.isCorrectPassword("Molly", "FloPup"), true);
		
	}
	

}
