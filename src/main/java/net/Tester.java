package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Tester {
    public static void main(String[] args){
        //TELENT,RFC854
        try {
            Socket socket = new Socket("ppt.cc",23);
            InputStream is = socket.getInputStream();
            for (int i = 0; i < 500; i++) {
                int data = is.read();
                System.out.println((char) data);
            }
        } catch (IOException e ){
            e.printStackTrace();
        }
    }
}
