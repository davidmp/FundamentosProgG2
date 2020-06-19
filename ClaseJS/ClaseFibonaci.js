class ClaseFibonaciX{
    resultado=0;

    fibonaciRec(n){
        if(n<0){ return -1; }
        if(n==0 || n==1){ return n; }
        else{
            console.log("f(n-1):"+(n-1)+" f(n-2):"+(n-2));
            return this.fibonaciRec(n-1)+this.fibonaciRec(n-2);
        }
    }  
    
    fibonaci(n){
       var valAnt1=1; var valAnt2=1;
        if(n<0){ this.resultado=-1; }
        if(n==0 || n==1){ this.resultado=n; }
        else{
            for(var i=2; i<n;i++){
                this.resultado=valAnt1+valAnt2;
                valAnt2=valAnt1;
                valAnt1=this.resultado;
            }            
        }
        return this.resultado;
    }     
    
}

