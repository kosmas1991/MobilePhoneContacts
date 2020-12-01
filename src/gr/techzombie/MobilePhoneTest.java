/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package gr.techzombie;

import java.util.Scanner;

public class MobilePhoneTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MobilePhone mobilePhone = new MobilePhone();
        boolean stop = false;
        mobilePhone.printInfo();
        while (!stop) {
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 -> mobilePhone.printInfo();
                case 2 -> mobilePhone.addContact();
                case 3 -> mobilePhone.showContacts();
                case 4 -> stop = true;
                //case 5 -> stop = false;
            }
            //test yy
        }//GR GR GR GR GR GR GR GR GR GR GR GR
    }
}
