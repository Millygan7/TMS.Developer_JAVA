public class CreditCard {
    int AccountNumber;
    int summa;

public CreditCard(int AccountNumber, int summa){
this.AccountNumber = AccountNumber;
this.summa = summa;
}
    public int   getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }
    public  int getSumma() {
        return summa;
    }

    public  void setSumma(int summa) {
        this.summa = summa;
    }
public  void accrual(int summa) {
    if (summa < 0) {
        System.out.println("Ошибка: сумма должна быть положительной");
        return;
    }

    // Увеличиваем текущее значение поля summa на переданную сумму
    this.summa += summa;

    System.out.println("Сумма зачислена на счёт: " + summa);
    System.out.println("Текущий баланс: " + this.summa);
}
public void removal(int summa) {
    if (this.summa >= summa) {
        this.summa -= summa;
        {
            System.out.println("Текущая сумма на счете:" + this.summa);
            System.out.println("Снятие суммы с карточки: " + summa);

        }
    }

}
    public void displayInfo() {
        System.out.println("=== Информация о карте ===");
        System.out.println("Номер счёта: " + AccountNumber);
        System.out.println("Баланс: " + summa + " руб.");
        System.out.println("==========================");
    }

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
}








