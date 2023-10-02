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
@Table(name = "PA_TIPOSERVI", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class TipoServicioEntity {

  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "TIPOSERVI_IDETIPSER")
  private Integer id; // Número de registro

  @Column(name = "TIPOSERVI_NOMBRE")
  private String nombre;

  @Column(name = "TIPOSERVI_ESTADO")
  private String estado;
}
