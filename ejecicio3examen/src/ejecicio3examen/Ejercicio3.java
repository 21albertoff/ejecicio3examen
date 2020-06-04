package ejecicio3examen;

public class Ejercicio3 {
	
    public String diaSemana(int x) {
        String cadena = "Error!";
        switch(x) {
            case 1: cadena = "lunes";break;
            case 2: cadena = "martes";break;
            case 3: cadena = "miercoles";break;
            case 4: cadena = "jueves";break;
            case 5: cadena = "viernes";break;
            case 6: cadena = "sabado";break;
            case 7: cadena = "domingo";break;
        }
        return cadena;
    }
}
