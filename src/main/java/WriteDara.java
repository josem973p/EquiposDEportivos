import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDara {
    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }



    public static void WriteTable() throws IOException {

        FileWriter fichero = null;
        PrintWriter pw = null;

        fichero = new FileWriter("./TablaResultados.txt");
        pw = new PrintWriter(fichero);

       int tam=0;
       int whiteSpace = 0;
       int format=50;

        pw.println("Team                           | MP | W | D | L | P ");

        for (String key : GenerateResults.dict.keySet()) {

            pw.println( padRight(key, 30) +"   "+ GenerateResults.dict.get(key).getMP()+"    "+  GenerateResults.dict.get(key).getW()+"   "+  GenerateResults.dict.get(key).getD()+"   "+ GenerateResults.dict.get(key).getL()+"   "+ GenerateResults.dict.get(key).getP());

       //     System.out.println("_________________________");
        }

        if (null != fichero)
            fichero.close();



    }




}
