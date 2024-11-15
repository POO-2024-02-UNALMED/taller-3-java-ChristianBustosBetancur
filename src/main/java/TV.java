package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	static int numTV=0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		
		numTV++;

	}
	
	public Marca getMarca(){
		return marca;	
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public int getCanal(){
		return canal;
	}
	
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <= 120 && estado ) {
			this.canal = canal;
		}
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;	
	}
	
	public void setVolumen(int volumen) {
		if (volumen >= 0 && volumen <= 7 && estado) {
			this.volumen = volumen;
		}
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int cantTV) {
		numTV = cantTV;
	}

	public void turnOn() {
		if (estado == false) {
			estado = true;
		}
	}
	public void turnOff() {
		if (estado == true) {
			estado = false;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(this.estado == true  
				&& canal < 120) {
			canal++;
		}			
	}

	public void canalDown() {
		if(this.estado == true
				&& canal> 1 ) {
			canal--;
		}
	}
	public void volumenUp() {
		if (this.estado == true 
				&& volumen <7 ) {
			volumen++;
		}
	}
	public void volumenDown() {
		if (this.estado == true
				&& volumen>0 ) {
			volumen--;
		}
	}

}