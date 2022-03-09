public class Frases {

    public static String[] frases = new String[]{
        "Nada cambia si nada cambia",
        "Está comprobado que el abejorro, aerodinámicamente, no puede volar por su peso, tamaño y cuerpo, sólo que él no lo sabe.",
        "Las personas no son recordadas por el número de veces que fracasan, sino por el número de veces que tienen éxito.",
        "Ningún viento es bueno para el barco que no sabe para dónde va"
    };

    public static void main(String[] args) {        
        if( args.length == 0 ) {
            mostrarTodasLasFrases();
        } else {
            mostrarFraseAleatoria();
        }
    }

    public static void mostrarFraseAleatoria() {        
        int numeroAleatorio = (int) (Math.random()*4);
        String fraseAleatoria = frases[numeroAleatorio];
        System.out.printf("frase aleatoria = %s\n", fraseAleatoria);
    }

    public static void mostrarTodasLasFrases(){
        for(int i = 0; i < 4; i++) {
            String fraseParaMostrar = String.format("Frase %d = '%s'", (i+1), frases[i]);
            System.out.println( fraseParaMostrar );
        }
    }

}