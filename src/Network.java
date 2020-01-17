import exeptions.ConnectionFailiureExeption;
import exeptions.RequestExeption;

import java.io.IOException;

public class Network {

    Client client;
    Server server;

    public Network(Client c) throws ConnectionFailiureExeption {
         this.client = c;
         this.server = new Server();
         if(Math.random() > 0.3){
             throw new ConnectionFailiureExeption();
         }

    }

    public String getRequest(int command) throws RequestExeption{
        try {
            return server.processRequest(command);
        }catch (IOException io){
            throw new RequestExeption("Server Returned Error",io);
        }
    }


}
