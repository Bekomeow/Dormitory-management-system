package com.example.project_inf201;

import java.io.*;
import java.net.*;

public class Client implements ServerConnection{
    static String student_email;
    static String university_email;
    static String fromServer;
    public static void sendMessageToServer(String message)  {
        try {
            // нужно написать host
            InetAddress host = InetAddress.getLocalHost();
            Socket socket = new Socket(host, 1024);
            System.out.print("Client: ");
            System.out.println(message);
            String fromClient = "Client: " + message;
            ServerConnection.sendMessage(socket, fromClient);
            fromServer = ServerConnection.getMessage(socket);
            System.out.println(fromServer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
