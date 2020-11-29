package cmdTest;





import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
    
	@Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue(true);
    }
    
    @Test 
    public void method2()
    {
    	System.out.println("method 2");
    }
    
    @Test 
    public void method3()
    {
    	System.out.println("method 3");
    }
    
}
