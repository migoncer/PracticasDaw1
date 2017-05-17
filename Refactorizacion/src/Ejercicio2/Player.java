package Ejercicio2;

public class Player {
	
	int x, y;
	
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
	
	public void moveUp(){
		this.y += 1;
	}
	
	public void moveDown(){
		this.y += -1;
	}
	
	public void moveRight(){
		this.x += 1;
	}
	
	public void moveLeft(){
		this.x += -1;
	}

}
