import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {
    
    public static void main(String[] args) {
        mapaConListaAnidada();
    }

    public static void mapaConListaAnidada() {
        Map<String, List<String>> paisesPorContinente = new HashMap<>();
        paisesPorContinente.put("America", Arrays.asList("Chile", "Argentina", "Perú", "Colombia"));
        paisesPorContinente.put("Europa", Arrays.asList("España", "Portugal", "Alemania", "Polonia"));
        paisesPorContinente.put("Africa", Arrays.asList("Egipto", "Tanzania", "Nigeria", "Libia"));

        paisesPorContinente.forEach((continente, paises) -> System.out.printf("Continente: %s y sus países: %s %n", continente, paises));
    }

    public static void ejemploLinkedHashMap() {
        // Sintaxis: Map<TipoClave, TipoValor> nombreVariable = new ImplementacionMap<>();
        Map<String, String> traducciones = new LinkedHashMap<>();

        traducciones.put("hola", "hello");
        traducciones.put("chao", "bye");
        traducciones.put("buenos días", "good morning");

        // iterar sobre el mapa
        // con HashMap el orden es determinado por la implementación y NO por nosotros 
        // si necesitamos especificar el orden podemos usar TreeMap (Comparable o Comparator)
        // y si necesitamos mantener el orden de inserción nos sirve LinkedHashMap 
        traducciones.forEach( (clave, valor) -> System.out.printf("Español: %s | Inglés: %s %n", clave, valor) );
    }

    public static void ejemploTreeMap() {
        // Sintaxis: Map<TipoClave, TipoValor> nombreVariable = new ImplementacionMap<>();
        Map<String, String> traducciones = new TreeMap<>();

        traducciones.put("hola", "hello");
        traducciones.put("chao", "bye");
        traducciones.put("buenos días", "good morning");

        // iterar sobre el mapa
        // con HashMap el orden es determinado por la implementación y NO por nosotros 
        // si necesitamos especificar el orden podemos usar TreeMap (Comparable o Comparator)
        // y si necesitamos mantener el orden de inserción nos sirve LinkedHashMap 
        traducciones.forEach( (clave, valor) -> System.out.printf("Español: %s | Inglés: %s %n", clave, valor) );
    }

    public static void mapasBasicosHashMap() {
        // Sintaxis: Map<TipoClave, TipoValor> nombreVariable = new ImplementacionMap<>();
        Map<String, String> traducciones = new HashMap<>();

        traducciones.put("hola", "hello");
        traducciones.put("chao", "bye");
        traducciones.put("buenos días", "good morning");

        // recuperar clave específica 
        String buenosDiasEnIngles = traducciones.get("buenos días");
        System.out.printf("buenos días en inglés se dice: %s %n", buenosDiasEnIngles);

        System.out.println();

        // iterar sobre el mapa
        // con HashMap el orden es determinado por la implementación
        // y NO por nosotros 
        // si necesitamos especificar el orden podemos usar TreeMap 
        // y si necesitamos mantener el orden de inserción nos sirve LinkedHashMap 
        traducciones.forEach( (clave, valor) -> System.out.printf("Español: %s | Inglés: %s %n", clave, valor) );
    }

}
