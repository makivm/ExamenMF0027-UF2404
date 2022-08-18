package modelo;

import java.util.Calendar;
import java.util.Objects;

public abstract class Poliza {
	//Definicion de atributos de clase Poliza
	protected String idPoliza;
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected int anyo;
	protected String formaPago;
	protected double primaBase;
	protected int numSiniestrosHistoricos;
	
	//Constructor sin parametros con inicializacion
	public Poliza() {
		this.idPoliza = "";
		this.nombre = "";
		this.apellidos = "";
		this.dni = "";
		this.anyo = Calendar.getInstance().get(Calendar.YEAR);
		this.formaPago = "Anual";
		this.primaBase = 0;
		this.numSiniestrosHistoricos = 0;
	}

	//Constructor con todos los parametros
	public Poliza(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
			double primaBase, int numSiniestrosHistoricos) {
		this.idPoliza = idPoliza;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.anyo = anyo;
		this.formaPago = formaPago;
		this.primaBase = primaBase;
		this.numSiniestrosHistoricos = numSiniestrosHistoricos;
	}

	//Metodos getters y setters de todos los campos de la clase
	public String getIdPoliza() {
		return idPoliza;
	}

	public void setIdPoliza(String idPoliza) {
		this.idPoliza = idPoliza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public double getPrimaBase() {
		return primaBase;
	}

	public void setPrimaBase(double primaBase) {
		this.primaBase = primaBase;
	}

	public int getNumSiniestrosHistoricos() {
		return numSiniestrosHistoricos;
	}

	public void setNumSiniestrosHistoricos(int numSiniestrosHistoricos) {
		this.numSiniestrosHistoricos = numSiniestrosHistoricos;
	}
	
	//Metodo abstracto que se implementara en la subclase
	public abstract double calcularPrima();

	
	//Metodo toString()
	@Override
	public String toString() {
		return "Poliza [idPoliza=" + idPoliza + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", anyo=" + anyo + ", formaPago=" + formaPago + ", primaBase=" + primaBase
				+ ", numSiniestrosHistoricos=" + numSiniestrosHistoricos + "]";
	}

	//Metodos hashCode() y equals() con campo idPoliza
	@Override
	public int hashCode() {
		return Objects.hash(idPoliza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poliza other = (Poliza) obj;
		return Objects.equals(idPoliza, other.idPoliza);
	}
		
}
