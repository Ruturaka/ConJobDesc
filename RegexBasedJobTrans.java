package com.codewithrutu.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasedJobTrans {
    //1. Account manager - ohs, Account manager or Account SR Account manager -ohs--> Account Manager - OHS
    String regex="Account manager,SR|((SR, )?Account manager (-ohs))|Account (manager)|(SR, )?Account manager";
    String REPLACE = "Account Manager - OHS";

    //String regex2="CTO IT|Portfolio Sample|&1QA!QH|TE(ER|st|ch|)?|Test(Job|er|ing|qa)?|([0-7]+)|([A-I])+|a(a|b|c|d|s|f|z)|d+|desc(jobcode|descript)?|‘’|Conversison|JCode|Desc|JCodeDesc Mod|JCodeDesc|JD|JDESC|JDesc|JJ(J)+|JOB|JcodeDesc|Jdesc|Job Code Description|Job Description|Job by Roman|Job desc7|Job description|Job|JobCode|JobDesTesting|JobDesc|JobDescription|Q(A|Q|I|T|R|M)+||K|M|S(S|D)?|dev|(d|e|f|g|s|a)*|(w|g|h|i|k|u|t|j|[1-6])*|empDescription|jCodeDesc|jDesc|jo|job desc|job description|job|job1|job2|jobCodeDesc|jobcodedesc|jobcodedescchanged|jobcodedescr|jobcodesc|jobdesc|jobtestmodify|jpbdesc";
    String regex2="CTO IT|Portfolio Sample|Conversison|JCodeDesc Mod|JCodeDesc|JCode|JDESC|Desc|JDesc|JD|JJ(J)+|JOB";
    String REPLACE2 = "NULL";

    String regex3="(?i)ACCOUNT REPRESENTATIVE";
    String REPLACE3 = "Account Representative";

    String regex4="(?i)ACCOUNTANT I";
    String REPLACE4 = "Accountant I";

    String regex5="(?i)ACCOUNTANT II";
    String REPLACE5 = "Accountant II";

    String regex6="(?i)Accounting Coordinator-Amco";
    String REPLACE6 = "Accounting Coordinator - AMCO";

    String regex7="(?i)ACCOUNTS PAYABLE CLERK";
    String REPLACE7 = "Accounts Payable Clerk";

    String regex8="(?i)ActuarialAnalyst";
    String REPLACE8 = "Actuarial Analyst";

    String regex9="(?i)ACTUARY";
    String REPLACE9 = "Actuary";

    String regex10="(?i)ADMIN SVCS COORD I";
    String REPLACE10 = "Admin Svcs Coord I";

    String regex11="(?i)admin";
    String REPLACE11 = "Admin";

    String regex12="(?i)ADMINISTRATIVE CLERK";
    String REPLACE12 = "Administrative Clerk";

    String regex13="(?i)AIDE, HOME HEALTH";
    String REPLACE13 = "Aide, Home Health";

    String regex14="(?i)analyst";
    String REPLACE14 = "Analyst";

    String regex15="(?i)ANALYST, DATA";
    String REPLACE15 = "Analyst, Data";

    String regex16="(?i)AUDIOLOGIST";
    String REPLACE16 = "Audiologist";

    String regex17="(?i)BS&F Anl";
    String REPLACE17 = "BS&F Analyst";

    String regex18="(?i)BS&F Conslt";
    String REPLACE18 = "BS&F Consultant";

    String regex19="(?i)Behavioral Medicine Spec ((LCSW)|(\\(LCSW\\)))";
    String REPLACE19 = "Behavioral Medicine Spec (LCSW)";

    String regex20="BEHAVIORAL MED SPEC(PSYCH)";
    String REPLACE20="BEHAVIORAL MED SPEC (PSYCH)";

    String regex21="ACCOUNTANT SR|ACCOUNTANT, SR|Accountant, Sr";
    String REPLACE21 = "Accountant, Senior";

    String regex22="(?i)Lab Asst I";
    String REPLACE22 = "Lab Assistant I";

    String regex23="LAB ASST II|Lab ASST II|Lab Asst II";
    String REPLACE23 = "Lab Assistant II";

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

        Pattern p9 = Pattern.compile(regex9);
        Matcher m9 = p9.matcher(attr);

        Pattern p10 = Pattern.compile(regex10);
        Matcher m10 = p10.matcher(attr);

        Pattern p11 = Pattern.compile(regex11);
        Matcher m11 = p11.matcher(attr);

        Pattern p12 = Pattern.compile(regex12);
        Matcher m12 = p12.matcher(attr);

        Pattern p13 = Pattern.compile(regex13);
        Matcher m13 = p13.matcher(attr);

        Pattern p14 = Pattern.compile(regex14);
        Matcher m14 = p14.matcher(attr);

        Pattern p15 = Pattern.compile(regex15);
        Matcher m15 = p15.matcher(attr);

        Pattern p16 = Pattern.compile(regex16);
        Matcher m16 = p16.matcher(attr);

        Pattern p17 = Pattern.compile(regex17);
        Matcher m17 = p17.matcher(attr);


        Pattern p18 = Pattern.compile(regex18);
        Matcher m18 = p18.matcher(attr);

        Pattern p19 = Pattern.compile(regex19);
        Matcher m19 = p19.matcher(attr);

        Pattern p20 = Pattern.compile(regex20);
        Matcher m20 = p20.matcher(attr);

        Pattern p21 = Pattern.compile(regex21);
        Matcher m21 = p21.matcher(attr);

        Pattern p22 = Pattern.compile(regex22);
        Matcher m22 = p22.matcher(attr);

        Pattern p23 = Pattern.compile(regex23);
        Matcher m23 = p23.matcher(attr);


        if (m.matches() && REPLACE == attrToBeReplaced)
            return m.replaceAll(REPLACE);
        else if (m.matches() && REPLACE != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE;
        else if (m2.matches() && REPLACE2 == attrToBeReplaced)
            return m2.replaceAll(REPLACE2);
        else if (m2.matches() && REPLACE2 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE2;
        else if (m3.matches() && REPLACE3 == attrToBeReplaced)
            return m3.replaceAll(REPLACE3);
        else if (m3.matches() && REPLACE3 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE3;
        else if (m4.matches() && REPLACE4 == attrToBeReplaced)
            return m4.replaceAll(REPLACE4);
        else if (m4.matches() && REPLACE4 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE4;
        else if (m5.matches() && REPLACE5 == attrToBeReplaced)
            return m5.replaceAll(REPLACE5);
        else if (m5.matches() && REPLACE5 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE5;
        else if (m6.matches() && REPLACE6 == attrToBeReplaced)
            return m6.replaceAll(REPLACE6);
        else if (m6.matches() && REPLACE6 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE6;
        else if (m7.matches() && REPLACE7 == attrToBeReplaced)
            return m7.replaceAll(REPLACE7);
        else if (m7.matches() && REPLACE7 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE7;
        else if (m8.matches() && REPLACE8 == attrToBeReplaced)
            return m8.replaceAll(REPLACE8);
        else if (m8.matches() && REPLACE8 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE8;
        else if (m9.matches() && REPLACE9 == attrToBeReplaced)
            return m9.replaceAll(REPLACE9);
        else if (m9.matches() && REPLACE9 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE9;
        else if (m10.matches() && REPLACE10 == attrToBeReplaced)
            return m10.replaceAll(REPLACE10);
        else if (m10.matches() && REPLACE10 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE10;
        else if (m11.matches() && REPLACE11 == attrToBeReplaced)
            return m11.replaceAll(REPLACE11);
        else if (m11.matches() && REPLACE11 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE11;
        else if (m12.matches() && REPLACE12 == attrToBeReplaced)
            return m12.replaceAll(REPLACE12);
        else if (m12.matches() && REPLACE12 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE12;
        else if (m13.matches() && REPLACE13 == attrToBeReplaced)
            return m13.replaceAll(REPLACE13);
        else if (m13.matches() && REPLACE13 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE13;
        else if (m14.matches() && REPLACE14 == attrToBeReplaced)
            return m14.replaceAll(REPLACE14);
        else if (m14.matches() && REPLACE14 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE14;
        else if (m15.matches() && REPLACE15 == attrToBeReplaced)
            return m15.replaceAll(REPLACE15);
        else if (m15.matches() && REPLACE15 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE15;
        else if (m16.matches() && REPLACE16 == attrToBeReplaced)
            return m16.replaceAll(REPLACE16);
        else if (m16.matches() && REPLACE16 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE16;
        else if (m17.matches() && REPLACE17 == attrToBeReplaced)
            return m17.replaceAll(REPLACE17);
        else if (m17.matches() && REPLACE17 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE17;
        else if (m18.matches() && REPLACE18 == attrToBeReplaced)
            return m18.replaceAll(REPLACE18);
        else if (m18.matches() && REPLACE18 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE18;
        else if (m19.matches() && REPLACE19 == attrToBeReplaced)
            return m19.replaceAll(REPLACE19);
        else if (m19.matches() && REPLACE19 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE19;
        else if (m20.matches() && REPLACE20 == attrToBeReplaced)
            return m20.replaceAll(REPLACE20);
        else if (m20.matches() && REPLACE20 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE20;
        else if (m21.matches() && REPLACE21 == attrToBeReplaced)
                return m21.replaceAll(REPLACE21);
        else if (m21.matches() && REPLACE21 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE21;
        else if (m22.matches() && REPLACE22 == attrToBeReplaced)
            return m22.replaceAll(REPLACE22);
        else if (m22.matches() && REPLACE22 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE22;
        else if (m23.matches() && REPLACE23 == attrToBeReplaced)
            return m23.replaceAll(REPLACE23);
        else if (m23.matches() && REPLACE23 != attrToBeReplaced)
            return "attrToBeReplaced should have been " + REPLACE23;
        else
            return "no match found for this particular Job description.";
    }
}
