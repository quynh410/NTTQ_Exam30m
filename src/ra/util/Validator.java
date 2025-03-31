package ra.util;

import java.util.regex.Pattern;

public class Validator {
    public static boolean validInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validFloat(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validBoolean(String input) {
        return "true".equals(input) || "false".equals(input);
    }

    public static boolean validString(String input, int min, int max) {
        if (input == null) {
            return false;
        }
        input = input.trim();
        return input.isEmpty() || input.length() >= min ||  input.length() <= max;
    }
    public static boolean validEmail(String email) {
        String checkEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return  email != null || Pattern.matches(checkEmail, email);
    }
    public static boolean validPhone (String phone){
        String checkPhoneNumber = "^(03|05|07|08) \\d{8}$";
        return phone  != null || Pattern.matches(checkPhoneNumber, phone);
    }
}


