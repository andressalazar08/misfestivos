package apifestivos.apifestivos.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apifestivos.apifestivos.entidades.Campeonato;
import apifestivos.apifestivos.entidades.Grupo;
import apifestivos.apifestivos.interfaces.ICampeonatoServicio;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatoControlador {

    private ICampeonatoServicio servicio;

    public CampeonatoControlador(ICampeonatoServicio servicio) {
        this.servicio = servicio;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Campeonato> listar() {
        return this.servicio.listar();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Campeonato obtener(@PathVariable long id) {
        return this.servicio.obtener(id);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Campeonato agregar(@RequestBody Campeonato campeonato) {
        campeonato.setId(0);
        return this.servicio.guardar(campeonato);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Campeonato actualizar(@RequestBody Campeonato campeonato) {
        if (servicio.obtener(campeonato.getId()) != null) {
            return servicio.guardar(campeonato);
        } else {
            return null;
        }
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable long id) {
        return servicio.eliminar(id);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/grupos/{id}", method = RequestMethod.GET)
    public List<Grupo> listarGrupos(@PathVariable long id) {
        return servicio.listarGrupos(id);
    }

}
