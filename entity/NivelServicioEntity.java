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
@Table(name = "PA_NIVESERVI", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class NivelServicioEntity {

  private static final long serialVersionUID = 1L;

  /** Identiticador del registro */
  @Id
  @NotNull
  @Column(name = "NIVESERVI_IDNIVSERV")
  private Integer id;

  /** Nombre */
  @Column(name = "NIVESERVI_NOMBRE")
  private String nombre;

  /** Estado del registro */
  @Column(name = "NIVESERVI_ESTADO")
  private String estado;
}
