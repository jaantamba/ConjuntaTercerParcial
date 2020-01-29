/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 15/12/2019 - 14:52:10
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
public enum TipoDireccionEnum {
    /** Representa al valor de Domicilio. */
    DOM("Domicilio"),
    /** Representa al valor del Trabajo. */
    TRA("Trabajo"),
    /** Representa al valor de Domicilio Temporal. */
    DTE("Domicilio Temporal");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private TipoDireccionEnum(String text) {
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
