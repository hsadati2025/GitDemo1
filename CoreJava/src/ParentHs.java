import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentHs {

	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("run me first");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("run me last");
		System.out.println("run me last2");
		System.out.println("run me last3");
		System.out.println("run me last4");
	}
	
	public void doThis() 
	{
		System.out.println("I am here");
	}

}
