package co.gov.runt.jpa.entity;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "CSWPROC", name = "SC_SOLPROCIUD")
@Data
@NoArgsConstructor
public class SolicitudSolProciudEntity {
  private static final long serialVersionUID = 1L;

  @Id
  @Basic(optional = false)
  @Column(name = "SOLPROCIUD_ID")
  private Long solprociudId;

  @Size(max = 10)
  @Column(name = "SOLPROCIUD_PLACA")
  private String solprociudPlaca;

  @Basic(optional = false)
  @Column(name = "SOLPROCIUD_FECHAREG")
  @Temporal(TemporalType.TIMESTAMP)
  private Date solprociudFechareg;

  @Column(name = "SOLPROCIUD_FECHAMOD")
  @Temporal(TemporalType.TIMESTAMP)
  private Date solprociudFechamod;

  @Column(name = "SOLPROCIUD_ACEPTATERM")
  private Short solprociudAceptaterm;

  @Column(name = "SOLPROCIUD_PERSONA_ID")
  private BigInteger solprociudPersonaId;

  @Column(name = "SOLPROCIUD_TIPOPOSTUCREI_ID")
  private Short solprociudTipopostucreiId;

  @Basic(optional = false)
  @Size(min = 1, max = 60)
  @Column(name = "SOLPROCIUD_ESTADO")
  private String solprociudEstado;

  @Basic(optional = false)
  @Column(name = "SOLPROCIUD_REQPAGO")
  private short solprociudReqpago;

  @Lob
  @Column(name = "SOLPROCIUD_ARCHIVO")
  private byte[] solprociudArchivo;

  @Size(max = 250)
  @Column(name = "SOLPROCIUD_MOTIVOCANCELADO")
  private String solprociudMotivocancelado;

  @Column(name = "SOLPROCIUD_FECHHORAACEPTATER")
  @Temporal(TemporalType.TIMESTAMP)
  private Date solprociudFechhoraaceptater;

  @Size(max = 200)
  @Column(name = "SOLPROCIUD_TIPOPOSTVEHC_ID")
  private String solprociudTipopostvehcId;

  @Size(max = 500)
  @Column(name = "SOLPROCIUD_NOTAS")
  private String solprociudNotas;

  @Size(max = 1)
  @Column(name = "SOLPROCIUD_PERSONA_TIPODOCU")
  private String solprociudPersonaTipodocu;

  @Size(max = 20)
  @Column(name = "SOLPROCIUD_PERSONA_NRODOCU")
  private String solprociudPersonaNrodocu;

  @JoinColumn(name = "SOLPROCIUD_SUBTIPOPROC_ID", referencedColumnName = "SUBTIPOPROC_ID")
  @ManyToOne
  private ScPaSubtipoprocEntity solprociudSubtipoprocId;

  @JoinColumn(name = "SOLPROCIUD_TIPOPROCESO_ID", referencedColumnName = "TIPOPROCESO_ID")
  @ManyToOne(optional = false)
  private ScPaTipoprocesoEntity solprociudTipoprocesoId;

  @JoinColumn(name = "SOLPROCIUD_PERSONASOLPUB_ID", referencedColumnName = "PERSONASOLPUB_ID")
  @ManyToOne
  private ScPersonaSolpubEntity solprociudPersonasolpubId;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudpcrSolporcid")
  private List<SolicitudPcrEntity> solicitudPcrList;
}
