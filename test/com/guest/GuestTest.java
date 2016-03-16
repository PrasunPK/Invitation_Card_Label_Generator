package com.guest;

import com.person.*;
import com.person.name.Name;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GuestTest {
    private Address address;

    @Before
    public void setUp() throws Exception {
        address = new Address(new City("Koramangala"),new State("Bangalore"), new Country("India"));
    }

    @Test
    public void test_isAbleToConsumeAlcohol_returns_true_if_the_guest_age_is_greater_than_20() throws Exception {
        Guest guest = new Guest(new Name("sashi","kumar"), Gender.MALE, new Age(21), address);
        assertTrue(guest.isLegalToConsumeAlcohol(20));
    }

    @Test
    public void test_a_guest_is_not_able_for_consuming_alcohol_if_his_age_is_18() throws Exception {
        Guest guest = new Guest(new Name("sashi","kumar"), Gender.MALE, new Age(18),address);
        assertFalse(guest.isLegalToConsumeAlcohol(20));
    }

    @Test
    public void test_represents_a_name_with_prefix() throws Exception {
        Guest guest = new Guest(new Name("Sashi","Kumar"), Gender.MALE, new Age(18),address);
        String expected = "Mr Sashi Kumar";
        assertTrue(expected.equals(guest.representName("firstNameFirst")));
    }

    @Test
    public void test_isValid_filters_guest_by_given_filter_filter_by_country() throws Exception {
        Guest guest = new Guest(new Name("Sashi","Kumar"), Gender.MALE, new Age(18),address);
//        assertTrue(guest.isValid());

    }
}
