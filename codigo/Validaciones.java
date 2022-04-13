import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Validaciones {
    public static void main(String[] args) {
        // estaEnConjunto();
        // validacionTelefono();
        // validacionVacio();
        // validacionEmail();
        // validacionFechas();
    }

    public static void validacionFechas() {
        // Exception java.time.DateTimeException: Invalid date 'February 29' as '2022' is not a leap year
        // LocalDate.of(2022, 2, 29);
    }

    public static void validacionEmail() {
        // https://www.w3schools.com/java/java_regex.asp
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html
        String email1 = "abc@123.cl";
        String email2 = "123456.cl";
        Pattern patronRegex = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+\\.(com|cl)$");
        boolean email1Valido = patronRegex.matcher(email1).matches();
        boolean email2Valido = patronRegex.matcher(email2).matches();
        System.out.println( email1Valido );
        System.out.println( email2Valido );
    }

    public static void validacionVacio() {
        String valor    = " ";
        boolean valido;
        int largoString = valor.length();
        valido  = valor.isEmpty(); // false 
        valido  = valor.isBlank(); // true 
    }

    public static void validacionTelefono() {
        String telefono = "  9 8844 3344   ";
        String sinEspaciosCyF = telefono.strip();
        String remueveEspacios = sinEspaciosCyF.replace(" ", "");
        boolean esValido = remueveEspacios.matches("[0-9]{9}");
    }

    public static void estaEnConjunto() {
        List<String> permitidos = Arrays.asList("BMW", "Mercedez", "Audi");        
        System.out.println( permitidos.contains("Toyota") );
        System.out.println( permitidos.contains("Audi") );
    }
}