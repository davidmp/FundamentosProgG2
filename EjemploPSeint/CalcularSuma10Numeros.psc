Algoritmo Suma10Numeros
	Definir contador Como Entero	
	Definir valor_num, suma_numeros Como Real
	contador<-1
	suma_numeros<-0
	//Datos de entrada y Proceso
	Mientras contador<=10 Hacer
		Escribir "Ingrese valor numerico de la posicion ", contador
		Leer valor_num
		suma_numeros<-suma_numeros+valor_num
		contador<-contador+1
	FinMientras
	//Datos de Salida
	Escribir "La suma de los 10 numeros es:", suma_numeros
FinAlgoritmo
