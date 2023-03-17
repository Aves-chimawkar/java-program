class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
class NegativeBalanceException extends Exception {
    NegativeBalanceException(String msg) {
        super(msg);
    }
}
class InvalidUsernameException extends Exception {
    InvalidUsernameException(String msg) {
        super(msg);
    }
}
class InvalidPasswordException extends Exception {
    InvalidPasswordException(String msg) {
        super(msg);
    }
}
class InvalidEmailException extends Exception {
    InvalidEmailException(String msg) {
        super(msg);
    }
}
public class User_defined_Exce {
    public static void main(String[] args) {
        try {
            int age = 5;
            if (age < 0) {
                throw new InvalidAgeException("InvalidAgeException : Age must be greater than 0");
            }

            double balance = 100;
            if (balance < 0) {
                throw new NegativeBalanceException("NegativeBalanceException : Balance must be greater than 0");
            }

            String username = "abc";
            if (username.length() == 0) {
                throw new InvalidUsernameException("InvalidUsernameException : Username cannot be empty");
            }

            String password = "password1";
            if (password.length() < 8) {
                throw new InvalidPasswordException("InvalidPasswordException : Password must be at least 8 characters long");
            }

            String email = "invalidEmail";
            if (!email.contains("@")) {
                throw new InvalidEmailException("InvalidEmailException : Email must contain '@' symbol");
            }
        } catch (InvalidAgeException | NegativeBalanceException | InvalidUsernameException | InvalidPasswordException | InvalidEmailException e) {
            System.out.print(e.getMessage());
        }
    }
}
