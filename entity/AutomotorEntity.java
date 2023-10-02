package co.gov.runt.jpa.entity;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "RUNTPROD", name = "RA_AUTOMOTOR")
@NoArgsConstructor
@Getter
@Setter
public class AutomotorEntity {
  private static final long serialVersionUID = 1L;

  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "AUTOMOTOR_NROREGVEH")
  private Long nroRegistro; // Número de registro

  /** */
  @Column(name = "AUTOMOTOR_PLACA_NUMPLACA")
  private String placa; // Placa del vehículo

  @Column(name = "AUTOMOTOR_ESTAVEHIC_NOMBRE")
  private String estado; // Estado del vehículo

  @Column(name = "AUTOMOTOR_GRUPO_IDGRUPO")
  private String idGrupo; // Identificador del grupo

  @Column(name = "AUTOMOTOR_ANOFABRIC")
  private Short anoFabricacion; // Corresponde al año de fabricación

  @Column(name = "AUTOMOTOR_MODELO")
  private Short modelo; // Corresponde al modelo

  @Column(name = "AUTOMOTOR_ESTAREPOS")
  private String estaRepuesto;

  @Column(name = "AUTOMOTOR_FECHREGIS")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaRegistro; // Corresponde a la fecha de registro

  @Column(name = "AUTOMOTOR_IDVEUNINT")
  private String idVehicularUnicoInternacional;

  @Column(name = "AUTOMOTOR_NROCHASIS")
  private String automotorNrochasis;

  @Column(name = "AUTOMOTOR_NROMOTOR")
  private String nroMotor; // Corresponde al número de motor

  @Column(name = "AUTOMOTOR_NROREGCHA")
  private String nroRegrabacionChasis; // Corresponde al número de re-grabación
  // del chasis
  @Column(name = "AUTOMOTOR_NROREGMOT")
  private String nroRegrabacionMotor; // Corresponde al número de re-grabación
  // del motor
  @Column(name = "AUTOMOTOR_NROREGSER")
  private String nroRegrabacionSerie; // Corresponde al número de re-grabación
  // de la serie
  @Column(name = "AUTOMOTOR_NROSERIE")
  private String nroSerie; // Número de serie

  @Column(name = "AUTOMOTOR_CILINDRAJ")
  private Integer cilindraje; // Cilindraje

  @Column(name = "AUTOMOTOR_REPOTENCI")
  private String estaRepotenciado;

  @Column(name = "AUTOMOTOR_FECHCANCE")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaCancelacion;

  @Column(name = "AUTOMOTOR_ENSENAZA")
  private String esEnsenanza;

  @Column(name = "AUTOMOTOR_MIGRADO")
  private String migrado;

  @Column(name = "AUTOMOTOR_ANTICLASI_NOMBRE")
  private String tipoVehiculo; // Tipo de vehículo

  @Column(name = "AUTOMOTOR_SEGUESTAD")
  private String esSeguridadEstado;

  @Column(name = "AUTOMOTOR_VALDOCEXI")
  private String validacionDocumentalExitosa;

  @Column(name = "AUTOMOTOR_FECMIGRA")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaMigracion; // Fecha de la migración

  @Column(name = "AUTOMOTOR_FECHACTUA")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaActualizacion;

  @Column(name = "AUTOMOTOR_PLAQUETA")
  private String nroPlaqueta;

  @Column(name = "AUTOMOTOR_NROREGPLA")
  private String nroRegrabacionPlaqueta;

  @Column(name = "AUTOMOTOR_ESTAMIGR")
  private String estadoMigracion;

  @Column(name = "AUTOMOTOR_NUEVMODEL")
  private Short nuevoModelo;

  @Column(name = "AUTOMOTOR_NUMCONWS")
  private Long nroConsumosWebService; // Número de consumos por Web Service

  @Column(name = "AUTOMOTOR_NROREGVIN")
  private String nroRegrabacionVin;

  @Column(name = "AUTOMOTOR_ANTIDECLA")
  private String nroDeclaracionImportacion; // Corresponde al número de declaración de
  // importación
  @Column(name = "AUTOMOTOR_FECACEDEC")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaAceptacionDeclaracion; // Corresponde a la fecha de aceptación
  // de la declaración
  @Column(name = "AUTOMOTOR_ZOREGADUA_IDREGIMEN")
  private Short codZonaRegimenEspecial; // Código de la zona - régimen especial

  /** Referencia a la clase de vehículo */
  @JoinColumn(name = "AUTOMOTOR_CLASVEHIC_IDCLASE", referencedColumnName = "CLASVEHIC_IDCLASE")
  @ManyToOne(optional = false)
  private ClaseVehiculoEntity claseVehiculoEntidad; //

  /** Color del vehiculo */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_COLOR_IDCOLOR")
  private ColorEntity colorEntidad;

  /** Tipo de servicio */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_TIPOSERVI_IDETIPSER")
  private TipoServicioEntity tipoServicioEntidad;

  /** Marca del vehiculo */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_MARCA_IDMARCA")
  private MarcaEntity marcaEntidad;

  /** Linea */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_LINEA_IDLINEA")
  private LineaEntity lineaEntidad;

  /** * Nivel de servicio */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_NIVESERVI_IDNIVSER")
  private NivelServicioEntity nivelServicioEntidad;

  /** Modalidad de servicio */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_MODASERVI_IDEMODSER")
  private ModalidadServicioEntity modalidadServicioEntidad;

  /** Radio de acción */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_RADIACCIO_IDRADIO")
  private RadioAccionEntity radioAccionEntidad;

  /** Tipo de carroceria */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_TIPOCARRO_IDCARROCE")
  private TipoCarroceriaEntidad tipoCarroceriaEntidad;

  /** Tipo de motor */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_TIPOMOTOR_IDTIPMOT")
  private TipoMotorEntidad tipoMotorEntidad;

  /** Pais de origen */
  @ManyToOne(
      cascade = {},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "AUTOMOTOR_PAIS_IDPAISORI")
  private PaisEntity paisEntidad;

  @Column(name = "AUTOMOTOR_AUTOTRANS_IDAUTTRA")
  private Long idAutoridad;

  @Column(name = "AUTOMOTOR_UNIMEDCIL_ID")
  private Short idUnidadMedCilindraje; // Tabla PA_UNIMEDCIL

  @Column(name = "AUTOMOTOR_MOTIVO_NOMBRE")
  private String motivoCancelacion;
}
