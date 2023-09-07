package ru.job4j.tracker;

public class ValidateInput implements Input {
    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        char[] check = question.toCharArray();
        do {
            try {
                value = in.askInt(question);
                invalid = false;
                for (char num : check) {
                    if (num > 48 || num < 57) {
                        break;
                    }
                }

            } catch (NumberFormatException nfe) {
                out.println("Please enter valid data");
            }
        } while (invalid);
        return value;
    }
}
