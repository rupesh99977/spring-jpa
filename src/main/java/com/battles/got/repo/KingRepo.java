package com.battles.got.repo;

import com.battles.got.entity.King;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface KingRepo extends JpaRepository<King, Long> {

    @Query(value = "select * from King where NAME=:name and HOUSE=:house limit 1", nativeQuery = true)
    public King ifKingExist(@Param("name") String name, @Param("house") String house);
}
