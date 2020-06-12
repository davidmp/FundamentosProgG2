package upeu.edu.pe;

import java.math.BigInteger;

public class EjerciciosSubprograma {
    //6.2
    public BigInteger numFactorial(int numero){
        int contador=1;
        BigInteger resultado=BigInteger.valueOf(1);
        if(numero>0){
        while(contador<numero){
                  contador++;              
                  resultado=resultado.multiply(BigInteger.valueOf(contador));        
                }
        }    
        return resultado;
    }


    public void factorialRango2Numeros(int numInicial, int numFinal){
        for(int numInit=numInicial; numInit<=numFinal; numInit++){
            BigInteger resultado=numFactorial(numInit);
            System.out.println("El Factorial de "+numInit+" es:"+resultado);
        }
    }

}