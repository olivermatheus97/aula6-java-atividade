package exercicios0604;

public class Veiculos {

	private String marca;
	private String modelo;
	private String chassi;

	public Veiculos(String marca, String modelo, String chassi) {
		this.marca = marca;
		this.modelo = modelo;
		this.chassi = chassi;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nChassi: " + chassi + "\n ";
	}

}
