public class Userinput {


    private  String login;
    private  String password;
    private String confirmPassword;

    public Userinput() {



    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    public void setVerification() throws WrongLoginException {
        if (login.trim().length() > 20) {
            throw new WrongLoginException("Логин не должен превышать 20 символов");
        }

        if (password.trim().length() > 20) {
            throw new WrongLoginException("Пароль не должен превышать 20 символов");
        }
        if (!password.matches(".*\\d.*")) {
            throw new WrongLoginException("Пароль должен содержать хотя бы одну цифру:");
        }
    }
    public static boolean validation(String password,  String confirmPassword) throws WrongPasswordException{
        if (!password.equals(confirmPassword)) { // Исправлено условие
            throw new WrongPasswordException("Пароли не совпадают:");
        }
        return true; // Пароли совпадают
    }
}
























