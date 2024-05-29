/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSock = new ServerSocket(8080);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Listening at port 8080 ...");
        Socket sock = serverSock.accept();
        InputStream is = sock.getInputStream();
        OutputStream os = sock.getOutputStream();
        byte[] buf = new byte[4096];
        while(true){
            int n = is.read(buf);
            String msg = new String(buf, 0, n);
            System.out.println("Message from client:" + msg);
            String response = scanner.nextLine();
            os.write(response.getBytes());
        }
    }
}
