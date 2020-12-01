/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package gr.techzombie;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private final Scanner input = new Scanner(System.in);

    public MobilePhone() {
    }

    Contacts contacts;

    ArrayList<Contacts> epafes = new ArrayList<>();

    public void printInfo (){
        System.out.printf("\n1. show info\n2. add contact\n3. show all contacts\n4. exit\n");
    }
    public void addContact(){
        System.out.println("dwse name:");
        String name = input.nextLine();
        System.out.println("dwse number");
        int number = input.nextInt();
        input.nextLine();
        epafes.add(new Contacts(name,number));
        printInfo();
    }
    public void showContacts(){
        for (int i=0;i< epafes.size();i++)
            System.out.println(epafes.get(i).getName() + " " + epafes.get(i).getNumber());
            printInfo();
    }
}
