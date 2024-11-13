package taller3.televisores;

public class Control {
	private TV tv;
	
	public TV getTv() {
		return tv;
		
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public Control() {
	}
	
	public void turnOn() {
		if(tv.getEstado() == false) {
			tv.turnOn();
		}
	}
	public void turnOff() {
		if(tv.getEstado()) {
			tv.turnOff();
		}
	}
	public void canalUp() {
		if(tv.getEstado()) {
			tv.canalUp();
		}
		
	}
	public void canalDown() {
		if(tv.getEstado()) {
			tv.canalDown();
		}
	}
	
	public void volumenUp() {
		if(tv.getEstado()) {
			tv.volumenUp();
		}
	}
	public void volumenDown() {
		if(tv.getEstado()) {
			tv.volumenDown();
		}
	}
	
	public void setCanal(int canal) {
		if(tv.getEstado() && canal > 1 && canal < 121) {
			tv.setCanal(canal);
		}
	}
	public void setVolumen(int volumen) {
		if(tv.getEstado() && volumen > 0 && volumen < 7) {
			tv.setVolumen(volumen);
		}	
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
		
		
	}
	
}