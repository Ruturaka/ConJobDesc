package com.codewithrutu.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoApplicationCountryTest {

    @Test
   void us()
   {
       RegexBasedConTrans underTest = new RegexBasedConTrans();
       //given
       String attr = "us";
       String attrToBeReplaced = "United States of America";

       //when
       String actual = underTest.transform(attr, attrToBeReplaced);

       //then
       String expected = "United States of America";
       assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
       assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

   }
   @Test
   void UnitedStates()
   {
       RegexBasedConTrans underTest = new RegexBasedConTrans();
       //given
       String attr = "United States";
       String attrToBeReplaced = "United States of America";

       //when
       String actual = underTest.transform(attr, attrToBeReplaced);

       //then
       String expected = "United States of America";
       assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
       assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");
   }
    @Test
    void California()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "California";
        String attrToBeReplaced = "United States of America";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "United States of America";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");
    }
    @Test
    void CALIFORNIA()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "CALIFORNIA";
        String attrToBeReplaced = "United States of America";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "United States of America";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");
    }
    @Test
    void INDIA()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr="INDIA";
        String attrToBeReplaced="India";

        //when
        String actual= underTest.transform(attr, attrToBeReplaced);

        //then
        String expected="India";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");
    }
    @Test
    void india()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr="india";
        String attrToBeReplaced="India";

        //when
        String actual= underTest.transform(attr, attrToBeReplaced);

        //then
        String expected="India";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");
    }
    @Test
    void IND()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr="IND";
        String attrToBeReplaced="India";

        //when
        String actual= underTest.transform(attr, attrToBeReplaced);

        //then
        String expected="India";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");
    }

    @Test
    void cameroon()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr="cameroon";
        String attrToBeReplaced="Cameroon";

        //when
        String actual= underTest.transform(attr, attrToBeReplaced);

        //then
        String expected="Cameroon";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");
    }

    @Test
    void uk()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "uk";
        String attrToBeReplaced = "United Kingdom";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "United Kingdom";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void UK()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "UK";
        String attrToBeReplaced = "United Kingdom";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "United Kingdom";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void TrinidadTRO()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "TrinidadTRO";
        String attrToBeReplaced = "Trinidad";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "Trinidad";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void AFG()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "afg";
        String attrToBeReplaced = "AFG";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "AFG";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ARG()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "ARG";
        String attrToBeReplaced = "Argentina";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "Argentina";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherCountry1()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "xxx";
        String attrToBeReplaced = "NULL";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "NULL";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherCountry2()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "country";
        String attrToBeReplaced = "NULL";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "NULL";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void ForAnyOtherCountry3()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "111";
        String attrToBeReplaced = "NULL";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "NULL";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void NegativeCase1()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "Russia";
        String attrToBeReplaced = "United States of America";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "United States of America";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }@Test
    void NegativeCase2()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "uk";
        String attrToBeReplaced = "India";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "United Kingdom";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
    @Test
    void NegativeCase3()
    {
        RegexBasedConTrans underTest = new RegexBasedConTrans();
        //given
        String attr = "uk";
        String attrToBeReplaced = "United Kingdom";

        //when
        String actual = underTest.transform(attr, attrToBeReplaced);

        //then
        String expected = "uk";
        assertEquals(attrToBeReplaced, actual, "Negative - enter correct Job Description's attrToBeRepalced");
        assertEquals(expected, actual, "Negative - expected & actual result doesn't match ");

    }
}
