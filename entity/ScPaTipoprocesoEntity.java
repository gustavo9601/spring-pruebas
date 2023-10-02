package co.gov.runt.jpa.entity;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "CSWPROC", name = "SC_PA_TIPOPROCESO")
@Data
@NoArgsConstructor
public class ScPaTipoprocesoEntity {
  private static final long serialVersionUID = 1L;

  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "TIPOPROCESO_ID")
  private Short tipoprocesoId;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 50)
  @Column(name = "TIPOPROCESO_NOMBRE")
  private String tipoprocesoNombre;

  @Basic(optional = false)
  @NotNull
  @Column(name = "TIPOPROCESO_RQPAGO")
  private BigInteger tipoprocesoRqpago;

  @Basic(optional = false)
  @NotNull
  @Column(name = "TIPOPROCESO_PERSONINSC")
  private BigInteger tipoprocesoPersoninsc;

  @Column(name = "TIPOPROCESO_TIPCONLIQ")
  private Long tipoprocesoTipconliq;

  @Basic(optional = false)
  @NotNull
  @Column(name = "TIPOPROCESO_ESTADO")
  private BigInteger tipoprocesoEstado;

  @Basic(optional = false)
  @NotNull
  @Column(name = "TIPOPROCESO_FECHAREG")
  @Temporal(TemporalType.TIMESTAMP)
  private Date tipoprocesoFechareg;

  @Column(name = "TIPOPROCESO_FECHAMOD")
  @Temporal(TemporalType.TIMESTAMP)
  private Date tipoprocesoFechamod;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 20)
  @Column(name = "TIPOPROCESO_USERREG")
  private String tipoprocesoUserreg;

  @Size(max = 20)
  @Column(name = "TIPOPROCESO_USERMOD")
  private String tipoprocesoUsermod;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 20)
  @Column(name = "TIPOPROCESO_CODIGO")
  private String tipoprocesoCodigo;

  @Size(max = 10)
  @Column(name = "TIPOPROCESO_ESTADO_PORTAL")
  private String tipoprocesoEstadoPortal;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "solprociudTipoprocesoId")
  private List<SolicitudSolProciudEntity> solicitudSolProciudList;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "subtipoprocTipoprocesoId")
  private List<ScPaSubtipoprocEntity> scPaSubtipoprocList;
}
