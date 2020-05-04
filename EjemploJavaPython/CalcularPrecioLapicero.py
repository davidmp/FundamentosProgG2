#Algoritmo para CalcularPrecioLapicero
precioTotal=0
#Datos de Entrada
cantidadLapiceros=int(input("Ingrese la cantidad de Lapiceros:"))
#Proceso
if cantidadLapiceros>=1000:
	precioTotal=round(0.85*cantidadLapiceros,2)
else:
	precioTotal=round(0.90*cantidadLapiceros,2)
#Datos de Salida
print("El costo total a pagar es: S/. ",precioTotal," Soles")