import exeptions.RequestExeption;

import java.io.IOException;

public class Client {

    public Network network;



    void initConn(){
        this.network = new Network(this);

    }

    String sendRequest(int command) throws IOException{
        try {
            return network.getRequest(command);
        }catch (RequestExeption re){
            throw new IOException("Unable to Send Request",re);

        }
    }
}
