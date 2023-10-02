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
 * Esta entidad representa los diversos radios de acción en los que una empresa de transporte
 * público o privado puede operar. Estos radios de acción son: - Municipal - Nacional -
 * Metropolitano - Urbano
 *
 * @date 04-Marzo-2019
 */
@Entity
@Table(name = "PA_RADIACCIO", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class RadioAccionEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "RADIACCIO_IDRADIO")
  private Short id; // Codigo identificador del radio de accion asociado a la
  // empresa transportadora.

  @Basic(optional = false)
  @NotNull
  @Column(name = "RADIACCIO_NOMBRE")
  private String nombre; // Nombre del radio de acción sobre el cual la empresa
  // puede operar.

  @Basic(optional = false)
  @NotNull
  @Column(name = "RADIACCIO_ESTADO")
  private String estado; // Estado del radio de acción
}
