/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 15/12/2019 - 14:10:22
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
public enum TipoFamiliarEnum {
    /** Representa al valor Padre. */
    PAD("Padre"),
    /** Representa al valor Madre. */
    MAD("Madre"),
    /** Representa al valor Hijo o Hija. */
    HIJ("Hijo/a"),
    /** Representa al valor Conyugue. */
    CON("Conyugue"),
    /** Representa al valor Representante. */
    REP("Representante");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private TipoFamiliarEnum(String text) {
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
