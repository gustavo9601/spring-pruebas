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
 * @author Ccepeda
 */
@Entity
@Table(name = "PA_TIPOMOTOR", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class TipoMotorEntidad {

  private static final long serialVersionUID = 1L;

  /** Identiticador del registro */
  @Id
  @NotNull
  @Column(name = "TIPOMOTOR_IDTIPMOTO")
  private Integer id;

  /** Nombre */
  @Column(name = "TIPOMOTOR_NOMBRE")
  private String nombre;

  /** Estado del registro */
  @Column(name = "TIPOMOTOR_ESTADO")
  private String estado;
}
