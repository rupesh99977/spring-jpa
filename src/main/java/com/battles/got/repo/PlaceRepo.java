package com.battles.got.repo;

import com.battles.got.entity.King;
import com.battles.got.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlaceRepo extends JpaRepository<Place, Long> {
    @Query("from Place where LOCATION=location and REGION=region")
    public Place ifPlaceExist(@Param("location") String location, @Param("region") String region);

}
