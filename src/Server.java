import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            s.close();
            ss.close();
}catch(Exception e){System.out.println(e);}
    }
}
