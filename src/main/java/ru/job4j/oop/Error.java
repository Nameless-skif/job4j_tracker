package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void getStatus() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error errorOne = new Error();
        errorOne.getStatus();
        Error errorTwo = new Error(true, 1, "On");
        errorTwo.getStatus();
        Error errorThree = new Error(false, 2, "Off");
        errorThree.getStatus();
    }
}
