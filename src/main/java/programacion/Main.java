package programacion;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		new Main();
			}
	/* Crear una lista de enteros
	 * Dejar en la lista los numero pares
	 * Elevar cada elemento de la lista al cuadrado
	 * Mostrar cada cuadrado por pantalla
	 * obtener la sumade los cuadrados. 
	 * 
	 * */
	public Main(){
		List<Integer> numeros= crearLista();
		System.out.println(numeros);
		List<Integer> pares= filtrarPares(numeros);
		System.out.println(pares);
		List<Integer> cuadrados= elevarAlCuadrado(pares);
		System.out.println(cuadrados);
		mostrarList(cuadrados);
		int total=sumarLista(cuadrados) ;
		System.out.println("\nSuma de cuadrados: "+total);
	}
	
	private List<Integer> crearLista(){
		List<Integer> nuevaLista=new ArrayList<Integer>();
		nuevaLista.add(1);
		nuevaLista.add(2);
		nuevaLista.add(3);
		nuevaLista.add(4);
		nuevaLista.add(5);
		//return List.of(1,2,3,4,5,6,7,8,9,10);
		return nuevaLista;
	}
	
	private List<Integer> filtrarPares(List<Integer> numeros){
		List<Integer> nuevaLista=new ArrayList<Integer>();
		for (Integer numero: numeros) {
			if (numero%2==0) {
				nuevaLista.add(numero);
			}
		}
		return nuevaLista;
	}
	
	private List<Integer> elevarAlCuadrado(List<Integer> numeros){
		List<Integer> resultado=new ArrayList<Integer>();
		for (Integer numero: numeros) {
			resultado.add(numero*numero);
		}
		return resultado;
	}
	
	private void mostrarList(List<Integer> numeros){
		for (Integer numero: numeros) {
			System.out.print(" "+ numero);
		}
	}
	
	private int sumarLista(List<Integer> numeros){
		int suma=0;
		for (Integer numero: numeros) {
			suma+=numero;
		}
		return suma;
	}

}
