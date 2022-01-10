import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test cases for Phone Number

public class PhoneNumberRegexTest
{
    AllRegexes AG;

    @Before
    public void beforeMethod()
    {
        AG = new AllRegexes();
    }

    @Test
    public void testPhoneNumberRegex_True()
    {
        AllRegexes AG = new AllRegexes();
        String user = "91 9879289715";
        Assert.assertTrue(AG.regexValidator(AG.mobNumberRegex,user));
    }

    @Test
    public void testPhoneNumberRegexGivenAlphabets_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "vishw";
        Assert.assertFalse(AG.regexValidator(AG.mobNumberRegex,user));
    }

    @Test
    public void testPhoneNumberRegexGivenNoCountryCode_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "9879289715";
        Assert.assertFalse(AG.regexValidator(AG.mobNumberRegex,user));
    }

    @Test
    public void testPhoneNumberRegexGivenNoSpaceBetweenCountryCodeAndNumber_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "919879289715";
        Assert.assertFalse(AG.regexValidator(AG.mobNumberRegex,user));
    }

    @After
    public void afterMethod()
    {
        AG = null;
    }

}
