import Models.Teams;

import java.util.HashMap;
import java.util.List;

public class GenerateResults {

    /**
     * Diccionario para guardar el equipo y sus resultados
     * Donde la key es el nombre del equipo
     * Y el valor es un objeto de la clase Team
     */
    public static HashMap<String, Teams> dict = new HashMap<String, Teams>();


    /**
     * Metodo que recibe un partido  y lo divide en  local, visitante y resultado
     *
     * @param match String con los valores separados por ;
     * @return Arreglo donde el primer valor es el local el segundo el visitante y el tercero el resultado
     */
    public static String[] splitMatch(String match) {

        String[] MatchResult = match.split(";");

        for (String partido : MatchResult) {
        //    System.out.println(partido);

        }

        return MatchResult;
    }

    /**
     * ESte metodo modifica los valores del objeto Team de acuerdo al resultado del partido
     * @param LocalExist  Variable para saber si el equipo local existe en el diccionario
     * @param VisitExist  Variable para saber si el equipo visitante existe en el diccionario
     * @param local       Variable con el nombre del equipo  local
     * @param visitante   Variable con el nombre del equipo  visitante
     * @param ptsLocalTeam Variable con los puntos a obtener para el equipo local de acuerdo al resultado del partido
     * @param ptsVisitTeam Variable con los puntos a obtener para el equipo visitante de acuerdo al resultado del partido
     * @param resultado  Variable que dice que tipo de resultado se obtuvo del juego: 0 si se gano 1 si se empato 2 si se perdio
     */

    public static void modifyByResult(boolean LocalExist, boolean VisitExist, String local, String visitante, int ptsLocalTeam, int ptsVisitTeam, int resultado) {

        Teams obj;
        //si el equipo local existe se modifican sus parametros de acuero al resultado
        if (LocalExist) {
            //se aumenta en 1 el valor de los partidos jugados
            dict.get(local).setMP(dict.get(local).getMP() + 1);
            // si se gano  se aumenta en 1 el valor de partidos ganados
            if (resultado == 0) {
                dict.get(local).setW(dict.get(local).getW() + 1);
                // si se empato  se aumenta en 1 el valor de partidos empatados
            } else if (resultado == 1) {
                dict.get(local).setD(dict.get(local).getD() + 1);
                // si se perdio  se aumenta en 1 el valor de partidos perdidos
            } else if (resultado == 2) {
                dict.get(local).setL(dict.get(local).getL() + 1);
            }
            //se aumenta los puntos de acuerdo al resultado
            dict.get(local).setP(dict.get(local).getP() + ptsLocalTeam);
        } else {
            // si no exite se crea un elemento del diccionario
            dict.put(local, obj = new Teams());
            //se aumenta en 1 el valor de los partidos jugados
            dict.get(local).setMP(dict.get(local).getMP() + 1);
            // si se gano  se aumenta en 1 el valor de partidos ganados
            if (resultado == 0) {
                dict.get(local).setW(dict.get(local).getW() + 1);
                // si se empato  se aumenta en 1 el valor de partidos empatados
            } else if (resultado == 1) {
                dict.get(local).setD(dict.get(local).getD() + 1);
                // si se perdio  se aumenta en 1 el valor de partidos perdidos
            } else if (resultado == 2) {
                dict.get(local).setL(dict.get(local).getL() + 1);
            }
            //se aumenta los puntos de acuerdo al resultado
            dict.get(local).setP(dict.get(local).getP() + ptsLocalTeam);

        }
        //si la visita existe se modifican sus parametros de acuero al resultado
        if (VisitExist) {
            //se aumenta en 1 el valor de los partidos jugados
            dict.get(visitante).setMP(dict.get(visitante).getMP() + 1);
            // si se gano  se aumenta en 1 el valor de partidos perdidos
            if (resultado == 0) {
                dict.get(visitante).setL(dict.get(visitante).getL() + 1);
                // si se empato  se aumenta en 1 el valor de partidos empatados
            } else if (resultado == 1) {
                dict.get(visitante).setD(dict.get(visitante).getD() + 1);
                // si se perdio  se aumenta en 1 el valor de partidos ganados
            } else if (resultado == 2) {
                dict.get(visitante).setW(dict.get(visitante).getW() + 1);
            }
            //se aumenta los puntos de acuerdo al resultado
            dict.get(visitante).setP(dict.get(visitante).getP() + ptsVisitTeam);
        } else {
            // si no exite se crea un elemento del diccionario
            dict.put(visitante, obj = new Teams());
            //se aumenta en 1 el valor de los partidos jugados
            dict.get(visitante).setMP(dict.get(visitante).getMP() + 1);
            // si se gano  se aumenta en 1 el valor de partidos perdidos
            if (resultado == 0) {
                dict.get(visitante).setL(dict.get(visitante).getL() + 1);
                // si se empato  se aumenta en 1 el valor de partidos empatados
            } else if (resultado == 1) {
                dict.get(visitante).setD(dict.get(visitante).getD() + 1);
                // si se perdio  se aumenta en 1 el valor de partidos ganados
            } else if (resultado == 2) {
                dict.get(visitante).setW(dict.get(visitante).getW() + 1);
            }
            //se aumenta los puntos de acuerdo al resultado
            dict.get(visitante).setP(dict.get(visitante).getP() + ptsVisitTeam);

        }
    }


    /**
     * Metodo para modificar los atributos del Objeto Team si el equipo gano
     *
     * @param local equipo local
     * @param visitante equipo visitante
     * @param resultado Resultado del partido para el equipo local
     *
     *
     */
    public static void modifyTeamsResult(String local, String visitante, String resultado) {
        //variables para settear los puntos de los equipos por cada partido
        int ptsLocalTeam = 0;
        int ptsVisitTeam = 0;


        //variables para saber si es equipo existe en el diccionario
        boolean LocalExist = dict.containsKey(local);
        boolean VisitExist = dict.containsKey(visitante);

        switch (resultado) {

            case "win":
                ptsLocalTeam = 3;
                ptsVisitTeam = 0;
                modifyByResult(LocalExist, VisitExist, local, visitante, ptsLocalTeam, ptsVisitTeam, 0);

                break;

            case "draw":
                ptsLocalTeam = 1;
                ptsVisitTeam = 1;
                modifyByResult(LocalExist, VisitExist, local, visitante, ptsLocalTeam, ptsVisitTeam, 1);
                break;

            case "loss":
                ptsLocalTeam = 0;
                ptsVisitTeam = 3;
                modifyByResult(LocalExist, VisitExist, local, visitante, ptsLocalTeam, ptsVisitTeam, 2);
                break; // break es opcional

            default:
                break;
        }

    }

    /**
     * Metodo final para obtener los resultados
     * @param partidos lista de partidos obtenidos de la clase LoadData del metodo loadData
     */
    public static void results(List<String> partidos) {

        //Controla los ciclos de todos los partidos
        for (String partido : partidos) {


            /**
             * Arreglo de String  con los datos del partdo
             * Pos arr 0 -> Equipo Local
             * Pos arr 1 -> Equipo Visitante
             * Pos arr 2 -> Resultado
             */
            String[] matchData = splitMatch(partido);

            modifyTeamsResult(matchData[0],matchData[1],matchData[2]);


        }


    }


}
