package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        int rez = 0;
        if (n == 0 || n == 1) {
            rez = 1;
        } else {
            rez = calc(n - 1) * n;
        }
        return rez;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
