package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Example1", 340);
        Book bookTwo = new Book("Example2", 260);
        Book bookThree = new Book("Example3", 1040);
        Book cleanCode = new Book("cleanCode", 200);
        Book[] bookArray = new Book[4];
        bookArray[0] = bookOne;
        bookArray[1] = bookTwo;
        bookArray[2] = bookThree;
        bookArray[3] = cleanCode;
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].getName() + " " + bookArray[i].getNumberPages());
        }
        Book copy = bookOne;
        bookArray[0] = cleanCode;
        bookArray[3] = copy;
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].getName() + " " + bookArray[i].getNumberPages());
        }
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getName() == "cleanCode") {
                System.out.println(bookArray[i].getName() + " " + bookArray[i].getNumberPages());
            }
        }
    }
}
