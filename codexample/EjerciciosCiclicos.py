class EjerciciosCiclosPy:
  def calcularFactorialNum(self):
    contador=1
    resultado=1
    numero=int(input("Ingrese el numero para calcular el Factorial:"))
    if(numero>0):
      while(contador<numero):
        contador=contador+1
        resultado=resultado*contador
    print(f"El Factorial de {numero}  Es: {resultado}")

obj=EjerciciosCiclosPy()
obj.calcularFactorialNum()
