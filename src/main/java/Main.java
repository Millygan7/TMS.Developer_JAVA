/**
 @author
 Pleshakov Vladimir
 *@date 25.03.2026
 *@description OOP_In_Java.Princepes.
 */



import java.util.Scanner;
//                                             Задание№1
//          Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
//        хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
//        по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
//         «Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
//        терапевта создать метод, который будет назначать врача пациенту согласно плану
//        лечения:
//        Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//        Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//        Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
//        лечить.

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите имя доктора:");
//        String doctorName = scanner.nextLine();
//
//        System.out.println("Введите план лечения (1 — хирург, 2 — дантист, >2 — терапевт):");
//        int plan = scanner.nextInt();
//
//         Создаём клинику с врачами
//        Clinic clinic = new Clinic("Иванов", "Петров", "Сидоров") {
//            @Override
//            public void treatTherapist() {
//
//            }
//        };
//
//         Создаём пациента, связывая его с клиникой
//        Pathient pathient = new Pathient(doctorName, plan, clinic.getSurgeon(), clinic.getTherapist(), clinic.getDentist());
//
//        System.out.println("Вы выбрали доктора: " + pathient.getDoctor());
//        System.out.println("План лечения1: " + pathient.getPlanLechenia());
//
//    }
//}