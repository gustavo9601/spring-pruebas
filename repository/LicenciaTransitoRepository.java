package co.gov.runt.jpa.repository;

import co.gov.runt.jpa.entity.LicenciaTransitoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LicenciaTransitoRepository extends JpaRepository<LicenciaTransitoEntity, String> {
  @Query(
      "SELECT l FROM LicenciaTransitoEntity l where l.automotor.placa= :placa and l.estado='ACTIVO'"
          + " order by l.fechaExpedicion desc")
  List<LicenciaTransitoEntity> findActivas(@Param("placa") String placa);
}
