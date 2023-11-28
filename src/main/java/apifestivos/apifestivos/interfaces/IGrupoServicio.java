package apifestivos.apifestivos.interfaces;

import java.util.List;

import apifestivos.apifestivos.entidades.TablaPosicion;


public interface IGrupoServicio {

    public List<TablaPosicion> obtenerPosiciones(int id);
}
