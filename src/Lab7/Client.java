
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        Socket sock = new Socket("localhost", 8080);
        InputStream is = sock.getInputStream();
        OutputStream os = sock.getOutputStream();
        byte[] buf = new byte[4096];
        while(true){
            System.out.print("Enter a message:");
            String msg = scanner.nextLine();
            os.write(msg.getBytes());
            int n = is.read(buf);
            String response = new String(buf, 0, n);
            System.out.println("Server response:" + response);
        }
    }
    
}
