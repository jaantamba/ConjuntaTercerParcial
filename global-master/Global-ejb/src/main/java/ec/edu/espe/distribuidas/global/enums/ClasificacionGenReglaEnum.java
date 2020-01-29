/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 12/12/2019 - 8:15:45
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */


package ec.edu.espe.distribuidas.global.enums;
/**
 * Implementación de las enumeraciones de Clasificacion de Reglas
 *
 * @author Paspuel  
 * @author Torres
 */
public enum ClasificacionGenReglaEnum {
/** Representa al valor Usuario. */
    USU("Usuario"),
/** Representa al valor Clave. */
    CLA("Clave"),
/** Representa al valor Sesión. */
    SES("Sesión"),
/** Representa al valor Persona. */
    PER("Persona"),
    /** Representa al valor Otro. */
    OTR("Otro");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private ClasificacionGenReglaEnum(String text) {
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
