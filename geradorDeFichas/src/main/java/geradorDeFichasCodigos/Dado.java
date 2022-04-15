package geradorDeFichasCodigos;

import java.util.Random;

public class Dado {

    private int resultadoDado;

    public String getResultadoDadoString(int size) {
        String resultadoString = Integer.toString(getResultadoDado(size));
        return resultadoString;
    }
    
    public int getResultadoDado(int size) {
        Random rd = new Random();
        this.setResultadoDado(rd.nextInt(size)+1);
        return this.getResultadoDado();
    }

    public int getResultadoDado() {
        return resultadoDado;
    }

    public void setResultadoDado(int resultado) {
        this.resultadoDado = resultado;
    }
}
