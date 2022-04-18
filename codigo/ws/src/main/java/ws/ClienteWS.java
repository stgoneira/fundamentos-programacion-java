package ws;

import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClienteWS {

	public static void main(String[] args) {
		getIndicador();
	}
	
	public static void getIndicador() {
		String url = "https://mindicador.cl/api";
		try {
			String jsonData = getURLContent(url);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode indicadores = mapper.readTree(jsonData);
			Float uf = Float.parseFloat( indicadores.get("uf").get("valor").asText() );
			System.out.printf( "UF: %.2f", uf );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getUsers() {
		String url 		= "https://jsonplaceholder.typicode.com/users";
		try {
			String jsonData = getURLContent(url);
			ObjectMapper mapper = (new ObjectMapper()).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			List<Usuario> usuarios = mapper.readValue(jsonData, new TypeReference<List<Usuario>>(){});
			System.out.println( usuarios );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getPosts() {
		String url 		= "https://jsonplaceholder.typicode.com/posts";
		try {
			String jsonData = getURLContent(url);
			ObjectMapper mapper = new ObjectMapper();
			List<Post> posts = mapper.readValue(jsonData, new TypeReference<List<Post>>(){});
			System.out.println( posts );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String getURLContent(String url) throws Exception {
		try (
			InputStream stream = (new URL(url)).openStream(); 
		){		
			return new String(stream.readAllBytes(), StandardCharsets.UTF_8);
		} catch (Exception e) {
			throw e;
		}
	}

}

class Usuario {
	int id;
	String name;
	String email;
	@JsonProperty("username")
	String user;
	
	@Override
	public String toString() {	
		return String.format("ID: %d Nombre: %s Email: %s Usuario: %s %n%n", id, name, email, user);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}	
}

class Post {
	int userId;
	int id;
	String title;
	String body;
	
	@Override
	public String toString() {		
		return String.format("ID: %d Título: %s Texto: %s %n%n", id, title, body);
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
