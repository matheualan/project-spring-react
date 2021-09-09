package com.matheus.mthsvendas.repositories;

import com.matheus.mthsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}