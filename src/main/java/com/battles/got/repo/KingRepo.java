package com.battles.got.repo;

import com.battles.got.entity.King;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface KingRepo extends JpaRepository<King, Long> {

    @Query("from King where NAME=name and HOUSE=house")
    public King ifKingExist(@Param("name") String name, @Param("house") String house);
}
