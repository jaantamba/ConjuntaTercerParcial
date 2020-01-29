/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 12/12/2019 - 11:09:37
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
public enum SiNoEnum {
/** Representa al valor Si. */
    S("Si"),
    /** Representa al valor No. */
    N("No");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private SiNoEnum(String text) {
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
