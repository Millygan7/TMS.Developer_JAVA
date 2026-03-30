/**
 * @author Pleshakov Vladimir
 * @date 20.03.2026
 * @description OOP in Java.Classes and Methods.
 */

//Задача№1:
//Создать класс CreditCard c полем номера счета, текущая последняя часть по счету. добавить
//метод, который позволяет вычислить сумму по кредитной карте. добавить метод,
//который позволяет снять с карточек некоторую сумму. добавьте метод, который
//выводит текущую информацию о карточке. Напишите программу, которая производит три
//объект класса CreditCard, в котором заданы номер счета и начальная стадия.
//Тестовый сценарий для проверки: Положите деньги на первые две карты и отключите их.
//остатки. Выведите на экран текущее Состояние всех трех карточек.


    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(1,300);
        CreditCard creditCard2 = new CreditCard(2, 500);
        CreditCard creditCard3 = new CreditCard(3,700 );
        System.out.println("Операции по карте 1:");
        creditCard1.accrual(1000);
        creditCard1.accrual(250);
        creditCard1.removal(300);
        creditCard1.displayInfo();
        creditCard2.accrual(500);
        creditCard2.accrual(250);
        creditCard2.removal(800);
        creditCard2.displayInfo();

        System.out.println("\nОперации по карте 3:");
        creditCard3.removal(500);
        creditCard3.displayInfo();
    }
