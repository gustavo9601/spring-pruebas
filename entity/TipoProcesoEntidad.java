/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.runt.jpa.entity;

import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ccepeda
 */
@Entity
@Table(name = "SC_PA_TIPOPROCESO", schema = "CSWPROC")
@Cacheable(false)
@Data
@NoArgsConstructor
public class TipoProcesoEntidad {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "TIPOPROCESO_ID")
  private Integer tipoprocesoId;

  @Column(name = "TIPOPROCESO_NOMBRE")
  private String tipoprocesoNombre;

  @Column(name = "TIPOPROCESO_RQPAGO")
  private BigInteger tipoprocesoRqpago;

  @Column(name = "TIPOPROCESO_PERSONINSC")
  private BigInteger tipoprocesoPersoninsc;

  @Column(name = "TIPOPROCESO_TIPCONLIQ")
  private Long tipoprocesoTipconliq;

  @Column(name = "TIPOPROCESO_ESTADO")
  private BigInteger tipoprocesoEstado;

  @Column(name = "TIPOPROCESO_FECHAREG")
  @Temporal(TemporalType.TIMESTAMP)
  private Date tipoprocesoFechareg;

  @Column(name = "TIPOPROCESO_FECHAMOD")
  @Temporal(TemporalType.TIMESTAMP)
  private Date tipoprocesoFechamod;

  @Column(name = "TIPOPROCESO_USERREG")
  private String tipoprocesoUserreg;

  @Column(name = "TIPOPROCESO_USERMOD")
  private String tipoprocesoUsermod;

  @Column(name = "TIPOPROCESO_CODIGO")
  private String tipoprocesoCodigo;

  @Column(name = "TIPOPROCESO_ESTADO_PORTAL")
  private String tipoprocesoEstadoPortal;
}
