import java.net.*; //It provides classes/packages for implementing/using networking applications in your java code.
import java.io.*; //Input/Output package.
class Client{
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",3333);
        //Creates a stream socket and connects it to the specified port number on the named host.
        DataInputStream din=new DataInputStream(s.getInputStream());
        //getInputStream() returns an input stream for this socket.
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        //getOutputStream() returns an output stream for this socket.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Input stream used to accept a line of input from the keyboard.

        String str="",str2="";
        while(!str.equals("stop")){
            str=br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2=din.readUTF();
            System.out.println("Server says: "+str2);
        }

        dout.close();
        s.close();
    }
}
