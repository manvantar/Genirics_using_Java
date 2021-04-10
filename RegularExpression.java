package com.bridgelabz;
import java.util.regex.*;
public class RegularExpression {
    public static void main(String[] args) {
        boolean firstname=checkName("Manu");
        boolean lastname=checkName("KV");
        boolean email=checkEmail("manukvshetty@gmail.com");
        boolean number=checkMobileNumber("91 9663393660");
    }

    private static boolean checkMobileNumber(String value) {


    }

    private static boolean checkEmail(String value) {
        boolean checkemail= Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[a-zA-Z\\\\d@$!%*?&]{8,}",value);
        return checkemail;
    }

    private static boolean checkName(String name) {
        boolean check=Pattern.matches("^[A-Z a-z]{3,25}$",name);
        return check;
    }




}
