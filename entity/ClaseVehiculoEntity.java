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
 * Representa una clase de vehículo
 *
 * @date 27/12/2018
 */
@Entity
@Table(name = "PA_CLASVEHIC", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class ClaseVehiculoEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "CLASVEHIC_IDCLASE")
  private Short id; // Identificador

  @Basic(optional = false)
  @NotNull
  @Column(name = "CLASVEHIC_NOMBRE")
  private String nombre; // Nombre de la clase de vehículo

  @Column(name = "CLASVEHIC_ESTADO")
  private String estado; // Estado del vehículo

  @Column(name = "CLASVEHIC_CANTPLACA")
  private Integer cantidadPlacas; // Cantidad de placas

  @Column(name = "CLASVEHIC_PERPROEXP")
  private String permiteProrrogaExcepcional; // Permite prorroga excepcional

  @Column(name = "CLASVEHIC_CARGA")
  private String carga; // Para saber si es de carga

  @Column(name = "CLASVEHIC_REQFTHDET")
  private String requiereFthDetalle;

  @Column(name = "CLASVEHIC_REQUFTHMI")
  private String requiereFthMatriculaInicial;

  @Column(name = "CLASVEHIC_REQUTRACC")
  private String requiereTraccion; // Requiere tracción
}
