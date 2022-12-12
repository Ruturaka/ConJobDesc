package com.codewithrutu.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoApplicationJobTest {
    @Test
    void Accountmanager() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Account manager";
        String attrToBeReplaced ="Account Manager - OHS";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Account Manager - OHS";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }

    @Test
    void SRAccountmanagerohs() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "SR, Account manager -ohs";
        String attrToBeReplaced ="Account Manager - OHS";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Account Manager - OHS";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void Accountmanagerohs() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Account manager -ohs";
        String attrToBeReplaced ="Account Manager - OHS";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Account Manager - OHS";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void SRAccountmanager() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "SR, Account manager";
        String attrToBeReplaced ="Account Manager - OHS";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Account Manager - OHS";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void AccountmanagerSR() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Account manager,SR";
        String attrToBeReplaced ="Account Manager - OHS";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Account Manager - OHS";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }

    @Test
    void AccountRepresentative() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ACCOUNT REPRESENTATIVE";
        String attrToBeReplaced ="Account Representative";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Account Representative";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void AccountantI() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ACCOUNTANT I";
        String attrToBeReplaced ="Accountant I";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Accountant I";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void AccountantII() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ACCOUNTANT II";
        String attrToBeReplaced ="Accountant II";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Accountant II";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void AccountantSenior() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ACCOUNTANT, SR";
        String attrToBeReplaced ="Accountant, Senior";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Accountant, Senior";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void AccountingCoordinatorAMCO() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Accounting Coordinator-Amco";
        String attrToBeReplaced ="Accounting Coordinator - AMCO";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Accounting Coordinator - AMCO";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void AccountsPayableClerk() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ACCOUNTS PAYABLE CLERK";
        String attrToBeReplaced ="Accounts Payable Clerk";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Accounts Payable Clerk";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ActuarialAnalyst() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ActuarialAnalyst";
        String attrToBeReplaced ="Actuarial Analyst";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Actuarial Analyst";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void Actuary() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ACTUARY";
        String attrToBeReplaced ="Actuary";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Actuary";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    } @Test
    void AdminSvcsCoordI() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ADMIN SVCS COORD I";
        String attrToBeReplaced ="Admin Svcs Coord I";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Admin Svcs Coord I";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    } @Test
    void Admin() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "admin";
        String attrToBeReplaced ="Admin";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Admin";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    } @Test
    void AdministrativeClerk() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ADMINISTRATIVE CLERK";
        String attrToBeReplaced ="Administrative Clerk";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Administrative Clerk";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    } @Test
    void AideHomeHealth() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "AIDE, HOME HEALTH";
        String attrToBeReplaced ="Aide, Home Health";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Aide, Home Health";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    } @Test
    void Analyst() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "analyst";
        String attrToBeReplaced ="Analyst";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Analyst";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void AnalystData() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "ANALYST, DATA";
        String attrToBeReplaced ="Analyst, Data";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Analyst, Data";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void Audiologist() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "AUDIOLOGIST";
        String attrToBeReplaced ="Audiologist";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Audiologist";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void BSNFAnalyst() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "BS&F Anl";
        String attrToBeReplaced ="BS&F Analyst";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "BS&F Analyst";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void BSNFConsultant() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "BS&F Conslt";
        String attrToBeReplaced ="BS&F Consultant";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "BS&F Consultant";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void LCSW() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Behavioral Medicine Spec LCSW";
        String attrToBeReplaced ="Behavioral Medicine Spec (LCSW)";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Behavioral Medicine Spec (LCSW)";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void LabAssistantI() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Lab Asst I";
        String attrToBeReplaced ="Lab Assistant I";
        //when

        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Lab Assistant I";

        System.out.println("attr- "+attr);
        System.out.println("attrToBeReplaced- "+attrToBeReplaced);
        System.out.println("actual- "+actual);

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void LabAssistantII() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Lab Asst II";
        String attrToBeReplaced ="Lab Assistant II";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "Lab Assistant II";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc1() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "CTO IT";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc2() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Portfolio Sample";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc3() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Conversison";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc4() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "JCode";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc5() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "Desc";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc6() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "JCodeDesc Mod";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc7() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "JCodeDesc";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc8() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "JD";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc9() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "JDESC";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc10() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "JDesc";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc11() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "JJJ";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherJobDesc12() {
        RegexBasedJobTrans underTest2= new RegexBasedJobTrans();

        //given
        String attr = "JOB";
        String attrToBeReplaced ="NULL";
        //when
        String actual = underTest2.transform(attr, attrToBeReplaced);
        //then
        String expected = "NULL";

        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }

}
