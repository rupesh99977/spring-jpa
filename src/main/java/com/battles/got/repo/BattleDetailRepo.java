package com.battles.got.repo;

import com.battles.got.entity.BattleDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattleDetailRepo extends JpaRepository<BattleDetail, Long> {
    public BattleDetail findBybattleNumber(String battleNo);
}
