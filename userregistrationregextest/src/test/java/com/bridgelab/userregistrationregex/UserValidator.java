package com.bridgelab.userregistrationregex;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    Pattern pattern;
    Matcher matcher;
    public boolean validateFirstName(String f_Name) {
       pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
       matcher=pattern.matcher(f_Name);
       if(matcher.matches())
           return true;
       else
           return false;
    }
}
