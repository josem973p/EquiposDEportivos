import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Lista de partidos cargados desde el  archivo txt
         */
        List<String> matches= LoadData.loadData("./partidos.txt");

        GenerateResults.results(matches);

        for (String key : GenerateResults.dict.keySet()) {
            System.out.println(key);
            System.out.println(key + "Juegos Jugados = " + GenerateResults.dict.get(key).getMP());
            System.out.println(key + "Juegos Ganados = " + GenerateResults.dict.get(key).getW());
            System.out.println(key + "Juegos Empatados = " + GenerateResults.dict.get(key).getD());
            System.out.println(key + "Juegos Perdidos = " + GenerateResults.dict.get(key).getL());
            System.out.println(key + "Total de puntos = " + GenerateResults.dict.get(key).getP());

            System.out.println("_________________________");
        }

        WriteDara.WriteTable();


    }
}
