package com.battles.got.controller;

import com.battles.got.entity.BattleDetail;
import com.battles.got.entity.Place;
import com.battles.got.repo.PlaceRepo;
import com.battles.got.service.BattleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getinfo")
public class GotDataController {

    @Autowired
    BattleDetailService battleDetailService;
    @Autowired
    PlaceRepo placeRepo;

    @RequestMapping(value = "/location", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Place> getPlaces() {
        return placeRepo.findAll();
    }

    @RequestMapping(value = "/location/count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long getPlacesCount() {
        return placeRepo.count();
    }

    @RequestMapping(value = "/battle/info", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, params = {"battleNo"})
    public BattleDetail getBattleDetail(@RequestParam(required = true) String battleNo) {
        return battleDetailService.getBattleDetail(battleNo);
    }

}
