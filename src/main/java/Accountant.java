public class Accountant implements Print {


        private String name;

    Accountant(String name) {
            this.name = name;
        }

        @Override
        public void print() {
            System.out.println("Должность: Бухгалтер, Имя: " + name);
        }
    }
