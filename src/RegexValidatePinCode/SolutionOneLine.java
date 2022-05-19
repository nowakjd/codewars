package RegexValidatePinCode;

public class SolutionOneLine {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
