import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test cases for firstname and lastname

public class NameRegexTest
{
    AllRegexes AG;

    @Before
    public void beforeMethod()
    {
        AG = new AllRegexes();
    }

    @Test
    public void testNameRegex_True()
    {
        AllRegexes AG = new AllRegexes();
        String user = "Vishwanath";
        Assert.assertTrue(AG.regexValidator(AG.nameRegex,user));
    }

    @Test
    public void testNameRegexGivenAllLowerCaseLetters_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "vishwanath";
        Assert.assertFalse(AG.regexValidator(AG.nameRegex,user));
    }

    @Test
    public void testNameRegexGivenMoreThanOneCapitalCaseLetters_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "VISHWANATH";
        Assert.assertFalse(AG.regexValidator(AG.nameRegex,user));
    }

    @Test
    public void testNameRegexGivenOnlyThreeLetters_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "Vis";
        Assert.assertFalse(AG.regexValidator(AG.nameRegex,user));
    }

    @Test
    public void testNameRegexGivenNumbers_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "Vishwa828";
        Assert.assertFalse(AG.regexValidator(AG.nameRegex,user));
    }

    @Test
    public void testNameRegexGivenSpecialCharatcers_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "Vishwa@";
        Assert.assertFalse(AG.regexValidator(AG.nameRegex,user));
    }

    @After
    public void afterMethod()
    {
        AG = null;
    }

}
