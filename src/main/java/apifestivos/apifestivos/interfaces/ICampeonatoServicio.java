package apifestivos.apifestivos.interfaces;

import java.util.List;

import apifestivos.apifestivos.entidades.Campeonato;
import apifestivos.apifestivos.entidades.Grupo;

public interface ICampeonatoServicio {

    public List<Campeonato> listar();

    public Campeonato obtener(long id);

    public Campeonato guardar(Campeonato campeonato);

    public boolean eliminar(long id);

    public List<Grupo> listarGrupos(long id);

}
