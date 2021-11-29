package com.battles.got.service;

import com.battles.got.entity.BattleDetail;
import com.battles.got.repo.BattleDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BattleDetailService {

    @Autowired
    BattleDetailRepo battleDetailRepo;

    public BattleDetail getBattleDetail(String battleNo) {
        return battleDetailRepo.findBybattleNumber(battleNo);
    }
}
