public class Rabbit extends Animal {

    public Rabbit(String grass, String meat) {
        super(grass, meat);


    }


    @Override
    public void voice() {
        System.out.println("Кролик не издает голоса он только шипит ");
    }

    @Override
    void eat(String food) {

        if ("Grass".equals(food)) {
            System.out.println("Кродик  счастлив: обожаю травку!");
        } else if ("Meat".equals(food)) {
            System.out.println("Кролик недовольно фыркает: не хочу мясо!");


        }
    }
}




