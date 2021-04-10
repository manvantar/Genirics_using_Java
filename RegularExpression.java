package com.bridgelabz;
import java.util.regex.*;
public class RegularExpression {
    public static void main(String[] args) {
        boolean firstname=checkName("Manu");

    }

    private static boolean checkName(String name) {
        boolean check=Pattern.matches("^[A-Z a-z]{3,25}$",name);
        return check;
    }




}
