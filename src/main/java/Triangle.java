class Triangle extends Figure {
    Triangle(double а, double Ь) {
        super(а, Ь);
    }
@Override
    double area() {
        System.out.println("Bнyтpи area () для Triangle . ");
        return diml * dim2 / 2;
    }
}
