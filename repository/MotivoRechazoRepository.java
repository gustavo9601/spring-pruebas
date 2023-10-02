package co.gov.runt.jpa.repository;

import co.gov.runt.jpa.entity.MotivoRechazoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MotivoRechazoRepository extends JpaRepository<MotivoRechazoEntity, String> {
  @Query("SELECT s FROM MotivoRechazoEntity s WHERE s.codigo = :codigo")
  MotivoRechazoEntity obtenerPorId(@Param("codigo") String codigoMotivoRechazo);
}
