package modelo;

public class SeguroCoche extends Poliza {
	protected String matricula;
	protected int anyoCarnet;
	
	//Constructor vacio
	public SeguroCoche() {
		super();
		this.matricula="";
		this.anyoCarnet=0;
	}

	//Constructor con todos los campos heredados de la superclase y los propios de la subclase SeguroCoche
	public SeguroCoche(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
			double primaBase, int numSiniestrosHistoricos, String matricula, int anyoCarnet) {
		super(idPoliza, nombre, apellidos, dni, anyo, formaPago, primaBase, numSiniestrosHistoricos);
		this.matricula = matricula;
		this.anyoCarnet = anyoCarnet;
	}

	//Metodos getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnyoCarnet() {
		return anyoCarnet;
	}

	public void setAnyoCarnet(int anyoCarnet) {
		this.anyoCarnet = anyoCarnet;
	}

	//Redefinicion de metodo toString() para la subclase
	@Override
	public String toString() {
		return "SeguroCoche [matricula=" + matricula + ", anyoCarnet=" + anyoCarnet + ", idPoliza=" + idPoliza
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", anyo=" + anyo + ", formaPago="
				+ formaPago + ", primaBase=" + primaBase + ", numSiniestrosHistoricos=" + numSiniestrosHistoricos + "]";
	}

	//Metodo a implementar en la subclase para calcular la prima
	@Override
	public double calcularPrima() {
		int antiguedad=super.anyo;
		double prima=super.primaBase;
		
		if (super.anyo>10) {
			antiguedad=10;
		}
		prima=(prima-((prima*0.015)*antiguedad))+(prima*(super.numSiniestrosHistoricos*0.03));
		
		if(antiguedad<5) {
			prima=prima+75;
		}
		
		return prima;
	}

}
