package com.example.chat.exam;

import java.io.BufferedReader;

public class ClientInputThreadExam extends Thread{
    BufferedReader in = null;

    public ClientInputThreadExam(BufferedReader in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
