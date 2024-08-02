In the basic client-server connection, a client connects to a server, and sends a message written by a user to this server that displays the message using a socket connection. 
In addition, using the same connection, the server sends an input message to the client to display it on its screen. 
Every server is a program that runs on a specific system and listens on a specific port. 
Sockets are bound to the port numbers, and when we run any server, it just listens on the socket and waits for client requests.
Client program uses Socket class to establish a connection with a server.
Socket object needs the address of the server and the port number of the server.
Each of client and server has its own input and output streams used for communication between the both. 
Two strings are initialized in both “server” and “client” classes: one for reading input from keyboard (user) and writing to the corresponding program (client or server) of this communication through its input stream, and one for reading from the corresponding one of this communication through its output stream. 
The flush() method is used to make sure that all what’s considered as input from keyboard are displayed on the screen. 
The UTF for both write and read is used here to be able to display all Unicode characters on the screen, including what’s from many languages other than English language.
Finally, when termination is to be done, both client and server send “stop” message to each other, and then the output stream of the client is closed, and then its socket.
To create the server application, we need to create the instance of ServerSocket class. 
Here, we are using 3333 port number for the communication between the client and server. 
You may also choose any other port number.
The accept() method waits for the client. 
If clients connects with the given port number, it returns an instance of Socket. 
The remaining, before going to termination code, is the same as that of client class. 
Finally, when termination is to be done, the input stream of the server is closed, and then its socket is closed before the server-socket is closed.
