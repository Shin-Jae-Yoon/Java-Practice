package com.example.chat.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClientExam {
    public static void main(String[] args) throws Exception {
        String name = args[0];

        Socket socket = new Socket("127.0.0.1", 9999);

        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        ClientInputThreadExam clientInputThread = new ClientInputThreadExam(in);
        clientInputThread.start();

        while ((line = keyboard.readLine()) != null) {
            out.println(name + " : " + line);
            out.flush();
        }

    }
}

