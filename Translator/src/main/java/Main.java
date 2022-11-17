import Connection.URLBuilder;
import Connection.URLConnector;



public class Main {
    public static void main(String[] args) {
        URLConnector uc = new URLConnector();
        uc.connectToURL();

        URLBuilder ub = new URLBuilder();
        System.out.println("ha llo test");
        System.out.println(ub.buildURL("ha llo test"));
    }
}
