import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DesktopExample {
    public static void main(String[] args) {
        // Check if Desktop is supported
        if (Desktop.isDesktopSupported()) {
            // Get the Desktop object
            Desktop desktop = Desktop.getDesktop();

            // Check if BROWSE action is supported
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    // Open a URL in the default browser
                    desktop.browse(new URI("https://youtu.be/rsqM8wH52rg?si=E36lDufduPzXHGBe&t=12"));
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Browsing is not supported on this platform.");
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }
}