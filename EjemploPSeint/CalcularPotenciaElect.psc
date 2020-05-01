//Calcular Potencia electrica
Algoritmo CalcularPotenciaElec
	Definir potencia,intensidad,resistencia Como Real
	//Datos de entrada
	Escribir "Ingrese la Intensidad electrica:"
	Leer intensidad
	Escribir "Ingrese la resistencia:"
	Leer resistencia
	//Proceso
	potencia<-resistencia*intensidad^2
	//Datos de Salida
	Escribir "La potencia electrica es: ", potencia, " wats"
FinAlgoritmo