/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 15/12/2019 - 13:43:29
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
public enum EstadoDocumentoPersonaEnum {
    /** Representa al valor Pendiente. */
    PEN("Pendiente"),
    /** Representa al valor Registrado. */
    REG("Registrado"),
    /** Representa al valor Rechazado. */
    REC("Rechazado"),
    /** Representa al valor Omitido. */
    OMI("Omitido"),
    /** Representa al valor Caducado. */
    CAD("Caducado");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private EstadoDocumentoPersonaEnum(String text) {
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
