package co.edu.unbosque.model;

public class Solucion {
	public Solucion() {
		// TODO Auto-generated constructor stub
	}
	
	public int resolver(int tamaño, int[] precios) {
		if(tamaño == 0) {
			return 0;
		}
		
		int maxValor = precios[tamaño - 1];
		System.out.println("MaxValor: " + maxValor);
		boolean dividir = false;
		
		for(int i = 1; i < tamaño; i++) {
			int costoTotal = precios[i-1] + resolver(tamaño - i, precios);
			System.out.println(costoTotal);
			if(costoTotal > maxValor) {
				maxValor = costoTotal;
				dividir = true;
			}
		}
		
		if(dividir) {
			return maxValor;
		}else {
			return precios[tamaño - 1]; //La solucion óptima es no cortar la varilla
		}
	}
}
