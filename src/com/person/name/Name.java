package com.person.name;

public class Name implements NameFormat {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String withPrefix(String format) {
        String name = "";
        if (format.equals("firstNameFirst"))
            name = firstNameFirstformat();
        if (format.equals("lastNameFirst"))
            name = lastNameFirstformat();
        return name;
    }


    @Override
    public String firstNameFirstformat() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String lastNameFirstformat() {
        return String.format("%s, %s", lastName, firstName);
    }
}
