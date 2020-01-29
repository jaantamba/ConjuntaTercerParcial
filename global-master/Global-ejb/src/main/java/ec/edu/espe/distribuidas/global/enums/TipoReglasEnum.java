/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 12/12/2019 - 8:12:30
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.global.enums;
/**
 * Implementación de enumeraciones de Tipo de Reglas
 *
 * @author Paspuel  
 * @author Torres
 */
public enum TipoReglasEnum {
    /** Representa al valor Númerico. */
    NUM("Numérico"),
    /** Representa al valor Texto. */
    TEX("Texto");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private TipoReglasEnum(String text) {
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
