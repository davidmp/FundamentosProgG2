package pe.edu.upeu.arreglos;

public class PracticasArreglos {
    
    public int[] cuadrado100PrimerosNum(){
        int[] vector=new int[100];
        for(int indice=0;indice<vector.length;indice++){
            vector[indice]=(int)Math.pow(indice+1, 2);
        }
        return vector;
    }

    public void imprimirVector(int[] vector, int indiceE){
        if(indiceE<0){
        for(int indice=0;indice<vector.length;indice++){
            System.out.println(" vector["+indice+"]="+vector[indice]);
        }
        }else{ System.out.println(" vector["+indiceE+"]="+vector[indiceE]); }
    }

}