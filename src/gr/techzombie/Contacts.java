/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package gr.techzombie;

public class Contacts {
    private final String name;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Contacts(String name, int number) {
        this.name = name;
        this.number = number;
    }

    private final int number;
}
