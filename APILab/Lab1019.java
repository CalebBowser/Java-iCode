import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.io.OutputStream;
import org.json.JSONObject;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
public class Lab1019 {
    private static final String API_URL = "https://api.football-data.org/v4/competitions/";

    public static void main(String[] args) throws Exception {
        JSONObject urldata = new JSONObject();
        urldata.put("Url", "https://crests.football-data.org/CLI.svg");
        String RealURL = urldata.getString("Url");
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI(RealURL));
    }
}
