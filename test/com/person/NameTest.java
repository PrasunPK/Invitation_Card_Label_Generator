package com.person;

import com.person.name.Name;
import org.junit.Assert;
import org.junit.Test;

public class NameTest {

    @Test
    public void test_withPrefix_creates_a_cardNameRepresentation_containing_Ms_as_prefix_given_gender_is_female() throws Exception {
        Name name = new Name("Julius", "Barrows");
        String expectedName = "Julius Barrows";
        String actualName = name.withPrefix("firstNameFirst");
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_withPrefix_creates_a_cardNameRepresentation_containing_Mr_as_prefix_given_gender_is_male() throws Exception {
        Name name = new Name("Carlos","Johns");
        String expectedName = "Carlos Johns";
        String actualName = name.withPrefix("firstNameFirst");
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_withPrefix_creates_a_cardNameRepresentation_in_formal() throws Exception {
        Name name = new Name("Julius", "Barrows");
        String expectedName = "Barrows, Julius";
        String actualName = name.withPrefix("lastNameFirst");
        Assert.assertEquals(expectedName, actualName);
    }

}
