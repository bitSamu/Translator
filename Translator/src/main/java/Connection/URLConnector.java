package Connection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnector {

    public final String URL = "https://www.deepl.com/de/translator#en/de/";

    public URLConnector(){}

    /**
     * connects to a given URL
     */
    public void connectToURL(){
        //TODO add lanCode to function
        try {
            URL myURL = new URL(URL);
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            System.out.println("Succsessfully connected");
        }
        catch (MalformedURLException e) {
            System.out.println("ERROR: new URL() failed \n Check your internet connection");

        }
        catch (IOException e) {
            System.out.println("ERROR: openConnection() failed \n Check your internet connection");
        }
    }
}
