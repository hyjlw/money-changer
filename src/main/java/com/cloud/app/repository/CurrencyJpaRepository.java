package com.cloud.app.repository;

import com.cloud.app.domain.Currency;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CurrencyJpaRepository extends JpaRepository<Currency,Long> {

}