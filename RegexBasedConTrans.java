package com.codewithrutu.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasedConTrans {

    String regex = "((?i)india)|((?i)IND)";
    String REPLACE = "India";
    String regex2 = "((?i)us|california|United States)";
    String REPLACE2 = "United States of America";

    String regex3 = "cameroon";
    String REPLACE3 = "Cameroon";

    String regex4 = "uk|UK";
    String REPLACE4 = "United Kingdom";

    String regex5 = "(?i)TrinidadTRO";
    String REPLACE5 = "Trinidad";

    String regex6 = "(?i)afg";
    String REPLACE6 = "AFG";

    String regex7 = "(?i)arg";
    String REPLACE7 = "Argentina";

    String regex8 = "(?i)xxx|111|country";
    String REPLACE8 = "NULL";

    String transform(String attr, String attrToBeReplaced)
    {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(attr);

        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(attr);

        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(attr);

        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(attr);

        Pattern p5 = Pattern.compile(regex5);
        Matcher m5 = p5.matcher(attr);

        Pattern p6 = Pattern.compile(regex6);
        Matcher m6 = p6.matcher(attr);

        Pattern p7 = Pattern.compile(regex7);
        Matcher m7 = p7.matcher(attr);

        Pattern p8 = Pattern.compile(regex8);
        Matcher m8 = p8.matcher(attr);

        if (m.matches() && REPLACE==attrToBeReplaced)
            return m.replaceAll(REPLACE);
        else if(m.matches() && REPLACE!=attrToBeReplaced)
            return "attrToBeReplaced should have been "+REPLACE;
        else if (m2.matches()&& REPLACE2==attrToBeReplaced)
            return m2.replaceAll(REPLACE2);
        else if(m2.matches() && REPLACE2!=attrToBeReplaced)
            return "attrToBeReplaced should have been "+REPLACE2;
        else if (m3.matches() && REPLACE3==attrToBeReplaced)
            return m3.replaceAll(REPLACE3);
        else if(m3.matches() && REPLACE3!=attrToBeReplaced)
            return "attrToBeReplaced should have been "+REPLACE3;
        else if (m4.matches() && REPLACE4==attrToBeReplaced)
            return m4.replaceAll(REPLACE4);
        else if(m4.matches() && REPLACE4!=attrToBeReplaced)
            return "attrToBeReplaced should have been "+REPLACE4;
        else if (m5.matches() && REPLACE5==attrToBeReplaced)
            return m5.replaceAll(REPLACE5);
        else if(m5.matches() && REPLACE5!=attrToBeReplaced)
            return "attrToBeReplaced should have been "+REPLACE5;
        else if (m6.matches() && REPLACE6==attrToBeReplaced)
            return m6.replaceAll(REPLACE6);
        else if(m6.matches() && REPLACE6!=attrToBeReplaced)
            return "attrToBeReplaced should have been "+REPLACE6;
        else if (m7.matches() && REPLACE7==attrToBeReplaced)
            return m7.replaceAll(REPLACE7);
        else if(m7.matches() && REPLACE7!=attrToBeReplaced)
            return "attrToBeReplaced should have been "+REPLACE7;
        else if (m8.matches() && REPLACE8==attrToBeReplaced)
            return m8.replaceAll(REPLACE8);
        else if(m8.matches() && REPLACE8!=attrToBeReplaced)
            return "attrToBeReplaced should have been "+REPLACE8;
        else
            return "no match found for this country.";
    }
}
