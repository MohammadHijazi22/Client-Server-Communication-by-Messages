import java.net.*;
import java.io.*;
class Server{
    public static void main(String[] args)throws Exception{
        ServerSocket ss=new ServerSocket(3333); //The port of the socket is: 3333.
        Socket s=ss.accept();
        //Listens for a connection to be made to this socket and accepts it. The method blocks until a connection is made.
        System.out.println("There's a connection now.");
        DataInputStream din=new DataInputStream(s.getInputStream());
        //getInputStream() returns an input stream for this socket.
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        //getOutputStream() returns an output stream for this socket.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Input stream used to accept a line of input from the keyboard

        String str="",str2="";
        while(!str.equals("stop")){
            str=din.readUTF();
            System.out.println("client says: "+str);
            str2=br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
}
