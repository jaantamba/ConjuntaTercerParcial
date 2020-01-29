/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 15/12/2019 - 12:29:45
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
public enum GeneroPersonaEnum {
    /** Representa al valor Femenino. */
    FEM("Femenino"),
    /** Representa al valor Masculino. */
    MAS("Masculino"),
    /** Representa al valor Otro. */
    OTR("Otro");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private GeneroPersonaEnum(String text) {
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
