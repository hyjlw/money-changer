package com.cloud.app.repository;


import com.cloud.app.domain.Currency;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;



public interface CurrencyRepository extends Repository<Currency, Long>
{
    @Query(value = "from Currency c where c.name=:name")
    Currency findByName(@Param("name") String name);
}