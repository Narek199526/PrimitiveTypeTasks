public class PrimitiveTypeTasks {
    public static void main(String[] args) {
        //Division by 2 without a remainder
        int x = 45;
        int y = 2;
        double z = x * 1.0 / y;
        if ((x / y) / z == 1){
            System.out.println(true);
        } else {
            System.out.println(false);
        }



        // Obtain exact arithmetic averages
        int a = 5;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 7;
        int f = 8;
        double g = (a + b + c) * 1.0 / 3;
        double k = (d + e + f) * 1.0 / 3;
        System.out.println(g);
        System.out.println(k);
        System.out.println((int)(g + k));



        //Print the decimal part of a float number
        double h = 54.125;
        double m = h % 1;
        System.out.println(m);
    }
}
