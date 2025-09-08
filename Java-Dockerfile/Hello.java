import java.io.*;
import java.net.*;

public class Hello {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(2000);
        System.out.println("Java HTTP server running on port 2000...");

        while (true) {
            Socket socket = server.accept();

            // Input/Output
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Read request (but ignore details)
            String line;
            while ((line = in.readLine()) != null && !line.isEmpty()) {
                System.out.println(line); // log request
            }

            // Send proper HTTP response
            String body = "Hello from Java Docker container!";
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/plain");
            out.println("Content-Length: " + body.length());
            out.println(); // blank line between headers and body
            out.println(body);

            socket.close();
        }
    }
}
