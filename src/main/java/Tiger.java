public class Tiger extends Animal {
    public Tiger(String grass, String meat) {
        super(grass, meat);


    }


    @Override
    public void voice() {
        System.out.println("Growls");
    }

    @Override

    void eat(String food) {

        if ("Grass".equals(food)) {
            System.out.println( " Тигр недоволен: фу, трава!");
        } else if ("Meat".equals(food)) {
            System.out.println("Тигр доволен: свежее мясо — идеально!");
        }

    }
}





