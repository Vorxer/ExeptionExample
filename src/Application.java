public class Application {
    public static void main(String[] args) {
        Client client = new Client();
        Frontend frontend = new Frontend();
        client.initConn();
        frontend.UIButtonClick(client , 3);
    }
}
