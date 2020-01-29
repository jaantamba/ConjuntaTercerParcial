/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 15/12/2019 - 12:22:01
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
public enum TipoIdentificacionEnum {
    /** Representa al valor de la Cédula de Identidad. */
    CED("Cédula de Identidad"),
    /** Representa al valor del Pasaporte. */
    PAS("Pasaporte"),
    /** Representa al valor Cédula de Identidad Extranjera. */
    CEX("Cédula de Identidad Extranjera");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private TipoIdentificacionEnum(String text) {
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
