class Circle2 extends Figure2 {
    Circle2(double а, double b, double e) {
        super(а, b, e);
    }

    @Override
    double perimetr() {
        System.out.println("Bнyтpи perimeter () для Circle . ");
        return diml * dim2 * dim2;
    }
}

