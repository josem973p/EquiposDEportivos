package Models;

public class Teams {
    //Atributo para  Partidos Jugados
    private int MP=0;
    //Atributo para  Partidos Ganados
    private int W=0;
    //Atributo para  Partidos Empatados
    private int D=0;
    //Atributo para  Partidos Perdidos
    private int L=0;
    //Atributo para  Puntos Totales
    private int P=0;

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getW() {
        return W;
    }

    public void setW(int W) {
        this.W = W;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getL() {
        return L;
    }

    public void setL(int L) {
        this.L = L;
    }

    public int getP() {
        return P;
    }

    public void setP(int P) {
        this.P = P;
    }

}
