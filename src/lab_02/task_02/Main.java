/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_02;

import java.util.Scanner;

/**
 * Main class of the Assignment 2 Task 2 Java Lab SKKU.
 * It creates two books (with id, name, reviewcount and ordernumber)
 * The user can then choose a book to review eg. 1.
 * The rating will the be updated on the chosen book.
 * After that the user can choos if he wants to rate another book.
 *
 * This class holds 4 instances main, scanner and the two books.
 */
public class Main {

    private static Main MAIN;
    private static Scanner SCANNER;
    private static Book FIRST_BOOK;
    private static Book SECOND_BOOK;

    /**
     * Main method of Assignment 2 Task 2 Java Lab SKKU.
     * This method starts the application.
     * @param args
     */
    public static void main(String[]args) {
        MAIN = new Main();
        SCANNER = new Scanner(System.in);

        FIRST_BOOK = new Book(2343,"Harry Potter", 0,1);
        SECOND_BOOK = new Book(4443,"Deep Learning", 0,2);

        MAIN.printBookOrderUserInput();
    }

    private void printRateOtherBookUserQuestion() {
        System.out.print("Would you like to rate more (1:yes, 0:no)");

        if(SCANNER.nextInt() == 1){
            printBookOrderUserInput();
        }
    }

    private void printBookInformation() {
        printBookInformation(FIRST_BOOK);
        printBookInformation(SECOND_BOOK);
    }

    private void printBookOrderUserInput() {
        printBookInformation();

        System.out.println("==============================");
        System.out.print("Please select book (order number): ");

        int bookOrderNumberUserInput = SCANNER.nextInt();

        if(bookOrderNumberUserInput == FIRST_BOOK.getBookOrderNumber()) {
            printSelectedBookAndUpdateReview(FIRST_BOOK);
        }else if(bookOrderNumberUserInput == SECOND_BOOK.getBookOrderNumber()) {
            printSelectedBookAndUpdateReview(SECOND_BOOK);
        }
        printRateOtherBookUserQuestion();
    }

    private void printSelectedBookAndUpdateReview(Book book) {
        System.out.println("You selected Book: "+book.getBookTitle());
        System.out.print("Please enter your rating: ");
        double userInputBookRating = SCANNER.nextDouble();
        book.updateReviewCount();
        book.updateRate(userInputBookRating);
    }

    private void printBookInformation(Book book) {
        System.out.println("==============================");
        System.out.println("Book "+book.getBookOrderNumber()+": "+book.getBookTitle());
        System.out.println("Book ID: "+book.getBookID());
        System.out.println("Book rating: "+book.getAverageRate());
        System.out.println("Number of reviews: "+book.getReviewCount());
    }
}