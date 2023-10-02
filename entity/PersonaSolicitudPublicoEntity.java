/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.runt.jpa.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SC_PERSONA_SOLPUB", schema = "CSWPROC")
@Cacheable(false)
@Data
@NoArgsConstructor
public class PersonaSolicitudPublicoEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "GenPersonaSolicitudPublicoEntidadId")
  @SequenceGenerator(
      sequenceName = "SC_PERSONA_SOLPUB_SEQ",
      name = "GenPersonaSolicitudPublicoEntidadId",
      allocationSize = 1,
      schema = "CSWPROC")
  @Column(name = "PERSONASOLPUB_ID")
  private Long personasolpubId;

  @Column(name = "PERSONASOLPUB_APELLIDOS")
  private String personasolpubApellidos;

  @Column(name = "PERSONASOLPUB_NOMBRES")
  private String personasolpubNombres;

  @Column(name = "PERSONASOLPUB_FECHAREGISTRO")
  @Temporal(TemporalType.TIMESTAMP)
  private Date personasolpubFecharegistro;

  @Column(name = "PERSONASOLPUB_TIPODOC")
  private String personasolpubTipodoc;

  @Column(name = "PERSONASOLPUB_NUMDOC")
  private String personasolpubNumdoc;

  @Column(name = "PERSONASOLPUB_EMAIL")
  private String personasolpubEmail;

  @Column(name = "PERSONASOLPUB_ENVIADO")
  private Short personasolpubEnviado;

  @Column(name = "PERSONASOLPUB_DEPTO")
  private String personasolpubDepto;

  @Column(name = "PERSONASOLPUB_MUNIC")
  private String personasolpubMunic;

  @Column(name = "PERSONASOLPUB_REQFACTURA")
  private Short personasolpubReqfactura;

  @Column(name = "PERSONASOLPUB_FACTURAENVIADA")
  private Short personasolpubFacturaenviada;

  @Column(name = "PERSONASOLPUB_INTENTOS_ENVIO")
  private Short personasolpubIntentosEnvio;

  @Column(name = "PERSONASOLPUB_SIN_INFO_EXTERNA")
  private String personasolpubSinInfoExterna;
}
