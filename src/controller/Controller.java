package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}
	//mostrarme info de primer y ultimo video
	//tiempo
	//Por arrelo
	//por lista
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			long startT, endT;

			switch(option){
				case 1:
					view.printMessage("--------- \nSe cargaron los datos como lista encadenada ");
					startT=System.currentTimeMillis();
					modelo.agregarLista(1);
					endT=System.currentTimeMillis();
					view.printMessage(" \nPara cargar tomo el tiempo: " + (endT-startT)+ " en milisegundos");

					break;

				case 2:
					view.printMessage("--------- \nSe cargaron los datos como arreglo dinamico ");
					startT=System.currentTimeMillis();
					modelo.agregarLista(2);
					endT=System.currentTimeMillis();
					view.printMessage(" \nPara cargar tomo el tiempo: " + (endT-startT) + " en milisegundos");					
					break;

				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}	
}
