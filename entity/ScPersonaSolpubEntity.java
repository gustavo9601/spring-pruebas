package co.gov.runt.jpa.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "CSWPROC", name = "SC_PERSONA_SOLPUB")
@Data
@NoArgsConstructor
public class ScPersonaSolpubEntity {
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "PERSONASOLPUB_ID")
  private Long personasolpubId;

  @Size(max = 70)
  @Column(name = "PERSONASOLPUB_APELLIDOS")
  private String personasolpubApellidos;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 70)
  @Column(name = "PERSONASOLPUB_NOMBRES")
  private String personasolpubNombres;

  @Basic(optional = false)
  @NotNull
  @Column(name = "PERSONASOLPUB_FECHAREGISTRO")
  @Temporal(TemporalType.TIMESTAMP)
  private Date personasolpubFecharegistro;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 1)
  @Column(name = "PERSONASOLPUB_TIPODOC")
  private String personasolpubTipodoc;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 30)
  @Column(name = "PERSONASOLPUB_NUMDOC")
  private String personasolpubNumdoc;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 70)
  @Column(name = "PERSONASOLPUB_EMAIL")
  private String personasolpubEmail;

  @Column(name = "PERSONASOLPUB_ENVIADO")
  private Short personasolpubEnviado;

  @Size(max = 20)
  @Column(name = "PERSONASOLPUB_DEPTO")
  private String personasolpubDepto;

  @Size(max = 20)
  @Column(name = "PERSONASOLPUB_MUNIC")
  private String personasolpubMunic;

  @Column(name = "PERSONASOLPUB_REQFACTURA")
  private Short personasolpubReqfactura;

  @Column(name = "PERSONASOLPUB_FACTURAENVIADA")
  private Short personasolpubFacturaenviada;

  @Column(name = "PERSONASOLPUB_INTENTOS_ENVIO")
  private Short personasolpubIntentosEnvio;

  @Size(max = 1)
  @Column(name = "PERSONASOLPUB_SIN_INFO_EXTERNA")
  private String personasolpubSinInfoExterna;

  @OneToMany(mappedBy = "solprociudPersonasolpubId")
  private List<SolicitudSolProciudEntity> solicitudSolProciudList;
}
