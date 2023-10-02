package co.gov.runt.jpa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RS_POLISEGUR", schema = "RUNTPROD")
@Cacheable(false)
@Data
@NoArgsConstructor
public class PolizaSeguroEntity implements Serializable {

  @Id
  @Basic(optional = false)
  @Column(name = "POLISEGUR_NROPOLIZA")
  Long id;

  @Column(name = "POLISEGUR_ESTAPOLIZ_NOMBRE")
  String estado;

  @Column(name = "POLISEGUR_NROPLACA")
  String placa;

  @Column(name = "POLISEGUR_TIPOSEGUR_IDTIPSEG")
  Integer codigoTipoSeguro;

  @Column(name = "POLISEGUR_POLIZASEG")
  String numeroPolizaAseguradora;

  @Column(name = "POLISEGUR_FECINIPOL")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaInicioPoliza;

  @Column(name = "POLISEGUR_FECVENPOL")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaVencimiento;

  @Column(name = "POLISEGUR_TARIFA")
  private Integer coigoTarifa;
}
