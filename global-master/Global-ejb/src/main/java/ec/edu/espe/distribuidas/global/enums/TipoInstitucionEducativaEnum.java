/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 12/12/2019 - 11:54:08
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
public enum TipoInstitucionEducativaEnum {
    /** Representa al valor Basico. */
    BAS("Basico"),
    /** Representa al valor Bachillerato. */
    BAC("Bachillerato"),
    /** Representa al valor Todos. */
    ALL("Todos");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private TipoInstitucionEducativaEnum(String text) {
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
