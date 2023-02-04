import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class APIdemo2 {

    public static void main(String[] args) throws IOException , InterruptedException{

        var url= "https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=2c32271d4b06436c82db08e40ba1d550&include=minutely\n";

        var request= HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        var client = HttpClient.newBuilder().build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());

        System.out.println(response.body());

    }
}