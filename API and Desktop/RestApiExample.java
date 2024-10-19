import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.io.OutputStream;
import org.json.JSONObject;

public class RestApiExample {
    private static final String API_URL = "https://example.com/api/people";

    public static void main(String[] args) throws Exception {
        // POST operation
        JSONObject aliceData = new JSONObject();
        aliceData.put("name", "Alice");
        aliceData.put("age", 30);
        aliceData.put("isStudent", false);
        aliceData.put("hobbies", new String[]{"reading", "coding", "traveling"});
        JSONObject address = new JSONObject();
        address.put("city", "Wonderland");
        address.put("country", "Fictionland");
        aliceData.put("address", address);

        String postResponse = sendHttpRequest(API_URL, "POST", aliceData.toString());
        System.out.println("POST Response: " + postResponse);

        // GET operation
        String getResponse = sendHttpRequest(API_URL, "GET", null);
        System.out.println("GET Response: " + getResponse);

        // PUT operation
        JSONObject putData = new JSONObject();
        putData.put("age", 31);
        putData.put("isStudent", true);

        String putResponse = sendHttpRequest(API_URL + "/1", "PUT", putData.toString());
        System.out.println("PUT Response: " + putResponse);

        // DELETE operation
        String deleteResponse = sendHttpRequest(API_URL + "/1", "DELETE", null);
        System.out.println("DELETE Response: " + deleteResponse);
    }

    private static String sendHttpRequest(String apiUrl, String method, String data) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(method);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        if (data != null) {
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = data.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
        }

        int responseCode = connection.getResponseCode();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();
        connection.disconnect();

        return response.toString();
    }
}