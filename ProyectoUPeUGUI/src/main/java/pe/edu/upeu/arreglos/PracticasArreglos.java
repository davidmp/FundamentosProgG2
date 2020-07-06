package pe.edu.upeu.arreglos;

import pe.edu.upeu.utils.LeerTeclado;

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

    public int[] rellenarValoresVector(int tamanhoV){
        int[] vector=new int[tamanhoV];
        LeerTeclado teclado=new LeerTeclado();
        for(int subIndice=0;subIndice<vector.length;subIndice++){
            vector[subIndice]=teclado.leer(0, 
            "Ingrese el valor de vector en el subIndice "+subIndice+":");
        }
        return vector;
    }

    public int[][] matrizIdentidad(int tamanhoV){
        int[][] matriz=new int[tamanhoV][tamanhoV];
        for(int indiceF=0;indiceF<matriz.length;indiceF++){
            for(int indiceC=0;indiceC<matriz.length;indiceC++){
                if(indiceF==indiceC){
                    matriz[indiceF][indiceC]=1;
                }else{
                    matriz[indiceF][indiceC]=0;
                }
            }
        }
        return matriz;
    }

    public void imprimirMatriz(int[][] matriz){
        for(int indiceF=0;indiceF<matriz.length;indiceF++){
            for(int indiceC=0;indiceC<matriz.length;indiceC++){
                System.out.print(matriz[indiceF][indiceC]+"\t");
            }
            System.out.println("");
        }        
    }



}