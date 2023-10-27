package apiCosmeticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apiCosmeticos.model.Cosmeticos;

public interface CosmeticosRepository extends JpaRepository<Cosmeticos, Long> {

}
