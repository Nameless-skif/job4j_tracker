package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int num = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername() == login) {
                System.out.println("User found");
                num = i;
                break;
            }
        }
        return new User(users[num].getUsername(), users[num].isValid());
    }

    public static boolean validate(User users) throws UserInvalidException {
        boolean rez = false;
        if (Objects.equals(users.isValid(), true) && users.getUsername().length() > 3) {
            rez = true;
        }
        return rez;
    }

            public static void main(String[] args) {
                User[] users =
                        {
                                new User("Petr Arsentev", true)
                        };
                try {
                    User user = findUser(users, "Petr Arsentev");
                    if (validate(user)) {
                        System.out.println("This user has an access");
                    }
                } catch (UserInvalidException e) {
                    System.out.println("User is not found");
                } catch (UserNotFoundException e) {
                    System.out.println("User is not valid");
                }
            }
}

