package finbarre.Regex_validate_PIN_code;

/**
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String pin = "1234";
        Solution s = new Solution();
        System.out.println( s.validatePin(pin));
    }
}
