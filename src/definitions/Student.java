/*  Created by IntelliJ IDEA.
 *  User: Shivansh Gupta (Shivansh770)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private String firstName, middleName, lastName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] nameOfBooksIssued;

    public Student(String firstName, String middleName, String lastName, long universityRollNumber, int numberOfBooksIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.nameOfBooksIssued = new Book[5];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNameOfBooksIssued() {
        return nameOfBooksIssued;
    }

    public void setNameOfBooksIssued(Book[] nameOfBooksIssued) {
        this.nameOfBooksIssued = nameOfBooksIssued;
    }

    public void addBook(Book addBook) {
        System.out.println(addBook.getBookName() + "book is issued . ");
    }

    public void deleteBook(int x) {
        for (int i = x; i < numberOfBooksIssued; i++) {
            nameOfBooksIssued[i] = nameOfBooksIssued[i = 1];
            numberOfBooksIssued--;
        }
    }

    public void showMyBooks() {
        for (int i = 0; i < numberOfBooksIssued; i++) {
            System.out.println(nameOfBooksIssued[i]);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", nameOfBooksIssued=" + Arrays.toString(nameOfBooksIssued) +
                '}';
    }


}
