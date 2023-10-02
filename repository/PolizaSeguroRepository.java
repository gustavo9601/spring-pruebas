package co.gov.runt.jpa.repository;

import co.gov.runt.jpa.entity.PolizaSeguroEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PolizaSeguroRepository extends JpaRepository<PolizaSeguroEntity, Long> {
  @Query(
      "SELECT s FROM PolizaSeguroEntity s WHERE s.codigoTipoSeguro=1 and s.estado"
          + " in('EMITIDA','REEMPLAZO') and s.placa = :numeroPlaca ORDER BY s.fechaVencimiento"
          + " DESC")
  List<PolizaSeguroEntity> obtenerSegurosByPlaca(@Param("numeroPlaca") String placa);
}
