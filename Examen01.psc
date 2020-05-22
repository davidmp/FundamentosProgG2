Algoritmo CalcularBonoDMP
	Definir puntos Como Entero
	Definir salariominimo, montobono  Como Real
	//datos de entrada
	Escribir "Ingrese el Salario Minimo:"
	Leer salariominimo
	Escribir "Ingrese el Puntaje que ha obtenido el Profesor:"
	Leer puntos
	//Proceso
	si puntos>=0 y puntos<=100 Entonces
			montobono=1*salariominimo
	sino si puntos>=101 y puntos<=150 Entonces
			montobono=2*salariominimo
		SiNo
			montobono=3*salariominimo
		FinSi		
	FinSi
	//Datos de salida
	Escribir "El monto de bono es:", montobono
FinAlgoritmo
