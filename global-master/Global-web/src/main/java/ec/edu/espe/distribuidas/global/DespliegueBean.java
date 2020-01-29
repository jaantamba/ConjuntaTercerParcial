/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.global;

import ec.edu.espe.distribuidas.global.seguridades.model.Modulo;
import ec.edu.espe.distribuidas.global.seguridades.service.FuncionalidadService;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 *
 * @author jaant
 */
public class DespliegueBean {
    
    @Inject
    private FuncionalidadService service;

    private static final Logger LOG = Logger.getLogger(DespliegueBean.class.getName());
    private List<Modulo> modulos;
    private Modulo modulo;
    private Modulo moduloModificar;
    private boolean enNuevo;
    private boolean enModificar;
    private boolean enEliminar;
    private boolean esSelecconado;
    private Integer tipoAccion = 0;

    @PostConstruct
    public void initIt() {
        modulo = new Modulo();
        moduloModificar = new Modulo();
        modulos = this.service.obtenerTodos();
        esSelecconado = false;
        enNuevo = false;
        
    }
    
    public void getAllModulos() {
        try {
            modulos = this.service.obtenerTodos();
        } catch (RuntimeException e) {
            LOG.info("Error en el búsqueda");
        }
    }

    public FuncionalidadService getService() {
        return service;
    }

    public void setService(FuncionalidadService service) {
        this.service = service;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Modulo getModuloModificar() {
        return moduloModificar;
    }

    public void setModuloModificar(Modulo moduloModificar) {
        this.moduloModificar = moduloModificar;
    }

    public boolean isEnNuevo() {
        return enNuevo;
    }

    public void setEnNuevo(boolean enNuevo) {
        this.enNuevo = enNuevo;
    }

    public boolean isEnModificar() {
        return enModificar;
    }

    public void setEnModificar(boolean enModificar) {
        this.enModificar = enModificar;
    }

    public boolean isEnEliminar() {
        return enEliminar;
    }

    public void setEnEliminar(boolean enEliminar) {
        this.enEliminar = enEliminar;
    }

    public boolean isEsSelecconado() {
        return esSelecconado;
    }

    public void setEsSelecconado(boolean esSelecconado) {
        this.esSelecconado = esSelecconado;
    }

    public Integer getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(Integer tipoAccion) {
        this.tipoAccion = tipoAccion;
    }
    
    
}
