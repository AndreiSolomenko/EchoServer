package ua.solomenko.net;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 3000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        Scanner scanner = new Scanner(System.in);
        while (true){
            String message = scanner.nextLine();
            writer.write(message + "\n");
            writer.flush();
            String answer = reader.readLine();
            System.out.println(answer);
        }
    }
}






