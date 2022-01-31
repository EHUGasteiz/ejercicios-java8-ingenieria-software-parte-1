package ingenieriasoftware;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class IngenieriaSoftware {

	private static IngenieriaSoftware mIngenieriaSoftware = new IngenieriaSoftware();
	private List<Alumno> lMatriculados;

	private IngenieriaSoftware() {
		lMatriculados = new ArrayList<>();
	}

	public static IngenieriaSoftware getIngenieriaSoftware() {
		return mIngenieriaSoftware;
	}

	public void addAlumno(Alumno pAl) {
		lMatriculados.add(pAl);
	}

	/**
	 * mostrarNotasTAlumnos Muestra en la salida estándar el nombre, apellidos y la
	 * nota final de cada uno de los estudiantes
	 */
	public void mostrarNotasAlumnos() {
		// TODO: Ejercicio 5
	}

	/**
	 * getAlumnosSuspendidos
	 * 
	 * @return devuelve la lista de alumnos que no han aprobado la asignatura
	 */
	public List<Alumno> getAlumnosSuspendidos() {
		// TODO: Ejercicio 6
		return null;
	}

	/**
	 * getListaAlumnosAprobadosOrdenadaPorNombre
	 * 
	 * @return la lista de alumnos aprobados, ordenada por nombre
	 */
	public List<Alumno> getListaAlumnosAprobadosOrdenadaPorNombre() {
		// TODO: Ejercicio 7
		return null;
	}

	/**
	 * getListaAlumnosAprobadosOrdenadaPorNombreYApellidos
	 * 
	 * @return la lista de alumnos aprobados, ordenada por nombre y Apellidos
	 */
	public List<Alumno> getListaAlumnosAprobadosOrdenadaPorNombreYApellidos() {
		// TODO: Ejercicio 8
		return null;
	}

	/**
	 * getPorcentajeAprobados
	 * 
	 * @return devuelve el porcentaje de aprobados de la asignatura
	 */
	public double getPorcentajeAprobados() {
		// TODO: Ejercicio 9
		return 0.0;
	}

	/**
	 * getPaisesRepresentados
	 * 
	 * @return devuelve la lista de paises representados por el alumnado de la
	 *         asignatura (sin valores repetidos)
	 */
	public List<String> getPaisesRepresentados() {
		// TODO: Ejercicio 10
		return null;
	}

	/**
	 * getAlumnosQueHanAprobadoTodosEntregables
	 * 
	 * @return la lista de alumnos que han aprobado todos los entregables
	 */
	public List<Alumno> getAlumnosQueHanAprobadoTodosEntregables() {
		// TODO: Ejercicio 11
		return null;
	}

	/**
	 * getAlumnosQueSuperanNotaEnEntregable
	 * 
	 * @param pNota la nota
	 * @return la lista de alumnos que han obtenido una nota superior a pNota en
	 *         algún entregable
	 */
	public List<Alumno> getAlumnosQueSuperanNotaEnEntregable(double pNota) {
		// TODO: Ejercicio 12
		return null;
	}

	/**
	 * getEstadisticas
	 * 
	 * @return devuelve las estadísticas de la asignatura (número de alumnos, suma
	 *         de las notas, nota mínima, nota máxima y nota media)
	 */
	public DoubleSummaryStatistics getEstadisticas() {
		// TODO: Ejercicio 13
		return null;
	}


}
