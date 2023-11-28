package apifestivos.apifestivos.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apifestivos.apifestivos.entidades.TablaPosicion;
import apifestivos.apifestivos.interfaces.IGrupoServicio;

@RestController
@RequestMapping("/grupos")
public class GrupoControlador {
    
    private IGrupoServicio servicio;

    public GrupoControlador(IGrupoServicio servicio) {
        this.servicio = servicio;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/posiciones/{id}", method = RequestMethod.GET)
    public List<TablaPosicion> obtenerPosiciones(@PathVariable int id) {
        return servicio.obtenerPosiciones(id);
    }
}