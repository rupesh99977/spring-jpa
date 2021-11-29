package com.battles.got.serviceCommandLineRunner;

import com.battles.got.entity.BattleDetail;
import com.battles.got.entity.King;
import com.battles.got.entity.Place;
import com.battles.got.repo.BattleDetailRepo;
import com.battles.got.repo.KingRepo;
import com.battles.got.repo.PlaceRepo;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

@Component
public class KingCommandLineRunner implements CommandLineRunner {

    @Autowired
    private KingRepo kingRepo;
    @Autowired
    PlaceRepo placeRepo;
    @Autowired
    BattleDetailRepo battleDetailRepo;
    King attKing;
    King defKing;
    Place place;
    BattleDetail battleDetail;

    public static final Logger logger = LoggerFactory.getLogger(KingCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        Reader in = new FileReader(new File(getClass().getResource("/battles.csv").toURI()));
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
        for (CSVRecord record : records) {
            attKing = kingRepo.ifKingExist(record.get(3), record.get(5));
            defKing = kingRepo.ifKingExist(record.get(4), record.get(9));
            place = placeRepo.ifPlaceExist(record.get(22), record.get(23));
            battleDetail = new BattleDetail(record.get(0), record.get(1), record.get(2), record.get(6), record.get(7), record.get(8), record.get(10), record.get(11), record.get(12), record.get(13), record.get(14), record.get(15), record.get(16), record.get(17), record.get(18), record.get(19), record.get(20), record.get(21), record.get(24));
            if (attKing != null) {
                battleDetail.setAttacker(attKing);
            } else {
                attKing = kingRepo.save(new King(record.get(3), record.get(5)));
                battleDetail.setAttacker(attKing);
            }
            if (defKing != null) {
                battleDetail.setAttacker(defKing);
            } else {
                defKing = kingRepo.save(new King(record.get(4), record.get(9)));
                battleDetail.setDefender(defKing);
            }
            if (place != null) {
                battleDetail.setPlace(place);
            } else {
                place = placeRepo.save(new Place(record.get(22), record.get(23)));
                battleDetail.setPlace(place);
            }
            battleDetailRepo.save(battleDetail);
            System.out.println(battleDetail.getId());
            attKing = null;
            defKing = null;
            place = null;
            battleDetail = null;
        }

    }
}
