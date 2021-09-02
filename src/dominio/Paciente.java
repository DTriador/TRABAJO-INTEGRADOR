package dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Paciente {
	
	private int idPaciente;
	private String nombre;
	private String apellido;
	private int nroDocumento;
	private Calendar fechaNacto;
	private ObraSocial miObraSocial;
	private double peso;
	private double altura;
	private boolean esMayorDeEdad;
	
	
	
	public Paciente(int idPaciente, String nombre, String apellido, int nroDocumento, Calendar fechaNacto,
			ObraSocial miObraSocial, double peso, double altura, boolean esMayorDeEdad) {
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
		this.fechaNacto = fechaNacto;
		this.miObraSocial = miObraSocial;
		this.peso = peso;
		this.altura = altura;
		this.esMayorDeEdad = esMayorDeEdad;
	}


	public Paciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}


	public Paciente(int idPaciente, int nroDocumento) {
		this.idPaciente = idPaciente;
		this.nroDocumento = nroDocumento;
	}


	public Paciente(int idPaciente, String nombre, String apellido) {
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public int getIdPaciente() {
		return idPaciente;
	}


	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getNroDocumento() {
		return nroDocumento;
	}


	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}


	public Calendar getFechaNacto() {
		return fechaNacto;
	}


	public void setFechaNacto(Calendar fechaNacto) {
		this.fechaNacto = fechaNacto;
	}


	public ObraSocial getMiObraSocial() {
		return miObraSocial;
	}


	public void setMiObraSocial(ObraSocial miObraSocial) {
		this.miObraSocial = miObraSocial;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public boolean isEsMayorDeEdad() {
		return esMayorDeEdad;
	}

	public int getEdad() {
		Calendar hoy = GregorianCalendar.getInstance();
		return hoy.get(Calendar.YEAR)- fechaNacto.get(Calendar.YEAR);
	}
	public void setEsMayorDeEdad(boolean esMayorDeEdad) {
		this.esMayorDeEdad = esMayorDeEdad;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + idPaciente;
		result = prime * result + nroDocumento;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (idPaciente != other.idPaciente)
			return false;
		if (nroDocumento != other.nroDocumento)
			return false;
		return true;
	}
 
 
	@Override
	public String toString() {
		return "Paciente" + idPaciente + ", Nombre y apellido:" + nombre + apellido
				+ ", Documento NRO:" + nroDocumento + ", fecha de Nacimientoto:" 
				+ fechaNacto + ", Obra Social:" + miObraSocial
				+ ", Peso:" + peso + ", Altura:" + altura + ", Mayor De Edad=" + esMayorDeEdad;
	}
	
	
	
}
