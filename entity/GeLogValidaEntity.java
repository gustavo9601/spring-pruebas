/** LogValida VERSION 1.0.0 COPYRIGHT © 2020 REGISTRO UNICO NACIONAL DE TRANSITO */
package co.gov.runt.jpa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jgrijalba
 */
@Entity
@Table(name = "GE_LOGVALIDA", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class GeLogValidaEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "logvalida_generator")
  @SequenceGenerator(
      name = "logvalida_generator",
      sequenceName = "GE_LOGVALIDA_SEQ",
      schema = "RUNTPROD",
      allocationSize = 1)
  @Column(name = "LOGVALIDA_ID")
  private Long id;

  @Column(name = "LOGVALIDA_SOLISERVI_IDENSOLIC")
  private Long solicitud;

  @Column(name = "LOGVALIDA_TRAMITE_IDTRAMITE")
  private Long tramite;

  @Column(name = "LOGVALIDA_RESULVAL_IDCODIGO")
  private Short resulval;

  @Column(name = "LOGVALIDA_TIPOVALID_CODVALIDA")
  private String tipovalid;

  @Column(name = "LOGVALIDA_FECHORA")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fecha;

  @Column(name = "LOGVALIDA_MOTRECHAZ_CODMOTIVO")
  private Long motivoRechazo;

  @Column(name = "LOGVALIDA_DESCRIPCI")
  private String descripcion;
}
