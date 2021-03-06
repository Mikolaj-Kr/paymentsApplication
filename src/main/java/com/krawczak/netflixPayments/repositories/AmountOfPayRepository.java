package com.krawczak.netflixPayments.repositories;

import com.krawczak.netflixPayments.domain.entity.AmountOfPay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AmountOfPayRepository extends JpaRepository<AmountOfPay, Integer> {

    AmountOfPay findAmountOfPayById(Long id);
}
