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
@Table(name = "PA_LINEA", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class LineaEntity {

  private static final long serialVersionUID = 1L;

  /** Identificador de la linea */
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "LINEA_IDLINEA")
  private Long id;

  /** Nombre de la marca */
  @Column(name = "LINEA_NOMBRE")
  private String nombre;

  /** Estado */
  @Column(name = "LINEA_ESTADO")
  private String estado;

  /** Marca asociada a la linea */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "LINEA_MARCA_IDMARCA")
  private MarcaEntity marcaEntidad;
}
