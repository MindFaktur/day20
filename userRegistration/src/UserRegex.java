import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class UserRegex
{
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args)
    {
        AllRegexes AG = new AllRegexes();
        UserRegex UR = new UserRegex();
        String firstName = UR.getInput("First Name");
        String lastName = UR.getInput("Last Name");
        String email = UR.getInput("Email-id");
        String phoneNumber = UR.getInput("Phone Number");
        String password = UR.getInput("Password");

        UR.printsValidOrInvalid(AG.regexValidator(AG.nameRegex,firstName),firstName,"First Name" );
        UR.printsValidOrInvalid(AG.regexValidator(AG.nameRegex,lastName),lastName,"Last Name" );
        UR.printsValidOrInvalid(AG.regexValidator(AG.emailRegex,email),email,"Email-id" );
        UR.printsValidOrInvalid(AG.regexValidator(AG.mobNumberRegex,phoneNumber),phoneNumber,"Phone Number" );
        UR.printsValidOrInvalid(AG.regexValidator(AG.passwordRegex,password),password,"Password" );

    }

    private String getInput(String userField)
    {
        System.out.println("Please enter your " + userField);
        return SC.nextLine();
    }

    private void printsValidOrInvalid(boolean val, String name, String userField)
    {
        if ( val )
        {
            System.out.println(userField + " " + name + " is Valid ");
        }else
        {
            System.out.println(userField + " " + name + " is Invalid ");
        }
    }

}
