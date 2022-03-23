public class ManejoExcepciones {

    private String nombre;

    public static void main(String[] args) {
        ManejoExcepciones manejoExcepciones = new ManejoExcepciones();
        try {
            manejoExcepciones.setNombre(null);
        } catch(ValorNuloException vne) {
            System.out.println( "Error: Por favor entregue un valor, NO se aceptan valores nulos." );
        } catch(ValorDemasiadoCortoException vdce) {
            System.out.println( "Error: Escriba un nombre más largo." );
        }
    }

    public void setNombre(String nombre)
        throws ValorNuloException, ValorDemasiadoCortoException {
        if(nombre == null) {
            throw new ValorNuloException();
        }
        if(nombre.length() < 2) {
            throw new ValorDemasiadoCortoException();
        }
        this.nombre = nombre;
    }
}

class ValorNuloException extends Exception {}
class ValorDemasiadoCortoException extends Exception {}
