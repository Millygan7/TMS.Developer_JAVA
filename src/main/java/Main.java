

public class Main {



}
//Задача №1:
//        Создать класс, в котором будет статический метод. Этот метод применяется на входе в три
//параметры: логин, пароль, подтверждение пароля. Все поля имеют тип данных String. Длина
//логин должен быть меньше 20 символов и не должен оставлять пробелы. Если вход не
//соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
//пароль должен быть меньше 20 символов, не должен оставлять пробел и должен
//teachmeskills.by
//содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить
//WrongPasswordException. WrongPasswordException и WrongLoginException -
//пользовательские классы исключения с двумя конструкторами – один по умолчанию,
//второй принимает сообщение исключения и передает его в конструктор класса Exception.
//Метод возвращает true, если значения верны, false в противном случае.
    public static void main(String[] args) {
        VerificationUserInput verificationUserInput1 = new VerificationUserInput();
        VerificationUserInput.verification();
    }




