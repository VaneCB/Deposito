package cuentas;
/**
 * Clase CCuenta con los atributos
 * @author Vanesa
 *
 */
public class CCuenta {
	//Atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**
 * Método constructor
 */
    public CCuenta()
    {
    }
/**
 * Método constructor con los parametros de nombre, cuenta, saldo y tipo
 * @param nom String El nombre del usuario
 * @param cue String La cuenta del usuario
 * @param sal double El saldo del usuario
 * @param tipo double El tipo de interés
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        saldo=sal;
    }
/**
 * Método que devuelve el saldo de la cuenta
 * @return Retorna el saldo actual del usuario
 */
    public double estado()
    {
        return saldo;
    }
/**
 * Método ingresar con excepciones para evitar cantidad negativa
 * @param cantidad  double Cantidad de dinero a ingresar
 * @throws Exception No se puede ingresar una cantidad de dinero negativo
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Método para retirar con excepciones para cantidad negativa o sin salgo
 * @param cantidad double Cantidad de dinero a retirar de la cuenta
 * @throws Exception No se puede retirar una cantidad mayor al saldo ni un cantidad negativa de dinero
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
/**
 * Método get del atributo nombre
 * @return String Retorna el nombre del cliente
 */
	private String getNombre() {
		return nombre;
	}
/**
 * Método set del atributo nombre
 * @param nombre String Nombre del cliente
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Método get del atributo cuenta
 * @return String Retorna la cuenta del cliente
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Método set del atributo cuenta
 * @param cuenta String Cuenta del cliente
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
}
