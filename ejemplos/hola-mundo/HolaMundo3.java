public class HolaMundo3 {

    public static void main(String[] args) {
        mainSwitch(args);
    }
    
    public static void mainSwitch(String[] args) {
        switch( args.length ) {
            case 0:
                System.out.println("Hola Mundo");
                break;
            case 1:
                System.out.println(args[0]+" les desea un saludo a todo el mundo!!!");
        }
    }

    public static void mainIfElse(String[] args) {
        if( args.length == 0) {
           System.out.println("Hola Mundo");
        } else if( args.length == 1) {
            System.out.println(args[0]+" les desea un saludo a todo el mundo!!!");
        }
    }
}
