/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 01 2022
 * Version: 1.0
 */
package lab_02.task_02;

/**
 * With this Class you can create aa Book Object with id, title, reviewcount and ordernumber.
 * It has two important methods, with updateRate you can update the rating of a book and
 * updateReviewCount which updates the reviewcount and keeps track on how many reviews a book has.
 * With its getter and setter you can get or set id, title, reviewcount and avarageRate
 */
public class Book {
    private int bookID;
    private String bookTitle;
    private int reviewCount;
    private double averageRate;

    private int bookOrderNumber;
    private double totalRate;

    /**
     * Constructor of the Employee Class.
     * @param bookID id of the book as int
     * @param bookTitle title of the book as string
     * @param reviewCount review count of the book as int
     * @param bookOrderNumber order number of the book as int
     */
    public Book(int bookID, String bookTitle, int reviewCount, int bookOrderNumber) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.reviewCount = reviewCount;
        this.averageRate = 5.0;

        this.bookOrderNumber = bookOrderNumber;
    }

    /**
     * This method updates the rating of the book.
     * This is done by adding the rate to the total rating and divide it by the reviewcount.
     * @param rate the rating of the book (1-5)
     */
    public void updateRate(double rate) {
        this.totalRate +=rate;
        averageRate = this.totalRate/this.reviewCount;
    }

    /**
     * This method increases the review count by 1.
     */
    public void updateReviewCount() {
        this.reviewCount++;
    }

    public int getBookID() {
        return bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public int getBookOrderNumber() {
        return bookOrderNumber;
    }

    public double getAverageRate() {
        return averageRate;
    }
}