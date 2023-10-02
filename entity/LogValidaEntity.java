/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.runt.jpa.entity;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SC_LOGVALIDA", schema = "CSWPROC")
@Cacheable(false)
@Data
@NoArgsConstructor
public class LogValidaEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @Basic(optional = false)
  @NotNull
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOGVALIDA_SEQ")
  @SequenceGenerator(
      sequenceName = "CSWPROC.SC_LOGVALIDA_SEQ",
      name = "LOGVALIDA_SEQ",
      allocationSize = 1)
  @Column(name = "LOGVALIDA_ID")
  private Long logvalidaId;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 15)
  @Column(name = "LOGVALIDA_RESULVAL")
  private String logvalidaResulval;

  @Basic(optional = false)
  @NotNull
  @Column(name = "LOGVALIDA_FECHORA")
  @Temporal(TemporalType.TIMESTAMP)
  private Date logvalidaFechora;

  @Size(max = 4000)
  @Column(name = "LOGVALIDA_DESCRIPCI")
  private String logvalidaDescripci;

  @Column(name = "LOGVALIDA_MOTRECHAZ_CODMOTIVO")
  private String logvalidaMotrechazCodmotivo;

  @Column(name = "LOGVALIDA_TIPOVALID_CODVALIDA")
  private String logvalidaTipovalidCodvalida;

  @Column(name = "LOGVALIDA_SOLPROCIUD_ID")
  private Long logvalidaSolprociudId;
}
