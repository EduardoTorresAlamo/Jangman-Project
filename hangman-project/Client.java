import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {

        try {
            Socket clientSocket = new Socket();
            System.out.println("Estableciendo conexión...");
            // cambiar ip string a el ip que va a usar, tiene que ser el mismo que este en Server.java
            InetSocketAddress address = new InetSocketAddress("25.3.4.27", 8000);
            clientSocket.connect(address);
            System.out.println("Conectado!");
            InputStream input = clientSocket.getInputStream();
            OutputStream output = clientSocket.getOutputStream();
            ObjectOutputStream objOutput = new ObjectOutputStream(output);
            ObjectInputStream objInput = new ObjectInputStream(input);
            Scanner kb = new Scanner(System.in);
            String var = "";

            System.out.println(((String) objInput.readObject()));
            System.out.println(((String) objInput.readObject()));

            while (true) {

                objOutput.writeObject(kb.next().toLowerCase());

                var = (String) objInput.readObject();
                System.out.println(var);
                if (var.equals("Perdiste!!"))
                    System.exit(0);
                var = (String) objInput.readObject();
                System.out.println(var);
                if (var.equals("GANASTE!!!"))
                    System.exit(0);
                System.out.println(((String) objInput.readObject()));
                System.out.println(((String) objInput.readObject()));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
