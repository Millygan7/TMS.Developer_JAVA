import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя доктора:");
        String doctorName = scanner.nextLine();

        System.out.println("Введите план лечения (1 — хирург, 2 — дантист, >2 — терапевт):");
        int plan = scanner.nextInt();

        // Создаём клинику с врачами
        Clinic clinic = new Clinic("Иванов", "Петров", "Сидоров") {
            @Override
            public void treatTherapist() {

            }
        };

        // Создаём пациента, связывая его с клиникой
        Pathient pathient = new Pathient(doctorName, plan, clinic.getSurgeon(), clinic.getTherapist(), clinic.getDentist());

        System.out.println("Вы выбрали доктора: " + pathient.getDoctor());
        System.out.println("План лечения1: " + pathient.getPlanLechenia());

    }
}