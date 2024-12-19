import java.io.*;
import java.net.*;
import java.util.*;

public class KnockKnockServer {
    private static Set<PrintWriter> clientWriters = new HashSet<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(4444);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(1);
        }

        while (true) {
            Socket clientSocket = null;
            try {
                clientSocket = serverSocket.accept();
                new ClientHandler(clientSocket).start();
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        private KnockKnockProtocol kkp;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                synchronized (clientWriters) {
                    clientWriters.add(out);
                }

                kkp = new KnockKnockProtocol();
                String inputLine, outputLine;

                outputLine = kkp.processInput(null);
                out.println(outputLine);

                while ((inputLine = in.readLine()) != null) {
                    outputLine = kkp.processInput(inputLine);
                    synchronized (clientWriters) {
                        for (PrintWriter writer : clientWriters) {
                            writer.println("Client " + this.getId() + ": " + inputLine);
                            writer.println("Server: " + outputLine);
                        }
                    }
                    if (outputLine.equals("Bye.")) {
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    in.close();
                    out.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                synchronized (clientWriters) {
                    clientWriters.remove(out);
                }
            }
        }
    }
}

