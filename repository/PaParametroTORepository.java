package co.gov.runt.jpa.repository;

import co.gov.runt.jpa.entity.PaParametroTOEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PaParametroTORepository extends JpaRepository<PaParametroTOEntity, String> {
  @Query(
      value =
          "SELECT PA.PARAMETRO_VALOR FROM CSWTO.PA_PARAMETRO PA WHERE PA.PARAMETRO_CLAVE = :clave",
      nativeQuery = true)
  String parametroPorClaveTO(String clave);
}
