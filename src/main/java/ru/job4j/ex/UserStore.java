package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (Objects.equals(user.getUsername(), login)) {
                result = user;
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("not found");
        }
        return result;
    }

    public static boolean validate(User users) throws UserInvalidException {
        if (!Objects.equals(users.isValid(), true) || users.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
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
            System.out.println("User is not valid");
        } catch (UserNotFoundException e) {
            System.out.println("User is not found");
        }
    }
}

