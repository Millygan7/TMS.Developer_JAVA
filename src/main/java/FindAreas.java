class FindAreas {
    public static void main(String[] args) {

        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle ( 1,9) ;
        Circle c = new Circle (2,2);
        Figure figref;

        figref = r;
        System.out . println ( "Плoщaдь равна " + figref. area () );
        figref = t;
        System.out . println ( " Плoщaдь равна " + figref. area () );
        figref = f;
        System.out . println ("Плoщaдь равна " + figref . area () );
        figref = c;
        System.out . println ("Плoщaдь равна " + figref . area () );


        }
    }
