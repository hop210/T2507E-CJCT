package main.session5.asm6;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;
    private ArrayList<String> phones = new ArrayList<>();

    public PhoneNumber() {
    }

    public PhoneNumber(String name) {
        this.name = name;
        this.phones = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void addPhone(String phone) {
        if (!phones.contains(phone)) {
            phones.add(phone);
        }
    }
}
