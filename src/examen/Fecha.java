package examen;
/**
 * @author Julieta
 * 
 * @version 1.0
 * 
 * */
public class Fecha {
	//Atributo público fechaValida
	public static boolean fechaValida;
/**
 *El método validar fecha sirve para comprobar que la fecha seleccionada sea correcta o no, que coincida el número de días con el mes indicado en cada caso.
 *Si el mes es par, el día indicado será 30 o menos. Si es impar el día indicado será 31 o menos. Si es 2 (Febrero), el día será 28 o menos.
 * 
 * @param Hay 3. El año (anio), mes (mes) y día (dia). Todas estas deben ser mayor que 0, y el mes menor o igual que 12 (hay 12 meses en un año) y los días menor o igual que 31 (en cada mes varía).
 * 
 * @return Devuelve un booleano (true o false). En el caso de que la fecha sea la correcta, devolverá true, si no, devolverá false.
 * 
 * */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}

