import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.awt.Desktop;
import org.json.JSONObject;

public class APILabExample {
    public static void main(String[] args) throws Exception {
        // Specify the URL of the REST API
        String apiUrl = "https://dog.ceo/api/breeds/image/random";

        // Create a URL object
        URL url = new URL(apiUrl);

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method to GET
        connection.setRequestMethod("GET");

        // Get the response code
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        // Read the response from the API
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        // Close the connection and print the response
        reader.close();
        connection.disconnect();
        String mess = response.toString();
        System.out.println("API Response: " + mess);

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();

            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                System.out.println(mess);
                JSONObject outerJsonObject = new JSONObject(mess);
                String imageUrl = outerJsonObject.getString("message");
                System.out.println(imageUrl);
                URI url2 = new URI(imageUrl);
                desktop.browse(url2);
            } else {
                System.out.println("Browsing is not supported on this platform.");
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }
}
