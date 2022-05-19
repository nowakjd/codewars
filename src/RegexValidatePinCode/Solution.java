package RegexValidatePinCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.
 */
public class Solution {

    public static boolean validatePin(String pin) {
        Pattern pattern = Pattern.compile("\\A[\\d]{4}([\\d]{2})?\\z");
        Matcher matcher = pattern.matcher(pin);
        return matcher.find();
    }
}
