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

    public void sumaElemMediaArit(){
        int[] vector={15,11,1,8,15,3,9,20};
        int sumaElementos=0; double mediaArtir=0;
        for(int subIndice=0;subIndice<vector.length;subIndice++){
            sumaElementos+=vector[subIndice];//sumaElementos=sumaElementos+vector[subIndice];
        }
        System.out.println("Suma de Elementos:"+sumaElementos);
        mediaArtir=(double)(sumaElementos)/vector.length;
        System.out.println("Media Artirmetica:"+mediaArtir);
    }

    public void sumaElemMediaAritD(int[] vector){        
        int sumaElementos=0; double mediaArtir=0;
        for(int subIndice=0;subIndice<vector.length;subIndice++){
            sumaElementos+=vector[subIndice];//sumaElementos=sumaElementos+vector[subIndice];
        }
        System.out.println("Suma de Elementos:"+sumaElementos);
        mediaArtir=(double)(sumaElementos)/vector.length;
        System.out.println("Media Artirmetica:"+mediaArtir);
    }    

}