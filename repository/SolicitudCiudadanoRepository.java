package co.gov.runt.jpa.repository;

import co.gov.runt.jpa.entity.SolicitudCiudadanoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SolicitudCiudadanoRepository
    extends JpaRepository<SolicitudCiudadanoEntity, Long> {
  @Query("SELECT s FROM SolicitudCiudadanoEntity s WHERE s.id =:idsolicitud")
  SolicitudCiudadanoEntity obtenerPorId(@Param("idsolicitud") Long idsolicitud);
}
