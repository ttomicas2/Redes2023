import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente2 {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("127.0.0.1",6666);
            DataInputStream din =new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";
            while(!str.equals("stop")){
                str=br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2=din.readUTF();
                System.out.println("Client says: "+str2);
            }

            dout.close();
            s.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}