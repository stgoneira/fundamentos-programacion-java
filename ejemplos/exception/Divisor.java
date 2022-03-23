public class Divisor {

    public static void main(String[] args) {
        try {
            int dividendo = 10;
            int divisor   = 0;
            int cociente  = dividendo / divisor;
        } catch( ArithmeticException ae ) {
            System.out.println("No puede dividir por cero.");
        }
    }

}
