import java.io.IOException;

public class Frontend {

    public void UIButtonClick(Client client , int command){
        try{
            client.sendRequest(command);
        }catch (IOException io){
            System.out.println("Unable to complete command");
            io.printStackTrace();
        }
    }
}
