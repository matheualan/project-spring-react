package com.matheus.mthsvendas.repositories;

import com.matheus.mthsvendas.dto.SaleSucessDTO;
import com.matheus.mthsvendas.dto.SaleSumDTO;
import com.matheus.mthsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.matheus.mthsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))" +
            " FROM Sale AS obj GROUP BY  obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.matheus.mthsvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))" +
            " FROM Sale AS obj GROUP BY  obj.seller")
    List<SaleSucessDTO> sucessGroupedBySeller();
}