package com.bridgelabz;
import java.util.regex.*;
public class RegularExpression {
    public static void main(String[] args) {
        boolean firstname=checkName("Manu");
        boolean lastname=checkName("KV");
        boolean email=checkEmail("manukvshetty@gmail.com");
    }

    private static boolean checkEmail(String value) {
        boolean checkemail= Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",value);
        return checkemail;
    }

    private static boolean checkName(String name) {
        boolean check=Pattern.matches("^[A-Z a-z]{3,25}$",name);
        return check;
    }




}
