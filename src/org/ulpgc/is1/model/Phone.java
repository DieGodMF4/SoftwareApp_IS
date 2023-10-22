package org.ulpgc.is1.model;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return number.matches("\\d{9}");
    }

    @Override
    public String toString() {
        if (isValid()) {
            return number;
        } else {
            return "XXXX";
        }
        // return isValid() ? number : "XXXX";
    }
}
