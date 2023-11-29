package apifestivos.apifestivos.controladores;
import java.text.SimpleDateFormat; 
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;



import apifestivos.apifestivos.entidades.Festivo;
import apifestivos.apifestivos.interfaces.IFestivoServicio;;

@RestController
@RequestMapping(path="/festivos")
public class FestivoControlador {
    
    private final IFestivoServicio festivoServicio;
    
    @Autowired
    public FestivoControlador(IFestivoServicio festivoServicio){
        this.festivoServicio = festivoServicio;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Festivo> listar(){
        return this.festivoServicio.listar();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/verificar/{anio}/{mes}/{dia}", method = RequestMethod.GET)
    public boolean esFestivo(@PathVariable int anio,@PathVariable int mes, @PathVariable int dia) {
        String sDate1=anio+"/"+mes+"/"+dia;  
        Date fechacapturada=new SimpleDateFormat("yyyy/MM/dd").parse(sDate1);  
        
        return this.festivoServicio.esFestivo(fechacapturada);
    }


}
