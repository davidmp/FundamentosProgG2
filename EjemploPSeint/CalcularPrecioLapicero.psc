Algoritmo CalcularPrecioLapicero
	//Definir variables
	Definir cantidadLapiceros como entero
	Definir precioTotal como real
	//Datos de Entrada
	Escribir "Ingrese la cantidad de Lapiceros:"
	Leer cantidadLapiceros
	//Proceso
	si cantidadLapiceros>=1000 Entonces
		precioTotal<-0.85*cantidadLapiceros
	SiNo
		precioTotal<-0.90*cantidadLapiceros
	FinSi
	//Datos de Salida
	Escribir "El costo total a pagar es: S/. ",precioTotal, " Soles"
FinAlgoritmo