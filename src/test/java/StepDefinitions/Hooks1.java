package StepDefinitions;

import ConfigPack.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks1 extends Base{

	//////////////////////////
	
	@After("@smoketest")
	public void aftervalidation() {
driver.close();
	}
	
}
