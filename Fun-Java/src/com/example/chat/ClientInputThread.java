package com.example.chat;

import java.io.BufferedReader;

public class ClientInputThread extends Thread {
    BufferedReader br;

    public ClientInputThread(BufferedReader br) {
        this.br = br;
    }

    @Override
    public void run() {
        try {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("연결이 종료되었습니다.");
        }
    }
}
