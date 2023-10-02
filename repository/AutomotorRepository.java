package co.gov.runt.jpa.repository;

import co.gov.runt.jpa.entity.AutomotorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AutomotorRepository extends JpaRepository<AutomotorEntity, Long> {

  @Query("Select a from AutomotorEntity a where a.placa = :placa")
  AutomotorEntity getByPlaca(@Param("placa") String placa);

  @Query(
      value =
          "SELECT  AU.AUTOTRANS_EMPRESA_PERSONA,PERSONA_NRODOCUME,PERSONA_TIPOIDENT_IDTIPDOC,"
              + " E.EMPRESA_RAZOSOCIA,PERSNATUR_NOMBRE1"
              + " ,PERSNATUR_NOMBRE2,PERSNATUR_APELLIDO1,PERSNATUR_APELLIDO2,"
              + " AU.AUTOTRANS_MUNICIPIO_DIVIPOL\n"
              + "FROM RUNTPROD.GE_AUTOTRANS AU\n"
              + "INNER JOIN RUNTPROD.TR_PERSONA PR ON"
              + " AU.AUTOTRANS_EMPRESA_PERSONA=PR.PERSONA_IDPERSONA\n"
              + "LEFT JOIN RUNTPROD.GE_EMPRESA E ON"
              + " AU.AUTOTRANS_EMPRESA_PERSONA=E.EMPRESA_PERSONA_IDPERSONA\n"
              + "LEFT JOIN RUNTPROD.TR_PERSNATUR P ON"
              + " AU.AUTOTRANS_EMPRESA_PERSONA=PERSNATUR_PERSONA_IDPERSONA\n"
              + "WHERE AU.AUTOTRANS_IDAUTTRA=?",
      nativeQuery = true)
  Object[] consultarInfoAutoridadPorId(Long idAutoridad);

  @Query(
      value =
          "select DISTINCT MODATRANS_NOMBRE from runtprod.RA_AUTOMOTOR\n"
              + "    JOIN RUNTPROD.EV_TARJOPERA ON AUTOMOTOR_NROREGVEH ="
              + " TARJOPERA_AUTOMOTOR_NUMREGVEH    \n"
              + "    JOIN runtprod.RT_HABIEMPRE ON TARJOPERA_HABIEMPRE_IDENTIFIC ="
              + " HABIEMPRE_IDENTIFIC\n"
              + "    JOIN RUNTPROD.PA_PARHABEMP ON PARHABEMP_IDENTIFIC ="
              + " HABIEMPRE_PARHABEMP_IDENTIFIC\n"
              + "    JOIN RUNTPROD.PA_MODATRANS ON MODATRANS_IDEMODTRA ="
              + " PARHABEMP_MODATRANS_IDEMODTRA\n"
              + "    where AUTOMOTOR_PLACA_NUMPLACA=? AND SYSDATE BETWEEN TARJOPERA_FECHEXPED AND"
              + " TARJOPERA_FECHVENCI",
      nativeQuery = true)
  String getModalidadTransporte(String placa);
}
