public class Calculadora {

    public static void main(String[] args) {
        boolean tiene1arg = args.length == 1;
        boolean tieneArgAyuda = "help".equals( args[0] );
        if( tiene1arg && tieneArgAyuda ){
            String textoAyuda = """
                Calculadora por Línea de Comandos
                =================================
                Argumento 1: Número 1
                Argumento 2: Puede ser suma o resta
                Argumento 3: Número 2
                
""";
            System.out.println( textoAyuda );
            return;
        }

        if( args.length == 3 ) {
            int numero1 = Integer.parseInt(args[0]);
            int numero2 = Integer.parseInt(args[2]);
            int resultado = 0;
            switch( args[1] ) {
                case "suma":
                    resultado = numero1 + numero2;
                    break;
                case "resta":
                    resultado = numero1 - numero2;
                    break;
            }
            System.out.println("El resultado es "+resultado);
        } else {
            System.out.println("Utilice help para leer la documentación!");
        }
    }

}
