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
@Table(name = "PA_COLOR", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class ColorEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @NotNull
  @Column(name = "COLOR_IDCOLOR")
  private Integer id; // Número de registro

  @Column(name = "COLOR_CODCOLMIN")
  private String codigoMinisterio;

  @Column(name = "COLOR_PRIMARIO")
  private String colorPrimario;

  @Column(name = "COLOR_ESTADO")
  private String colorEstado;

  @Column(name = "COLOR_GAMACOLOR_NOMBRE")
  private String colorGama;
}
