package org.o7planning.repository;

import org.o7planning.entity.TaxpayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxpayerRepository extends JpaRepository<TaxpayerEntity, Long> {

}
