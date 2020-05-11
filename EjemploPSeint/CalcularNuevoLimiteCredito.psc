Algoritmo CalcularNuevoLimiteCredito
	Definir tipoTar Como Entero
	Definir nuevoLimiteCred, creditoActual Como Real
	//Datos de entrada
	Escribir "Ingrese el Tipo de Tarjeta que Tiene:"
	Leer tipoTar
	Escribir "Ingrese el monto limite actual de su tarjeta:"
	Leer creditoActual
	//Proceso
	Segun tipoTar hacer
		1: nuevoLimiteCred<-creditoActual+(creditoActual*25)/100
		2: nuevoLimiteCred<-creditoActual+(creditoActual*35)/100
		3: nuevoLimiteCred<-creditoActual+(creditoActual*40)/100
		De Otro Modo:
			nuevoLimiteCred<-creditoActual+(creditoActual*50)/100
	FinSegun
	//Datos de Salida
	Escribir "El nuevo límite de crédito es: ", nuevoLimiteCred, " de la tarjeta de Tipo: ", tipoTar	
FinAlgoritmo
