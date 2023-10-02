package co.gov.runt.jpa.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "CSWPROC", name = "SC_SOLICITUDPCR")
@Data
@NoArgsConstructor
public class SolicitudPcrEntity {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SOLICITUD_PCR_SEQ")
  @SequenceGenerator(
      sequenceName = "CSWPROC.SC_SOLICITUDPCR_SEQ",
      name = "SOLICITUD_PCR_SEQ",
      allocationSize = 1)
  @Basic(optional = false)
  @Column(name = "SOLICITUDPCR_ID")
  private Long solicitudpcrId;

  @Basic(optional = false)
  @Size(min = 1, max = 10)
  @Column(name = "SOLICITUDPCR_PLACA")
  private String solicitudpcrPlaca;

  @Basic(optional = false)
  @Column(name = "SOLICITUDPCR_DEPTOORIGID")
  private BigInteger solicitudpcrDeptoorigid;

  @Basic(optional = false)
  @Column(name = "SOLICITUDPCR_MUPIOORIGID")
  private BigInteger solicitudpcrMupioorigid;

  @Basic(optional = false)
  @Column(name = "SOLICITUDPCR_DEPTODESTID")
  private BigInteger solicitudpcrDeptodestid;

  @Basic(optional = false)
  @Column(name = "SOLICITUDPCR_MUPIODESTID")
  private BigInteger solicitudpcrMupiodestid;

  @Basic(optional = false)
  @Column(name = "SOLICITUDPCR_PUNTOSINT")
  private String solicitudpcrPuntosint;

  @Basic(optional = false)
  @Column(name = "SOLICITUDPCR_FECHAINIVIG")
  @Temporal(TemporalType.TIMESTAMP)
  private Date solicitudpcrFechainivig;

  @Basic(optional = false)
  @Column(name = "SOLICITUDPCR_FECHAFINVIG")
  @Temporal(TemporalType.TIMESTAMP)
  private Date solicitudpcrFechafinvig;

  @Basic(optional = false)
  @Column(name = "SOLICITUDPCR_FECHAULTMOD")
  @Temporal(TemporalType.TIMESTAMP)
  private Date solicitudpcrFechaultmod;

  @JoinColumn(name = "SOLICITUDPCR_SOLPORCID", referencedColumnName = "SOLPROCIUD_ID")
  @ManyToOne(optional = false)
  private SolicitudSolProciudEntity solicitudpcrSolporcid;

  @Column(name = "SOLICITUDPCR_CDA")
  private Long cda;

  @Column(name = "SOLICITUDPCR_SOLPADRE")
  private Long solicitudPadre;

  @Column(name = "SOLICITUDPCR_TIEMPOTALLER")
  private Integer solicitudpcrTiempotaller;

  @Column(name = "SOLICITUDPCR_NUMTAROPE")
  private String solicitudpcrNumtarope;

  @Column(name = "SOLICITUDPCR_DEPTOTAROPE")
  private Integer solicitudpcrDeptotarope;

  @Column(name = "SOLICITUDPCR_MUPIOTAROPE")
  private Integer solicitudpcrMupiotarope;

  @Column(name = "SOLICITUDPCR_NITTAROPE")
  private BigDecimal solicitudpcrNittarope;

  @Column(name = "SOLICITUDPCR_RAZOSOCIATO")
  private String solicitudpcrRazosociato;
}
