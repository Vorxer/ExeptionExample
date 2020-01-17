import java.io.IOException;

public class Server {

    public String processRequest(int command) throws IOException{
        if(Math.random() > 0.6){
            throw new IOException();
        }
        return "";
    }

}
