package com.ivaa.naturalint;

/**
 * Created by ivaa on 10/2/2015.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public Person(String _firstName, String _lastName, String _email, int _age)
    {
        firstName = _firstName;
        lastName = _lastName;
        email = _email;
        age = _age;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public int getAge()
    {
        return age;
    }
}
