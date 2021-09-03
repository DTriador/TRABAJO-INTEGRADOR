package dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class GestorPaciente {
	private static GestorPaciente p;
	private ArrayList<Paciente> misPacientes;
	
	private GestorPaciente() {
		misPacientes = new ArrayList<Paciente>();
	}
	
	public static GestorPaciente getInstancia() {
		if(p == null) p =new GestorPaciente();
		return p;
	}
	public boolean addPaciente(int idPaciente, String nombre, String apellido, int nroDocumento, Calendar fechaNacto,
			ObraSocial miObraSocial, double peso, double altura, boolean esMayorDeEdad) {
		Paciente aux = new Paciente(idPaciente,nombre, apellido, nroDocumento, fechaNacto, miObraSocial, peso, altura, esMayorDeEdad);
				if(!hayDuplicados(idPaciente)) return misPacientes.add(aux);
		return false;
	}
	private boolean hayDuplicados(int idPaciente) {
		if(misPacientes.size()>0)
			for(Paciente paciente : misPacientes)
				if(paciente.getIdPaciente()==idPaciente)
					return true;
		return false;
	}
	public boolean removeZapatos(Paciente p) {
		return misPacientes.remove(p);
	}
	
	public ArrayList<Paciente> getPaciente(Predicate<Paciente> p, Comparator<Paciente> c){
		return misPacientes
				.stream()
				.filter(p)
				.sorted(c)
				.collect(Collectors.toCollection(ArrayList<Paciente> :: new));
	}
}
