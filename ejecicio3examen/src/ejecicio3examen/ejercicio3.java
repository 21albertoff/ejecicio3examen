package ejecicio3examen;

public class ejercicio3 {

	public static String diaSemana(int aux) {

		switch (aux) {
		case 1:
			return "lunes";
		case 2:
			return "martes";
		case 3:
			return "miércoles";
		case 4:
			return "jueves";
		case 5:
			return "viernes";
		case 6:
			return "sábado";
		case 7:
			return "domingo";
		default:
			return "ERROR!";

		}
	}
}
