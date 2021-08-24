import java.util.ArrayList;

public class Percepton {
    public int neuronio(ArrayList valoresEntrada, ArrayList pesos){
        int resultado = 0;
        for(int i =0; i < valoresEntrada.size(); i++){
            resultado = resultado + (int)valoresEntrada[i] * (int)pesos[i];
        }
        resultado = resultado > 0 ? 1 : 0;
        return resultado;
    }

    public ArrayList treinar(ArrayList amostraEntrada, ArrayList pesos, double fatorAjuste){
        int _resultado = neuronio(amostraEntrada, pesos);
        if( _resultado != resultadoEsperado){
            
        }
    }
}
