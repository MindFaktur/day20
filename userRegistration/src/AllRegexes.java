import java.util.regex.Pattern;

public class AllRegexes
{

    public final String nameRegex = "^[A-Z][a-z]{3,}$";
    public final String emailRegex = "^[a-zA-Z0-9][a-zA-Z0-9+_.-]+@[a-zA-Z0-9][a-zA-Z0-9]+[+_.-][a-zA-Z0-9]+$";
    public final String mobNumberRegex = "^[0-9]{2} [6789][0-9]{9}$";
    public final String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";

    public boolean regexValidator(String regex, String value)
    {
        return Pattern.matches(regex,value);
    }

}
