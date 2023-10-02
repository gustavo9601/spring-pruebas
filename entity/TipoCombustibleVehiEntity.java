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
@Table(name = "RA_TIPCOMVEH", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class TipoCombustibleVehiEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "TIPCOMVEH_IDENTIFIC")
  private Long id; // Identificador del tipo de combustible

  @JoinColumn(name = "TIPCOMVEH_TIPOCOMBU_NOMBRE", referencedColumnName = "TIPOCOMBU_NOMBRE")
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private TipoCombustibleEntity nombre; // Nombre del tipo de combustible

  @Column(name = "TIPCOMVEH_AUTOMOTOR_NROREGVEH")
  private Long numRegistro; // Número de registro del vehículo
}
