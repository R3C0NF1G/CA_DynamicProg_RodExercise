package co.edu.unbosque.model;


/**
 * 
 * Esta clase proporciona un método (resolver) para resolver el problema de corte de varillas
 * y maximizar el valor obtenido por la venta de las piezas resultantes.
 */
public class Solucion {
	
	public Solucion() {
	}
	
	/**
	 * Resuelve el problema de corte de varillas y devuelve el valor maximo obtenido.
	 * 
	 * Se crea un array que se utiliza para almacenar resultadps de los subproblemas.
	 * Se utiliza un bucle para recorrer para recorrer todos los tamaños de la varilla,
	 * en cada iteracion se calcula el valor maximo considerando todas las posibles divisiones de esta.
	 * El otro for es para hallar las posibles divisiones de la varilla actual (i), por cada division
	 * (j) se calcula el costo total dividiendo la varilla en dos y sumando valores correspondientes.
	 * Se compara el costo total con el maxVal actual, si es mayor se actualiza maxValor y el booleano
	 * se establece en true.
	 * Al final de cada iteracion del bucle principal se almacena el resultado del subproblema actual y 
	 * si el boolean es true se almacena maxValr, se almacena precios de lo contrario.
	 * 
	 * @param tamaño    Tamaño total de la varilla inicial.
	 * @param precios	Donde precios[i] es el precio para una varilla de tamaño (i+1).
	 * @return			El valor maximo obtenido al cortar la varilla.
	 */
	public int resolverConMemorizacion(int tamaño, int[] precios) {
        // Array para memorizar res
        int[] memo = new int[tamaño + 1];
        memo[0] = 0;

        for (int i = 1; i <= tamaño; i++) {
            int maxValor = precios[i - 1];
            boolean dividir = false;

            for (int j = 1; j < i; j++) {
                int costoTotal = precios[j - 1] + memo[i - j];
                if (costoTotal > maxValor) {
                    maxValor = costoTotal;
                    dividir = true;
                }
            }
            if(dividir) {
            	memo[i] = maxValor;
            }else {
            	memo[i] = precios[i - 1];
            }
        }
        return memo[tamaño];
    }
	
}
