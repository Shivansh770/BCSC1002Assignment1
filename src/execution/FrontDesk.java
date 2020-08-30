/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter 1", "JK Rowling", "BCDA1547");
        Book b2 = new Book("Harry Potter 2", "JK Rowling", "CVBN5632");
        Book b3 = new Book("Harry Potter 3", "JK Rowling", "GHFE1256");
        Book b4 = new Book("Harry Potter 5", "JK Rowling", "FGHF4569");
        Book b5 = new Book("Harry Potter 5", "JK Rowling", "JHKL6895");

        Book[] bLib = new Book[]{b1, b2, b3, b4, b5};

        Library l1 = new Library();

        Book[] bAr1 = new Book[2];
        bAr1[0] = b1;
        bAr1[1] = b2;

        Student student = new Student("Shivansh", "", "Gupta", 12345, 2, bAr1);

        Scanner scanner = new Scanner(System.in);


        int choice = 0;

        while (choice == 0) {


            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                    "How may I help you today?\n" +
                    "1. Issue a new book for me.\n" +
                    "2. Return a previously issues book for me.\n" +
                    "3. Show me all my issues books.\n" +
                    "4. Exit.\n");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {

                }
                break;


            }

        }
    }


}

