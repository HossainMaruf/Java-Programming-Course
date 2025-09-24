import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ModernApproach {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient(); 
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://jsonplaceholder.typicode.com/todos/1"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response body: " + response.body());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
