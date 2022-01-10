import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test cases for Password

public class PasswordRegexTest
{
    AllRegexes AG;

    @Before
    public void beforeMethod()
    {
        AG = new AllRegexes();
    }

    @Test
    public void testPasswordRegex_True()
    {
        AllRegexes AG = new AllRegexes();
        String user = "Vishw764#6";
        Assert.assertTrue(AG.regexValidator(AG.passwordRegex,user));
    }

    @Test
    public void testPasswordRegexGivenNoSpecialCharacters_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "vishw8298";
        Assert.assertFalse(AG.regexValidator(AG.passwordRegex,user));
    }

    @Test
    public void testPasswordRegexGivenNoNumbers_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "vishw%$kja";
        Assert.assertFalse(AG.regexValidator(AG.passwordRegex,user));
    }

    @Test
    public void testPasswordRegexGivenNoCapitalLetters_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "vishw%$kja";
        Assert.assertFalse(AG.regexValidator(AG.passwordRegex,user));
    }

    @Test
    public void testPasswordRegexGivenCharactersLessThanEight_False()
    {
        AllRegexes AG = new AllRegexes();
        String user = "vt%987";
        Assert.assertFalse(AG.regexValidator(AG.passwordRegex,user));
    }

    @After
    public void afterMethod()
    {
        AG = null;
    }

}
