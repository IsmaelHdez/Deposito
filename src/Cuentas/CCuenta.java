package Cuentas;
/**
 * En esta clase se encuentran los metodos para dodificar el saldo de la cuenta
 * @author Ismael Hernandez
 * @since JDK 1.8
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * crea obejeto cuenta
     */
    public CCuenta()
    {
    }

    /**
     * Crea una cuenta con los parametros nombre, cuenta, saldo, tipo
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo de cuenta
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo que realiza el ingreso
     * @param cantidad cantidad que se va a ingresar
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * metodo que realiza la retirada
     * @param cantidad cantidad que se va a retirar
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el valor nombre
     * @return Devuelve el valor nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el valor de nombre
     * @param nombre nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el valor Cuenta
     * @return Devuelve el valor Cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el valor cuenta
     * @param cuenta cuenta del cliente
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el valor Saldo
     * @return Devuelve el valor Saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el valor saldo
     * @param saldo saldo del cliente
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el valor tipoInteres
     * @return Devuelve el valor tipoInteres 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el valor tipoInteres
     * @param tipoInterés tipo de interes de la cuenta del cliente
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
