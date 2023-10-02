package co.gov.runt.jpa.repository;

import co.gov.runt.jpa.entity.TipoCombustibleVehiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TipoCombustibleVehiRepository
    extends JpaRepository<TipoCombustibleVehiEntity, Long> {

  @Query("SELECT t FROM TipoCombustibleVehiEntity t where t.numRegistro = :numRegistro")
  TipoCombustibleVehiEntity getByIdAutomotor(@Param("numRegistro") Long numRegistro);
}
