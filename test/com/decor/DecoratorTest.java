package com.decor;

import com.guest.Age;
import com.guest.Guest;
import com.person.*;
import com.person.name.Name;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DecoratorTest {

    @Test
    public void test_decorateAll_decorates_given_guests_in_an_array_and_returns_the_decorated_strings() throws Exception {
        Guest g1 = new Guest(new Name("Julius", "Barrows"), Gender.FEMALE, new Age(18), new Address(new City("Veda haven"), new State("Vermont"), new Country("Macedonia")));
        Guest g2 = new Guest(new Name("Brandt", "Huel"), Gender.MALE, new Age(25), new Address(new City("West Shanna"), new State("Illinois"), new Country("Macedonia")));
        Guest g3 = new Guest(new Name("Velma", "Bergstrom"), Gender.FEMALE, new Age(24), new Address(new City("Katlynn view"), new State("Vermont"), new Country("Macedonia")));
        Guest[] people = {g1, g2, g3};
        Character[] decorWith = {' ', '+', '|', '-'};
        Decorator decorator = new Decorator(decorWith);
        String[] actualDecoration = decorator.decorateAll(people, "firstNameFirst");
        String firstGuestName =
                "+---------------------+\n" +
                        "| Ms Julius Barrows   |\n" +
                        "|---------------------|\n" +
                        "| Veda haven, Vermont |\n" +
                        "| Macedonia           |\n" +
                        "+---------------------+";
        String secondGuestName =
                "+-----------------------+\n" +
                        "| Mr Brandt Huel        |\n" +
                        "|-----------------------|\n" +
                        "| West Shanna, Illinois |\n" +
                        "| Macedonia             |\n" +
                        "+-----------------------+";

        String thirdGuestName =
                "+-----------------------+\n" +
                        "| Ms Velma Bergstrom    |\n" +
                        "|-----------------------|\n" +
                        "| Katlynn view, Vermont |\n" +
                        "| Macedonia             |\n" +
                        "+-----------------------+";
        String[] expectedDecoration = {firstGuestName, secondGuestName, thirdGuestName};
        assertArrayEquals(expectedDecoration, actualDecoration);
    }
}
