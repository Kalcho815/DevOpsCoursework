import org.junit.Assert;
import org.junit.Test;

public class Tests {
	
    //testing the case where the input is not an integer
    @Test
    public void testStringInput(){
        String input = "Ok";
        Assert.assertEquals("Argument is not an integer", Dec2Hex.convert(new String[]{input}));
    }
    
    //testing the case where there are not arguments provided
    @Test
    public void testEmptyInput(){
        Assert.assertEquals("No arguments provided.", Dec2Hex.convert(new String[]{}));
    }
}


