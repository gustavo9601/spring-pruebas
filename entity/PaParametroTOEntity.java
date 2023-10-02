package co.gov.runt.jpa.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "CSWTO", name = "PA_PARAMETRO")
@NoArgsConstructor
@Getter
@Setter
public class PaParametroTOEntity {
  @Id
  @Column(name = "PARAMETRO_CLAVE", nullable = false)
  private String parametroClave;

  @Column(name = "PARAMETRO_VALOR")
  private String parametroValor;

  @Column(name = "PARAMETRO_FREG")
  private Timestamp parametroFreg;

  @Column(name = "PARAMETRO_FACT")
  private Timestamp parametroFact;

  @Column(name = "PARAMETRO_USRREG")
  private String parametroUsrreg;

  @Column(name = "PARAMETRO_USRACT")
  private String parametroUsract;

  @Column(name = "PARAMETRO_IPREG")
  private String parametroIpreg;

  @Column(name = "PARAMETRO_IPACT")
  private String parametroIpact;

  @Column(name = "PARAMETRO_ESTADO")
  private String parametroEstado;

  @Column(name = "PARAMETRO_DESCRIPCION")
  private String parametroDescripcion;
}
