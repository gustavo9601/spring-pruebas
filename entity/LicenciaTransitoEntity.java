/**
 * LicenciaTransitoEntidad VERSION 1.0.0 20/05/2019 COPYRIGHT © 2019 REGISTRO UNICO NACIONAL DE
 * TRANSITO
 */
package co.gov.runt.jpa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lgomez
 */
@Entity
@Table(name = "EV_LICETRANS", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class LicenciaTransitoEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "LICETRANS_NUMLICTRA")
  private String id;

  @JoinColumn(name = "LICETRANS_AUTOMOTOR_NROREGVEH", referencedColumnName = "AUTOMOTOR_NROREGVEH")
  @ManyToOne
  private AutomotorEntity automotor;

  @Column(name = "LICETRANS_ESTLICTRA_NOMBRE")
  private String estado;

  @Column(name = "LICETRANS_FECHEXPED")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaExpedicion;
}
