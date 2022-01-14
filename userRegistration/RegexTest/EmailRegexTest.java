import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

// Test cases for Email_Id

@RunWith(Parameterized.class)
public class EmailRegexTest
{
    private String email;
    private boolean expectedResult;

    AllRegexes AG;

    public EmailRegexTest(String emailValue, boolean expected_result){
        this.email = emailValue;
        this.expectedResult = expected_result;
    }

    @Before
    public void beforeMethod()
    {
        AG = new AllRegexes();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]
                {
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }

    @Test
    public void testEmailRegex_True()
    {
        Assert.assertEquals(expectedResult,AG.regexValidator(AG.emailRegex, email));
    }

    @After
    public void afterMethod()
    {
        AG = null;
    }

}
