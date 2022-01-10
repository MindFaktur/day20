import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test cases for Email_Id

public class EmailRegexTest
{
    AllRegexes AG;

    @Before
    public void beforeMethod()
    {
        AG = new AllRegexes();
    }

    @Test
    public void testEmailRegex_True()
    {
        AllRegexes AG = new AllRegexes();
        String user = "vishwanathiti828@gmail.com";
        Assert.assertTrue(AG.regexValidator(AG.emailRegex,user));
    }

    @Test
    public void testEmailRegexGivenEmailWithoutATsymbol_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "vishwanath.gmail.com";
        Assert.assertFalse(AG.regexValidator(AG.nameRegex,user));
    }

    @Test
    public void testEmailRegexWithoutDOTafterDomainName_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "vishwanath@gmailcom";
        Assert.assertFalse(AG.regexValidator(AG.nameRegex,user));
    }

    @After
    public void afterMethod()
    {
        AG = null;
    }

}
