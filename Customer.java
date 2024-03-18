package org.example;

public class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.email  = email;
        this.id     = id;
        this.name   = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
