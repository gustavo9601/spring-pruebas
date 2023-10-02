package co.gov.runt.jpa.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "CSWPROC", name = "SC_PA_SUBTIPOPROC")
@Data
@NoArgsConstructor
public class ScPaSubtipoprocEntity {
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "SUBTIPOPROC_ID")
  private BigDecimal subtipoprocId;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 200)
  @Column(name = "SUBTIPOPROC_NOMBRE")
  private String subtipoprocNombre;

  @Basic(optional = false)
  @NotNull
  @Column(name = "SUBTIPOPROC_FECHA")
  @Temporal(TemporalType.TIMESTAMP)
  private Date subtipoprocFecha;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 100)
  @Column(name = "SUBTIPOPROC_ESTADO")
  private String subtipoprocEstado;

  @Size(max = 100)
  @Column(name = "SUBTIPOPROC_CLASIFICACION")
  private String subtipoprocClasificacion;

  @Size(max = 200)
  @Column(name = "SUBTIPOPROC_TIPOPOSTU")
  private String subtipoprocTipopostu;

  @Size(max = 100)
  @Column(name = "SUBTIPOPROC_CODIGO")
  private String subtipoprocCodigo;

  @Size(max = 100)
  @Column(name = "SUBTIPOPROC_REQUIEREPAGO")
  private String subtipoprocRequierepago;

  @OneToMany(mappedBy = "solprociudSubtipoprocId")
  private List<SolicitudSolProciudEntity> solicitudSolProciudList;

  @JoinColumn(name = "SUBTIPOPROC_TIPOPROCESO_ID", referencedColumnName = "TIPOPROCESO_ID")
  @ManyToOne(optional = false)
  private ScPaTipoprocesoEntity subtipoprocTipoprocesoId;
}
