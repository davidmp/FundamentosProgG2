Algoritmo suma10NumerosRepiteMientras
	Definir contador Como Entero
	Definir valor_num, suma_numeros Como Real
	contador<-1
	suma_numeros<-0
	//Datos de Entrada y Proceso
	Repetir
		Escribir "Ingrese el Numero de la posicion:",contador
		Leer valor_num
		suma_numeros<- suma_numeros+valor_num
		ontador<- contador+1		
	Mientras Que contador<=10
	//Datos de Salida
	Escribir "La suma de los 10 números es:", suma_numeros
FinAlgoritmo
