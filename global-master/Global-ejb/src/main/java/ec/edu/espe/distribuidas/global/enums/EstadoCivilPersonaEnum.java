/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 15/12/2019 - 12:35:30
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
public enum EstadoCivilPersonaEnum {
    /** Representa al valor Soltero o Soltera. */
    SOL("Soltero/a"),
    /** Representa al valor Casado o Casada. */
    CAS("Casado/a"),
    /** Representa al valor Unión Libre. */
    ULI("Union libre"),
    /** Representa al valor Divorciado o Divorciada. */
    DIV("Divorciado/a"),
    /** Representa al valor Viuda o Viudo. */
    VIU("Viudo/a");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private EstadoCivilPersonaEnum(String text) {
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
