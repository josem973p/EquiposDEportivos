import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadData {


    /**
     * Metodo para cargar los partidos de un txt
     * @param archivo  archivo a cargar
     * @return Lista con los partidos
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static List<String> loadData(String archivo) throws FileNotFoundException, IOException {
        String[] dat = new String[10];
        List<String> data = new ArrayList<String>();

        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);

        while ((cadena = b.readLine()) != null) {
            data.add(cadena);

        }
        b.close();


        for ( String partido: data) {
       //     System.out.println(partido);

        }

        return data;
    }

}
