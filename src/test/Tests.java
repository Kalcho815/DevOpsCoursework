package test;
import main.Dec2Hex;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testStringInput(){
        String input = "Ok";
        Assert.assertEquals("Argument is not an integer", Dec2Hex.convert(new String[]{input}));
    }

    @Test
    public void testEmptyInput(){
        Assert.assertEquals("No arguments provided.", Dec2Hex.convert(new String[]{}));
    }
}


