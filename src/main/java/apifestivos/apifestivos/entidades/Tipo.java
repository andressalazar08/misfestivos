package apifestivos.apifestivos.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="tipofestivos")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "tipo_festivo")
    private long id;

    @Column(name = "tipo", length = 100)
    private String tipo;
}
