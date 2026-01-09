package com.example.petshop;

import java.util.Date;

public class Hungry extends Mood {

    public Hungry() {
        super();
    }

    public Hungry(Date date) {
        super(date);
    }

    @Override
    public String mood() {
        return "hungry :(";
    }


}
