     class Figure2 {
         double diml;
         double dim2;
         double dim3;

         Figure2(double c, double d, double e) {
             diml = c;
             dim2 = d;
             dim3 = e;
         }

         double perimetr() {

             System.out.println("Плoщaдь для Figure не определена .");
             return 0;
         }

         double sumPerimetr() {

            return diml+ dim2 + dim3 ;

         }
     }







