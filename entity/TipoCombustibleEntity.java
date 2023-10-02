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

@Entity
@Table(name = "PA_TIPOCOMBU", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class TipoCombustibleEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "TIPOCOMBU_NOMBRE")
  private String nombre; // Nombre con el que se identifican los tipos de combustible para vehículos

  @Column(name = "TIPOCOMBU_DESCRIPCI")
  private String descripcion; // Nombre del tipo de combustible.
}
