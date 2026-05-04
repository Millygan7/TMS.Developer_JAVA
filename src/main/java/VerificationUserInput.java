public class VerificationUserInput {


    public VerificationUserInput() {


    }


    public static void verification() {
        Userinput userinput = new Userinput();
        userinput.setLogin("Danny");
        userinput.setPassword("pass");
        userinput.setConfirmPassword("pass123");

        try {
            userinput.setVerification();
            boolean result = Userinput.validation(userinput.getPassword(), userinput.getConfirmPassword());
            System.out.println("Валидация пройдена: " + result);
        } catch (WrongLoginException e) {
            System.err.println("Ошибка валидации логина/пароля: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.err.println("Ошибка подтверждения пароля: " + e.getMessage());
        }
    }
}

