/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 * Clase que define los objetos de tipo CCuenta.
 * @author juanm
 */
public class CCuenta {

    /**
     * Método que devuelve el valor del atributo cuenta.
     *
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que actualiza el valor del atributo cuenta.
     *
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el valor del atributo saldo.
     *
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que actualiza el valor del atributo saldo.
     *
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Crea un objeto de tipo CCuenta sin recibir parámetros.
     */
    public CCuenta() {
    }

    /**
     * Crea un objeto de tipo CCuenta recibiendo los paramátremos nom, cue, sal
     * y tipo.
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método que recibe por parámetro un nombre y se lo envía al método
     * setNombre().
     *
     * @param nom
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método que devuelve el resultado de llamar al método getNombre().
     *
     * @return
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método que devuelve el resultado de llamar al método getSaldo().
     *
     * @return
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método que recibe una cantidad por parámetro y la utiliza para actualizar
     * el saldo de una cuenta, sumando esa cantidad al saldo. Puede lanzar
     * excepción si la cantiodad que se intenta ingresar es negativa.
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que recibe una cantidad por parámetro y la utiliza para actualizar
     * el saldo de una cuenta, restando esa cantidad del saldo. Puede lanzar
     * excepción si la cantidad que se intenta ingresar es negativa o si tras
     * realizar la operación de retirada, el saldo quedase en números negativos.
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que devuelve el resultado de llamar al método getCuenta().
     *
     * @return
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * Método que devuelve el valor del atributo nombre.
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que actualiza el valor del atributo nombre.
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el valor del atributo tipoInterés.
     *
     * @return
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que actualiza el valor del atributo tipoInterés.
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
