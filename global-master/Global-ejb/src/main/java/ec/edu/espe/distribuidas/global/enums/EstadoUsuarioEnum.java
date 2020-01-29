/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 15/12/2019 - 12:41:21
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.global.enums;

/**
 *
 *
 *
 * @author Toro Jordan
 */
public enum EstadoUsuarioEnum {
    /**
     * Representa al valor Activo.
     * 
     * Estado válido para que un usuario pueda iniciar sessión.
     */
    ACT("Activo"),
    /**
     * Representa al valor Inactivo.
     * 
     * Estado similar a eliminado; es un estado final.
     */
    INA("Inactivo"),
    /**
     * Representa al valor Suspendido.
     *
     * Valor que se asigna cuando se suspende temporalmente al usuario para que
     * no ingrese al sistema.
     */
    SUS("Suspendido"),
    /**
     * Representa al valor Bloqueado.
     *
     * Valor que se asigna cuando el número de intentos fallidos ha superado el
     * límite establecido
     */
    BLO("Bloqueado"),
    /**
     * Representa al valor Creado.
     *
     * Valor por defecto con el que se crea un usuario.
     */
    CRE("Creado");

    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private EstadoUsuarioEnum(String text) {
        this.text = text;
    }

    /**
     * Retorna el texto asociadado al elemento de la enumeraci\u00F3n.
     *
     * @return Texto asociado al elemento de la enumeraci\u00F3n.
     */
    public String getText() {
        return this.text;
    }
}
