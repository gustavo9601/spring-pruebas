/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.runt.jpa.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Tabla que contiene los motivos de rechazo.
 *
 * @author gmendoza
 */
@Entity
@Table(name = "SC_PA_MOTRECHAZ", schema = "CSWPROC")
@Cacheable(false)
@Data
@NoArgsConstructor
public class MotivoRechazoEntity {

  private static final long serialVersionUID = 3L;

  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "MOTRECHAZ_CODMOTIVO")
  private String codigo;

  @Column(name = "MOTRECHAZ_NOMBRE")
  private String nombre;

  @Column(name = "MOTRECHAZ_DESCRIPCI")
  private String descripcion;

  @Column(name = "MOTRECHAZ_APPAVAHU")
  private String appavahu;
}
