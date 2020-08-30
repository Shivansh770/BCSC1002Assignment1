/*  Created by IntelliJ IDEA.
 *  User: Shivansh Gupta (Shivansh 770)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ADD_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Student student = new Student("Shivansh", "", "Gupta", 12345, 2);
        Scanner scanner = new Scanner(System.in);
        int choice;
        Library library = new Library();
        String bookName;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                    "How may I help you today?\n" +
                    "1. Issue a new book for me.\n" +
                    "2. Return a previously issues book for me.\n" +
                    "3. Show me all my issues books.\n" +
                    "4. Exit.\n");
            System.out.println("Enter your choice (1..4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case ADD_BOOK:
                    System.out.println("Enter name of book you want to issue : ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.addBook(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of bookyou want to return :");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.returnPreviouslyIssuedBooks(bookName);
                    break;
                case SHOW_BOOK:
                    student.showMyBooks();
                    break;
                default:
                    break;
            }
        } while (choice != EXIT);
        scanner.close();

    }
}














