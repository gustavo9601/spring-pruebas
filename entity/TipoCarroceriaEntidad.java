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
@Table(name = "PA_TIPOCARRO", schema = "RUNTPROD")
@Cacheable(false)
@NamedQueries({
  @NamedQuery(
      name = "TipoCarroceriaEntidad.findAll",
      query = "SELECT c FROM TipoCarroceriaEntidad c"),
  @NamedQuery(
      name = "TipoCarroceriaEntidad.finById",
      query = "SELECT c FROM TipoCarroceriaEntidad c where c.id = :id")
})
@Data
@NoArgsConstructor
public class TipoCarroceriaEntidad {

  private static final long serialVersionUID = 1L;

  /** Identiticador del registro */
  @Id
  @NotNull
  @Column(name = "TIPOCARRO_IDCARROCE")
  private Integer id;

  /** Nombre */
  @Column(name = "TIPOCARRO_NOMBRE")
  private String nombre;

  /** Estado del registro */
  @Column(name = "TIPOCARRO_ESTADO")
  private String estado;

  /** Homologado */
  @Column(name = "TIPOCARRO_HOMDOBCAB")
  private String homologado;
}
