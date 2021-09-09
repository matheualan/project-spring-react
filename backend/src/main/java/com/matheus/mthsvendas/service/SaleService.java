package com.matheus.mthsvendas.service;

import com.matheus.mthsvendas.dto.SaleDTO;
import com.matheus.mthsvendas.dto.SaleSucessDTO;
import com.matheus.mthsvendas.dto.SaleSumDTO;
import com.matheus.mthsvendas.entities.Sale;
import com.matheus.mthsvendas.repositories.SaleRepository;
import com.matheus.mthsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSucessDTO> sucessGroupedBySeller() {
        return repository.sucessGroupedBySeller();
    }
}
