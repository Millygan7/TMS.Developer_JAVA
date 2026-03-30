public class Employee implements Print {
    private String name;

     Employee(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Должность: Рабочий, Имя: " + name);
    }
}

