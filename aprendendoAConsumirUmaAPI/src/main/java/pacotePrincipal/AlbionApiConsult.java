package pacotePrincipal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class AlbionApiConsult {

    private BufferedReader reader;
    private String line;
    private StringBuffer responseContent = new StringBuffer();
    private HttpURLConnection connection;
    private int status;

    public String searchAlbion(String urlString) throws MalformedURLException, IOException {

        try {
            URL url = new URL("https://gameinfo.albiononline.com/api/gameinfo/search?q=" + urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            status = connection.getResponseCode();
            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {

                    responseContent.append(line);
                }
                reader.close();
            }
            return responseContent.toString();
        } catch (MalformedURLException e) {
            return e.toString();
        } catch (IOException e) {
            return e.toString();
        }

    }
}
