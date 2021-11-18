package com.company;

import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name) {
        Scanner JustPlay = new Scanner(System.in);
        System.out.println("Present Your Name");
        this.name = JustPlay.next();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
