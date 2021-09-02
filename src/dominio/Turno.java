package dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;


public class Turno {
	public static void main(String[] args) {
		
		GestorPaciente gp = GestorPaciente.getInstancia();
		gp.addPaciente(100,"Luis", "Paez",24586965, new GregorianCalendar(1974, 10,2), ObraSocial.GALENO, 70.5, 1.70, true);
		gp.addPaciente(101,"Alberto", "Rodriguez", 38965789,new GregorianCalendar(1994, 10,2), ObraSocial.LUISPASTEUR,80.6, 1.94, true);
		gp.addPaciente(102,"Marcelo", "Gonzalez",10514999 ,new GregorianCalendar(1952, 10,2), ObraSocial.MEDICUS,74.3, 1.52, true);
		gp.addPaciente(106,"Carlos", "Albarez",26987131 ,new GregorianCalendar(1982, 10,2), ObraSocial.MEDIFE, 75.0, 1.80, true);
		gp.addPaciente(108,"Lucas", "Belgrano",49123569 ,new GregorianCalendar(2008, 10,2), ObraSocial.OMINT, 45.0, 1.55, false);
		gp.addPaciente(120,"Luisa", "Romero", 32654987,new GregorianCalendar(1988, 10,2), ObraSocial.OSDE, 70.0,1.68, true);
		gp.addPaciente(150,"Ana", "Muñoz", 15025687,new GregorianCalendar(1957, 10,2), ObraSocial.PREVENCIONSALUD, 64.0,1.65, true);
		gp.addPaciente(187,"Romina", "Suarez", 5175700,new GregorianCalendar(1950, 10,2), ObraSocial.SANCORSALUD, 62.0,1.63, true);
		gp.addPaciente(104,"Carla", "Ruiz", 23698741,new GregorianCalendar(1978, 10,2), ObraSocial.SWITMEDICAL, 82.0,1.85, true);
		gp.addPaciente(105,"Laura", "Redondo", 47954785,new GregorianCalendar(2007, 10,2), ObraSocial.GALENO,52.0, 1.50, false);
		
		ArrayList<Paciente> aux = gp.getPaciente(s -> s.getNombre().contains("R"), new Comparator<Paciente>() {
			public int compare(Paciente o1, Paciente o2) {
				return o1.getApellido().compareTo(o2.getApellido());
			}
		});
		
		aux.stream().forEach(System.out::println);
		
		aux = gp.getPaciente(s -> s.getMiObraSocial().equals(ObraSocial.GALENO), new Comparator<Paciente>() {
			public int compare(Paciente o1, Paciente o2) {
				return o1.getFechaNacto().compareTo(o2.getFechaNacto());
			}
		});
		aux.stream().forEach(System.out::println);
		
		aux = gp.getPaciente(s -> s.getApellido().contains("A"), new Comparator<Paciente>() {
			public int compare(Paciente o1, Paciente o2) {
				return (int) (o1.getAltura()- o2.getAltura());
			}
		});
		aux.stream().forEach(System.out::println);
	}
}
