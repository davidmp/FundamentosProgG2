package upeu.edu.pe.ejercicios;

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

    public BigInteger numFactorialRecur(int numero){
        BigInteger resultado=BigInteger.valueOf(1);
        if(numero>0){
            resultado=(BigInteger.valueOf(numero)).multiply(numFactorialRecur(numero-1));  
        }
        return resultado;
    }

    public int fibonaciRec(int n){
        if(n<0){ return -1; }
        if(n==0 || n==1){ return n; }
        else{
            System.out.println("f(n-1):"+(n-1)+" f(n-2):"+(n-2));
            return fibonaciRec(n-1)+fibonaciRec(n-2);
        }
    }



}