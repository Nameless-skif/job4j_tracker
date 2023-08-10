package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User num = null;
        for (User i : users) {
            if (Objects.equals(i.getUsername(), login)) {
                System.out.println("User found");
                num = i;
                break;
            } else {
                throw new UserNotFoundException("not found");
            }
        }
        return num;
    }

    public static boolean validate(User users) throws UserInvalidException {
        if (!Objects.equals(users.isValid(), true) && users.getUsername().length() > 3) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users =
                {
                        new User("Petr Arsentev1", true)
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

