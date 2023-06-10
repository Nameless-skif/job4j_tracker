package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String text = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
        System.out.println(text);
    }

    public static void main(String[] args) {
        Jukebox musicBox = new Jukebox();
        musicBox.music(1);
        musicBox.music(2);
        musicBox.music(3);
    }
}
