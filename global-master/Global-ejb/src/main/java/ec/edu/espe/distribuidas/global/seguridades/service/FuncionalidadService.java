/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Global-ejb
 * 
 * Creado: 17/12/2019 - 19:08:43
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.global.seguridades.service;

import ec.edu.espe.distribuidas.global.enums.EstadoActivoInactivoEnum;
import ec.edu.espe.distribuidas.global.seguridades.dao.FuncionalidadDAO;
import ec.edu.espe.distribuidas.global.seguridades.dao.ModuloDAO;
import ec.edu.espe.distribuidas.global.seguridades.model.Funcionalidad;
import ec.edu.espe.distribuidas.global.seguridades.model.Modulo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * Clase que implementa los servicios para el manejo de la tabla
 * SEG_FUNCIONALIDAD. Los servicios de esta clase estan relacionados con
 * operaciones CRUD y busqueda.
 *
 * @author Toro Jordan
 * @author Rodriguez Fernando
 */
@Stateless
@LocalBean
public class FuncionalidadService {

    @EJB
    private FuncionalidadDAO dao;
    @EJB
    private ModuloDAO modulodao;

    /**
     * Obtiene un listado de Modulos.
     *
     * @return Listado Modulos en base al estado.
     */
    public List<Modulo> obtenerTodos() {
        return modulodao.findAll();
    }

    /**
     * Obtiene un Modulo en base a la clave primaria.
     *
     * @param codigo El código del modulo con el que se va a realizar la
     * busqueda.
     * @return Modulo en base al código.
     */
    public Modulo obtenerPorPK(String codigo) {
        return modulodao.find(codigo);
    }

    /**
     * Obtiene un listado de Modulos en base al estado.
     *
     * @param estado Estado de los modulos que se van a buscar.
     *
     * @return Listado Modulos en base al estado.
     */
    public List<Modulo> obtenerPorEstado(EstadoActivoInactivoEnum estado) {
        return modulodao.findByEstado(estado);
    }

    /**
     * Obtiene un Modulo en base a un nombre.
     *
     * @param nombre Nombre del modulo al cual se busca.
     *
     * @return Un modulo que coincida con el nombre.
     */
    public Modulo obtenerPorNombre(String nombre) {
        return modulodao.findByNombre(nombre);
    }

    /**
     * Crea un nuevo Modulo.
     *
     * @param modulo Nombre del modulo al cual se busca.
     */
    public void create(Modulo modulo) {
        if (modulo.getCodigo().isEmpty()) {
            throw new UnsupportedOperationException("El modulo no se puede crear con un código vacio.");
        }
        if (modulo.getEstado() == null || modulo.getNombre().isEmpty()) {
            if (modulo.getNombre().isEmpty()) {
                throw new UnsupportedOperationException("El nombre del modulo no puede ir vacio.");
            }
            if (modulo.getEstado() == null) {
                throw new UnsupportedOperationException("El estado del modulo no se puede ir vacio.");
            }
        }

        modulodao.create(modulo);
    }

    /**
     * Actualiza un nuevo Modulo.
     *
     * @param modulo Nombre del modulo al cual se busca.
     */
    public void update(Modulo modulo) {
        if (modulo.getCodigo().isEmpty()) {
            throw new UnsupportedOperationException("El modulo no se puede actualizar con un código vacio.");
        }
        if (modulo.getEstado() == null || modulo.getNombre().isEmpty()) {
            if (modulo.getNombre().isEmpty()) {
                throw new UnsupportedOperationException("El nombre del modulo no puede ir vacio.");
            }
            if (modulo.getEstado() == null) {
                throw new UnsupportedOperationException("El estado del modulo no se puede ir vacio.");
            }
        }

        modulodao.edit(modulo);
    }

    /**
     * Obtiene un listado de Funcionalidades.
     *
     * @return Listado Funcionalidads en base al estado.
     */
    public List<Funcionalidad> obtenerTodasFuncionalidades() {
        return dao.findAll();
    }

    /**
     * Obtiene un Funcionalidad en base a la clave primaria.
     *
     * @param codigo El código con el que se va a realizar la busqueda.
     * @return Funcionalidad en base al código.
     */
    public Funcionalidad obtenerPorPK(Integer codigo) {
        return dao.find(codigo);
    }

    /**
     * Obtiene un listado de Funcionalidades en base al código del modulo.
     *
     * @param codModulo Código del modulo que se va a buscar.
     *
     * @return Listado Funcionalidades en base al codigo del modulo.
     */
    public List<Funcionalidad> obtenerPorEstado(String codModulo) {
        return dao.findByCodModulo(codModulo);
    }

    /**
     * Obtiene un Funcionalidad en base a un nombre.
     *
     * @param nombre Nombre del modulo al cual se busca.
     *
     * @return Un modulo que coincida con el nombre.
     */
    public Funcionalidad obtenerPorNombreFuncionalidades(String nombre) {
        return dao.findByNombre(nombre);
    }

    /**
     * Crea un nuevo Funcionalidad.
     *
     * @param modulo Nombre del modulo al cual se busca.
     */
    public void create(Funcionalidad modulo) {
        if (modulo.getModulo().getCodigo().isEmpty()) {
            throw new UnsupportedOperationException("La funcionalidad debe estar asociada a un modulo.");
        }
        if (modulo.getNombre().isEmpty() || modulo.getUrlPrincipal().isEmpty()) {
            if (modulo.getNombre().isEmpty()) {
                throw new UnsupportedOperationException("El nombre de la funcionalidad no puede ir vacio.");
            }
            if (modulo.getUrlPrincipal().isEmpty()) {
                throw new UnsupportedOperationException("La URL de la funcionalidad no puede ir vacia.");
            }
        }

        dao.create(modulo);
    }

    /**
     * Actualiza un nuevo Funcionalidad.
     *
     * @param modulo Nombre del modulo al cual se busca.
     */
    public void update(Funcionalidad modulo) {
        if (modulo.getCodigo() == null) {
            throw new UnsupportedOperationException("Para actualizar la funcionalidad debe poseer un codigo por el cual buscar.");
        }

        if (modulo.getNombre().isEmpty() || modulo.getUrlPrincipal().isEmpty() || modulo.getModulo().getCodigo().isEmpty()) {
            if (modulo.getNombre().isEmpty()) {
                throw new UnsupportedOperationException("El nombre de la funcionalidad no puede ir vacio.");
            }
            if (modulo.getUrlPrincipal().isEmpty()) {
                throw new UnsupportedOperationException("La URL de la funcionalidad no puede ir vacia.");
            }
            if (modulo.getModulo().getCodigo().isEmpty()) {
                throw new UnsupportedOperationException("La funcionalidad debe estar asociada a un modulo.");
            }
        }

        dao.edit(modulo);
    }

}
