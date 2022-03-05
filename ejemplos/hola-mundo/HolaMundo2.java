public class HolaMundo2 {

    public static void main(String[] args) {
        if( args.length == 0) {
           System.out.println("Hola Mundo");
        } else if( args.length == 1) {
            System.out.println(args[0]+" les desea un saludo a todo el mundo!!!");
        }
    }
}
