package ingenieriasoftware;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;

public class ProgPrincipal {

	public static void main(String[] args) {

		// Alumno1
		Entregable e11 = new Entregable("Entregable1");
		e11.setRespuestaUrl("Respuesta 1");
		e11.setNota(5.4);

		Entregable e12 = new Entregable("Entregable2");
		e12.setRespuestaUrl("Respuesta 2");
		e12.setNota(6.8);

		Entregable e13 = new Entregable("Entregable3");
		e13.setRespuestaUrl("Respuesta 3");
		e13.setNota(4.6);

		Alumno a1 = new Alumno("Markel", "Alberdi", "markel@ehu.eus", "Euskal Herria");
		a1.setNotaExamen(2.5);
		a1.addEntregable(e11);
		a1.addEntregable(e12);
		a1.addEntregable(e13);

		// Alumno2
		Entregable e21 = new Entregable("Entregable1");
		e21.setRespuestaUrl("Respuesta 1");
		e21.setNota(6.0);

		Entregable e22 = new Entregable("Entregable2");
		e22.setRespuestaUrl("Respuesta 2");
		e22.setNota(9.3);

		Entregable e23 = new Entregable("Entregable3");
		e23.setRespuestaUrl("Respuesta 3");
		e23.setNota(5.6);

		Alumno a2 = new Alumno("Maria", "Vaquero", "maria@ehu.eus", "Euskal Herria");
		a2.setNotaExamen(5.5);
		a2.addEntregable(e21);
		a2.addEntregable(e22);
		a2.addEntregable(e23);

		// Alumno3
		Entregable e31 = new Entregable("Entregable1");
		e31.setRespuestaUrl("Respuesta 1");
		e31.setNota(4.0);

		Entregable e32 = new Entregable("Entregable2");
		e32.setRespuestaUrl("Respuesta 2");
		e32.setNota(5.3);

		Entregable e33 = new Entregable("Entregable3");
		e33.setRespuestaUrl("Respuesta 3");
		e33.setNota(5.6);

		Alumno a3 = new Alumno("Garazi", "Bikandi", "garazi@ehu.eus", "Euskal Herria");
		a3.setNotaExamen(3.5);
		a3.addEntregable(e31);
		a3.addEntregable(e32);
		a3.addEntregable(e33);

		// Alumno4
		Entregable e41 = new Entregable("Entregable1");
		e41.setRespuestaUrl("Respuesta 1");
		e41.setNota(7.0);

		Entregable e42 = new Entregable("Entregable2");
		e42.setRespuestaUrl("Respuesta 2");
		e42.setNota(5.3);

		Entregable e43 = new Entregable("Entregable3");
		e43.setRespuestaUrl("Respuesta 3");
		e43.setNota(5.6);

		Alumno a4 = new Alumno("Pedro", "Aragon", "pedro@ehu.eus", "Francia");
		a4.setNotaExamen(7.5);
		a4.addEntregable(e41);
		a4.addEntregable(e42);
		a4.addEntregable(e43);

		// Alumno5
		Entregable e51 = new Entregable("Entregable1");
		e51.setRespuestaUrl("Respuesta 1");
		e51.setNota(7.0);

		Entregable e52 = new Entregable("Entregable2");
		e52.setRespuestaUrl("Respuesta 2");
		e52.setNota(8.3);

		Entregable e53 = new Entregable("Entregable3");
		e53.setRespuestaUrl("Respuesta 3");
		e53.setNota(2.6);

		Alumno a5 = new Alumno("Angel", "Alonso", "angel@ehu.eus", "Portugal");
		a5.setNotaExamen(6.8);
		a5.addEntregable(e51);
		a5.addEntregable(e52);
		a5.addEntregable(e53);

		// Alumno6
		Entregable e61 = new Entregable("Entregable1");
		e61.setRespuestaUrl("Respuesta 1");
		e61.setNota(7.0);

		Entregable e62 = new Entregable("Entregable2");
		e62.setRespuestaUrl("Respuesta 2");
		e62.setNota(5.3);

		Entregable e63 = new Entregable("Entregable3");
		e63.setRespuestaUrl("Respuesta 3");
		e63.setNota(2.6);

		Alumno a6 = new Alumno("Irati", "Alberdi", "irati@ehu.eus", "Portugal");
		a6.setNotaExamen(3.7);
		a6.addEntregable(e61);
		a6.addEntregable(e62);
		a6.addEntregable(e63);

		IngenieriaSoftware ing = IngenieriaSoftware.getIngenieriaSoftware();
		ing.addAlumno(a1);
		ing.addAlumno(a2);
		ing.addAlumno(a3);
		ing.addAlumno(a4);
		ing.addAlumno(a5);
		ing.addAlumno(a6);

		// mostrar notas calificaciones de los alumnos
		System.out.println("\nCalificaciones finales de la asignatura");
		System.out.println("=======================================");
		ing.mostrarNotasAlumnos();

		// Mostrar la lista de los alumnos suspendidos
		System.out.println("\nAlumnos suspendidos de la asignatura");
		System.out.println("================================================");
		List<Alumno> lSuspendidos = ing.getAlumnosSuspendidos();
		lSuspendidos.stream().forEach(System.out::println);

		// Mostrar la lista de los alumnos que han aprobado ordenados por su nombre
		System.out.println("\nAlumnos de la asignatura que han aprobado, ordenados por nombre");
		System.out.println("===========================================================================");
		List<Alumno> lAprobados = ing.getListaAlumnosAprobadosOrdenadaPorNombre();
		lAprobados.stream().forEach(System.out::println);

		// Mostrar la lista de los alumnos que han aprobado ordenados por su nombre y
		// apellidos
		System.out.println("\nAlumnos de la asignatura que han aprobado, ordenados por nombre");
		System.out.println("===========================================================================");
		List<Alumno> lAprobados2 = ing.getListaAlumnosAprobadosOrdenadaPorNombreYApellidos();
		lAprobados2.stream().forEach(System.out::println);

		// Mostar el porcentaje de aprobados de la asignatura
		double porc = ing.getPorcentajeAprobados();
		System.out.printf("\nPorcentaje de aprobados: %.2f\n", porc);

		// Mostrar la lista de los paises representados en clase
		System.out.println("\nPaises representados");
		System.out.println("=======================");
		ing.getPaisesRepresentados().stream().forEach(System.out::println);

		// Mostrar la lista de alumnos que han aprobado todos los entregables
		System.out.println("\nAlumnos que han aprobado todos los entregables");
		System.out.println("===================================================");
		ing.getAlumnosQueHanAprobadoTodosEntregables().stream().forEach(System.out::println);

		// Mostrar la lista de alumnos que hayan obtenido en algún entregable una nota
		// superior a 7.5
		System.out.println("\nAlumnos que han obtenido más de 7.5 en algún entregable");
		System.out.println("============================================================");
		ing.getAlumnosQueSuperanNotaEnEntregable(7.5).stream().forEach(System.out::println);

		// Mostrar estadísticas de la asignatura: la nota maxima, minima y
		// media.
		System.out.println("Estadisticas de la asignatura");
		System.out.println("==============================");
		DoubleSummaryStatistics estadisticas = ing.getEstadisticas();
		System.out.printf("Nota mínima: %.2f\nNota media: %.2f\nNota máxima: %.2f\n", estadisticas.getMin(),
				estadisticas.getAverage(), estadisticas.getMax());


	}

}
