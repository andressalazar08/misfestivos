package apifestivos.apifestivos.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apifestivos.apifestivos.entidades.TablaPosicion;
import apifestivos.apifestivos.interfaces.IGrupoServicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class GrupoServicio implements IGrupoServicio {

    @PersistenceContext
    public EntityManager em;

    @Override
    public List<TablaPosicion> obtenerPosiciones(int idGrupo) {
        List<TablaPosicion> tablaPosiciones = em
                .createNativeQuery("SELECT * FROM fTablaPosicionesGrupo(:idgrupotabla)", TablaPosicion.class)
                .setParameter("idgrupotabla", idGrupo)
                .getResultList();

        return tablaPosiciones;
    }

}
