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
@Table(name = "PA_MARCA", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class MarcaEntity {

  private static final long serialVersionUID = 1L;

  /** Identificador de la marca */
  @Id
  @NotNull
  @Column(name = "MARCA_IDMARCA")
  private Integer id;

  /** Codigo de la marca */
  @Column(name = "MARCA_CODMARCA")
  private String codigo;

  /** Nombre de la marca */
  @Column(name = "MARCA_NOMBRE")
  private String nombre;

  /** Estado del registro */
  @Column(name = "MARCA_ESTADO")
  private String estado;

  @Column(name = "MARCA_ABREVIATU")
  private String abreviatura;
}
