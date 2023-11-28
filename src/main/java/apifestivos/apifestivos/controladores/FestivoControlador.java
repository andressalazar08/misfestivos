package apifestivos.apifestivos.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import apifestivos.apifestivos.entidades.Festivo;
import apifestivos.apifestivos.interfaces.IFestivoServicio;;

@RestController
@RequestMapping(path="/festivos/listar")
public class FestivoControlador {
    
    private final IFestivoServicio festivoServicio;
    
    @Autowired
    public FestivoControlador(IFestivoServicio festivoServicio){
        this.festivoServicio = festivoServicio;
    }


    @GetMapping
    public List<Festivo> listar(){
        return this.festivoServicio.listar();
    }
}
