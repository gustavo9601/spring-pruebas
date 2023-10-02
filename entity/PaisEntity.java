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
@Table(name = "PA_PAIS", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class PaisEntity {

  private static final long serialVersionUID = 1L;

  /** Identiticador del registro */
  @Id
  @NotNull
  @Column(name = "PAIS_IDPAIS")
  private Integer id;

  /** Nombre del pais */
  @Column(name = "PAIS_NOMBRE")
  private String nombre;

  /** Sigla del pais */
  @Column(name = "PAIS_SIGLA")
  private String sigla;
}
