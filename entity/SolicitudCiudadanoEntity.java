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
@Table(name = "SC_SOLPROCIUD", schema = "CSWPROC")
@Cacheable(false)
@Data
@NoArgsConstructor
public class SolicitudCiudadanoEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "SOLPROCIUD_ID")
  private Long id;

  @Column(name = "SOLPROCIUD_PLACA")
  private String placa;

  @Column(name = "SOLPROCIUD_FECHAREG")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaRegistro;

  @Column(name = "SOLPROCIUD_FECHAMOD")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaModificacion;

  @Column(name = "SOLPROCIUD_ACEPTATERM")
  private Short aceptaTerminos;

  @Column(name = "SOLPROCIUD_TIPOPOSTUCREI_ID")
  private Short tipoPostulacionCrei;

  @Column(name = "SOLPROCIUD_ESTADO")
  private String estado;

  @Column(name = "SOLPROCIUD_REQPAGO")
  private short requierePago;

  @Lob
  @Column(name = "SOLPROCIUD_ARCHIVO")
  private byte[] archivo;

  @Column(name = "SOLPROCIUD_MOTIVOCANCELADO")
  private String motivoCancelacion;

  @Column(name = "SOLPROCIUD_FECHHORAACEPTATER")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaAceptaTerminos;

  @Column(name = "SOLPROCIUD_TIPOPOSTVEHC_ID")
  private String tipoPostulacionVehiculo;

  @Column(name = "SOLPROCIUD_PERSONA_TIPODOCU")
  private String tipoDocumentoPersonaSolicitud;

  @Column(name = "SOLPROCIUD_PERSONA_NRODOCU")
  private String numeroDocumentoPersonaSolicitud;

  /** Tipo de tramite que se hace desde el portal ciudadano */
  @JoinColumn(name = "SOLPROCIUD_TIPOPROCESO_ID", referencedColumnName = "TIPOPROCESO_ID")
  @ManyToOne(
      cascade = {},
      fetch = FetchType.EAGER,
      optional = false)
  private TipoProcesoEntidad tipoProceso;

  /** Persona que realiza una solicitud publica que no esta registrada en el portal */
  @JoinColumn(name = "SOLPROCIUD_PERSONASOLPUB_ID", referencedColumnName = "PERSONASOLPUB_ID")
  @ManyToOne(
      cascade = {},
      fetch = FetchType.EAGER)
  private PersonaSolicitudPublicoEntity personaSolicitudPublicoEntidad;

  /** Persona que realiza la solicitud, esta persona esta registrada en el portal y tiene usuario */
  @JoinColumn(name = "SOLPROCIUD_PERSONA_ID")
  @ManyToOne(
      cascade = {},
      fetch = FetchType.EAGER)
  private PersonaEntity personaEntidad;

  @Column(name = "SOLPROCIUD_SUBTIPOPROC_ID")
  private Short subTipoProceso;
}
