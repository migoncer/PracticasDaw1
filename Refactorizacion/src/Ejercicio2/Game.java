package Ejercicio2;

public class Game {

	Player p;
	
	public void movement(String m){
		if (m.equalsIgnoreCase("Derecha")){
			p.moveRight();
		}
		if (m.equalsIgnoreCase("Izquierda")){
			p.moveLeft();
		}
		if (m.equalsIgnoreCase("Arriba")){
			p.moveUp();
		}
		if (m.equalsIgnoreCase("Abajo")){
			p.moveDown();
		}
		
	}

}
