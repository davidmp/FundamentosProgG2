Algoritmo CalcularPresupuestoEvento
	Definir cantPersona  Como Entero
	Definir costTotal Como Real
	//Datos de entrada
	Escribir "Ingrese la cantidad de Perosonas:"
	Leer cantPersona
	//Proceso
	SI cantPersona<=200 Entonces
		costTotal<-cantPersona*95
	sino si cantPersona>200 y cantPersona<=300 Entonces
			costTotal<- cantPersona * 85 
			sino
			costTotal<- cantPersona * 75
		  finsi
	FinSi
	//Datos de Salida
	Escribir "El costo Total del evento es: $", costTotal, " Dolares"
FinAlgoritmo
