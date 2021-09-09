package com.matheus.mthsvendas.repositories;

import com.matheus.mthsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}