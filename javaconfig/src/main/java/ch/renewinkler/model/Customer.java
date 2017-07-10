package ch.renewinkler.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Customer {

    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString() {
        return new ToStringBuilder(this).
                append("firstname", firstname).
                append("lastname", lastname).
                toString();
    }
}
