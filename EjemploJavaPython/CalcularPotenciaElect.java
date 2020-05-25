/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debera llamarse "CALCULARPOTENCIAELEC.java."
package ejemplojavapython;
import java.io.*;
public class CalcularPotenciaElect {
	// Calcular Potencia electrica 
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double intensidad;
		double potencia;
		double resistencia;
		// Datos de entrada 
		System.out.println("Ingrese la Intensidad electrica:");
		intensidad = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese la resistencia:");
		resistencia = Double.parseDouble(bufEntrada.readLine());
		// Proceso 
		potencia = resistencia*Math.pow(intensidad,2);
		// Datos de Salida 
		System.out.println("La potencia electrica es: "+potencia+" wats");
	}
}

