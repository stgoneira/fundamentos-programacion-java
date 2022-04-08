package cli;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainMapas {

	public static void main(String[] args) {
		Map<String, List<String>> paisesSegunContinente = new HashMap<>();
		paisesSegunContinente.put("America", Arrays.asList("Chile", "Colombia", "Perú", "Venezuela"));
		paisesSegunContinente.put("Europa", Arrays.asList("España", "Portugal", "Alemania", "Francia"));
		paisesSegunContinente.put("Africa", Arrays.asList("Egipto", "Sudafrica", "Nigeria", "Tanzania"));
		
		paisesSegunContinente.forEach( (continente, paises) -> {
			paises.forEach( pais -> System.out.printf("%s pertenece al continente: %s%n", pais, continente) );
		});

	}
	
	public static void mapasConTreeMap(String[] args) {
		Map<String, String> traducciones = new TreeMap<>();
		// put(clave, valor) 
		traducciones.put("hola", "hello");
		traducciones.put("chao", "bye");
		traducciones.put("buenos días", "good morning");
		traducciones.put("¿cómo estás?", "how are you?");
		
		traducciones.forEach( (clave, valor) -> System.out.printf("Español: %s | Inglés: %s %n", clave, valor) );
	}
	
	public static void mapasConLinkedHashMap(String[] args) {
		Map<String, String> traducciones = new LinkedHashMap<>();
		// put(clave, valor) 
		traducciones.put("hola", "hello");
		traducciones.put("chao", "bye");
		traducciones.put("buenos días", "good morning");
		traducciones.put("¿cómo estás?", "how are you?");
		
		traducciones.forEach( (clave, valor) -> System.out.printf("Español: %s | Inglés: %s %n", clave, valor) );
	}
	
	public static void mapasConHashMap() {
		Map<String, String> traducciones = new HashMap<>();
		// put(clave, valor) 
		traducciones.put("hola", "hello");
		traducciones.put("chao", "bye");
		traducciones.put("buenos días", "good morning");
		traducciones.put("¿cómo estás?", "how are you?");
		
		String buenosDiasEnIngles = traducciones.get("buenos días");
		System.out.printf("Buenos días en inglés se dice: %s %n", buenosDiasEnIngles);
		
		//traducciones.forEach( (clave, valor) -> System.out.printf("Español: %s | Inglés: %s %n", clave, valor) );
	}

}
