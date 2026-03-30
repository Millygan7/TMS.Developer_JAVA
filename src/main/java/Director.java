public class Director implements  Print {
    private String name;

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Должность: Директор, Имя: " + name);
    }
}

