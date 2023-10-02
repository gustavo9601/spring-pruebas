package co.gov.runt.jpa.repository;

import co.gov.runt.jpa.entity.SolicitudPcrEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SolicitudPcrRepository extends JpaRepository<SolicitudPcrEntity, Long> {

  @Query(
      "SELECT s FROM SolicitudPcrEntity s WHERE s.solicitudpcrSolporcid.solprociudId ="
          + " :solicitudCiudadano")
  SolicitudPcrEntity obtenerSolicitudByIdSolCiudadano(@Param("solicitudCiudadano") Long id);

  @Query(
      value =
          "SELECT GS.SOLICITUD_PLACA_NUMPLACA FROM RUNTPROD.GE_SOLICITUD GS WHERE"
              + " GS.SOLICITUD_IDENSOLIC = :idSolicitud",
      nativeQuery = true)
  String obtenerPlacaPorGeSolicitud(@Param("idSolicitud") Long geSolicitud);

  @Query(
      value =
          "SELECT GT.TRAMITE_TIPOTRAMI_CODTRAMIT FROM RUNTPROD.GE_TRAMITE GT WHERE"
              + " GT.TRAMITE_SOLICITUD_IDENSOLIC = :geSolicitud",
      nativeQuery = true)
  Long obtenerTipoTramitePorGeSolicitud(@Param("geSolicitud") Long geSolicitud);

  @Query(
      value =
          "SELECT PM.MOTRECHAZ_DESCRIPCI FROM RUNTPROD.PA_MOTRECHAZ PM WHERE PM.MOTRECHAZ_CODMOTIVO"
              + " = :codMotivo",
      nativeQuery = true)
  String obtenerDescripcionMotivoRechazo(@Param("codMotivo") Long codMotivo);

  @Query(
      value =
          "SELECT GT.TRAMITE_IDTRAMITE FROM RUNTPROD.GE_TRAMITE GT WHERE"
              + " GT.TRAMITE_SOLICITUD_IDENSOLIC = :geSolicitud",
      nativeQuery = true)
  Long obtenerTramitePorGeSolicitud(@Param("geSolicitud") Long geSolicitud);

  @Query(
      value =
          "SELECT COUNT(*) FROM RUNTPROD.GE_TRAMITE gt \n"
              + "INNER JOIN RUNTPROD.PA_TRATAROPE pt ON (GT.TRAMITE_TIPOTRAMI_CODTRAMIT"
              + " =pt.TRATAROPE_TIPOTRAMI_CODTRAMIT) \n"
              + " WHERE gt.TRAMITE_SOLICITUD_IDENSOLIC = :geSolicitud ",
      nativeQuery = true)
  Long isTramiteTO(@Param("geSolicitud") Long geSolicitud);

  @Query(
      value =
          "SELECT (RA.RADIACCIO_NOMBRE  || ' ' || MO.MODATRANS_NOMBRE || NVL2(E.MODSEREMP_NOMBRE,'"
              + " ','') || E.MODSEREMP_NOMBRE) NOMBRE  \n"
              + " FROM RUNTPROD.GE_TRAMITE GT \n"
              + " INNER JOIN RUNTPROD.TM_TRATAROPE TT ON"
              + " (GT.TRAMITE_IDTRAMITE=TT.TRATAROPE_TRAMITE_IDTRAMITE) \n"
              + " INNER JOIN RUNTPROD.RT_HABIEMPRE RH ON"
              + " (TT.TRATAROPE_HABIEMPRE_IDENTIFIC=RH.HABIEMPRE_IDENTIFIC)\n"
              + " JOIN RUNTPROD.PA_PARHABEMP PH ON"
              + " (PH.PARHABEMP_IDENTIFIC=RH.HABIEMPRE_PARHABEMP_IDENTIFIC)\n"
              + " JOIN RUNTPROD.PA_RADIACCIO RA ON"
              + " (RA.RADIACCIO_IDRADIO=PH.PARHABEMP_RADIACCIO_IDRADIO)\n"
              + " JOIN RUNTPROD.PA_MODATRANS MO ON"
              + " (MO.MODATRANS_IDEMODTRA=PH.PARHABEMP_MODATRANS_IDEMODTRA)\n"
              + " LEFT JOIN RUNTPROD.PA_MODSEREMP E ON"
              + " (E.MODSEREMP_IDEMODSER=PH.PARHABEMP_MODSEREMP_IDEMODSER)\n"
              + " WHERE GT.TRAMITE_SOLICITUD_IDENSOLIC = :idTramiteSolcitud ",
      nativeQuery = true)
  String obtenerIdentificadorHabilitacion(@Param("idTramiteSolcitud") Long geSolicitud);

  @Query(
      value =
          "SELECT TECNAUTOM_PASASENTA AS capacidadPasajerosSentados FROM RUNTPROD.RA_TECNAUTOM rt\n"
              + "        INNER JOIN RUNTPROD.RA_AUTOMOTOR ra ON"
              + " (rt.TECNAUTOM_AUTOMOTOR_NROREGVEH=ra.AUTOMOTOR_NROREGVEH)\n"
              + "        WHERE  ra.AUTOMOTOR_PLACA_NUMPLACA = :numeroPlaca ",
      nativeQuery = true)
  Integer obtenerCapacidadPasajerosSentadosByPlaca(@Param("numeroPlaca") String numeroPlaca);
}
