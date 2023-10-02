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
@Table(name = "SC_PERSONA", schema = "CSWPROC")
@Cacheable(false)
@Data
@NoArgsConstructor
public class PersonaEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "PERSONA_ID")
  private Long personaId;

  @Column(name = "PERSONA_TIPODOC")
  private String personaTipodoc;

  @Column(name = "PERSONA_NUMDOC")
  private String personaNumdoc;

  @Column(name = "PERSONA_PNOMBRE")
  private String personaPnombre;

  @Column(name = "PERSONA_SNOMBRE")
  private String personaSnombre;

  @Column(name = "PERSONA_PAPELLIDO")
  private String personaPapellido;

  @Column(name = "PERSONA_SAPELLIDO")
  private String personaSapellido;

  @Column(name = "PERSONA_EMAIL")
  private String personaEmail;

  @Column(name = "PERSONA_TELEFONO")
  private String personaTelefono;

  @Column(name = "PERSONA_CELULAR")
  private String personaCelular;

  @Column(name = "PERSONA_DEPTO")
  private String personaDepto;

  @Column(name = "PERSONA_MUNCIPIO")
  private String personaMuncipio;

  @Column(name = "PERSONA_DIRECCION")
  private String personaDireccion;

  @Column(name = "PERSONA_FECHAREG")
  @Temporal(TemporalType.TIMESTAMP)
  private Date personaFechareg;

  @Column(name = "PERSONA_FECHAACT")
  @Temporal(TemporalType.TIMESTAMP)
  private Date personaFechaact;

  @Column(name = "PERSONA_TIPOREGIS")
  private String personaTiporegis;

  @Column(name = "PERSONA_TIPODOCREPL")
  private String personaTipodocrepl;

  @Column(name = "PERSONA_NUMDOCREPL")
  private String personaNumdocrepl;

  @Column(name = "PERSONA_RAZONSOCIAL")
  private String personaRazonsocial;

  @Column(name = "PERSONA_NITEMPRESA")
  private String personaNitempresa;

  @Column(name = "PERSONA_ACEPTATERMINOS")
  private Short personaAceptaterminos;
}
