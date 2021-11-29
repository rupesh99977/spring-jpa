package com.battles.got.entity;

import javax.persistence.*;

@Entity
public class BattleDetail {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String year;
    @Column(unique = true, nullable = false)
    private String battleNumber;
    @OneToOne(targetEntity = King.class, cascade = CascadeType.ALL)
    private King attacker;
    @OneToOne(targetEntity = King.class, cascade = CascadeType.ALL)
    private King defender;
    private String attacker_2;
    private String attacker_3;
    private String attacker_4;
    private String defender_2;
    private String defender_3;
    private String defender_4;
    private String attacker_outcome;
    private String battle_type;
    private String major_death;
    private String major_capture;
    private String attacker_size;
    private String defender_size;
    private String attacker_commander;
    private String defender_commander;
    private String summer;
    @OneToOne(targetEntity = Place.class, cascade = CascadeType.ALL)
    private Place place;
    private String note;

    protected BattleDetail() {

    }

    public BattleDetail(String name, String year, String battleNumber, King attacker, King defender, String attacker_2, String attacker_3, String attacker_4, String defender_2, String defender_3, String defender_4, String attacker_outcome, String battle_type, String major_death, String major_capture, String attacker_size, String defender_size, String attacker_commander, String defender_commander, String summer, Place place, String note) {
        this.name = name;
        this.year = year;
        this.battleNumber = battleNumber;
        this.attacker = attacker;
        this.defender = defender;
        this.attacker_2 = attacker_2;
        this.attacker_3 = attacker_3;
        this.attacker_4 = attacker_4;
        this.defender_2 = defender_2;
        this.defender_3 = defender_3;
        this.defender_4 = defender_4;
        this.attacker_outcome = attacker_outcome;
        this.battle_type = battle_type;
        this.major_death = major_death;
        this.major_capture = major_capture;
        this.attacker_size = attacker_size;
        this.defender_size = defender_size;
        this.attacker_commander = attacker_commander;
        this.defender_commander = defender_commander;
        this.summer = summer;
        this.place = place;
        this.note = note;
    }

    public BattleDetail(String name, String year, String battleNumber, String attacker_2, String attacker_3, String attacker_4, String defender_2, String defender_3, String defender_4, String attacker_outcome, String battle_type, String major_death, String major_capture, String attacker_size, String defender_size, String attacker_commander, String defender_commander, String summer, String note) {
        this.name = name;
        this.year = year;
        this.battleNumber = battleNumber;
        this.attacker_2 = attacker_2;
        this.attacker_3 = attacker_3;
        this.attacker_4 = attacker_4;
        this.defender_2 = defender_2;
        this.defender_3 = defender_3;
        this.defender_4 = defender_4;
        this.attacker_outcome = attacker_outcome;
        this.battle_type = battle_type;
        this.major_death = major_death;
        this.major_capture = major_capture;
        this.attacker_size = attacker_size;
        this.defender_size = defender_size;
        this.attacker_commander = attacker_commander;
        this.defender_commander = defender_commander;
        this.summer = summer;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public King getAttacker() {
        return attacker;
    }

    public King getDefender() {
        return defender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAttacker(King attacker) {
        this.attacker = attacker;
    }

    public void setDefender(King defender) {
        this.defender = defender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBattle_number() {
        return battleNumber;
    }

    public void setBattle_number(String battleNumber) {
        this.battleNumber = battleNumber;
    }

    public King getAttacker_king() {
        return attacker;
    }

    public void setAttacker_king(King attacker) {
        this.attacker = attacker;
    }

    public King getDefender_king() {
        return defender;
    }

    public void setDefender_king(King defender) {
        this.defender = defender;
    }

    public String getAttacker_2() {
        return attacker_2;
    }

    public void setAttacker_2(String attacker_2) {
        this.attacker_2 = attacker_2;
    }

    public String getAttacker_3() {
        return attacker_3;
    }

    public void setAttacker_3(String attacker_3) {
        this.attacker_3 = attacker_3;
    }

    public String getAttacker_4() {
        return attacker_4;
    }

    public void setAttacker_4(String attacker_4) {
        this.attacker_4 = attacker_4;
    }

    public String getDefender_2() {
        return defender_2;
    }

    public void setDefender_2(String defender_2) {
        this.defender_2 = defender_2;
    }

    public String getDefender_3() {
        return defender_3;
    }

    public void setDefender_3(String defender_3) {
        this.defender_3 = defender_3;
    }

    public String getDefender_4() {
        return defender_4;
    }

    public void setDefender_4(String defender_4) {
        this.defender_4 = defender_4;
    }

    public String getAttacker_outcome() {
        return attacker_outcome;
    }

    public void setAttacker_outcome(String attacker_outcome) {
        this.attacker_outcome = attacker_outcome;
    }

    public String getBattle_type() {
        return battle_type;
    }

    public void setBattle_type(String battle_type) {
        this.battle_type = battle_type;
    }

    public String getMajor_death() {
        return major_death;
    }

    public void setMajor_death(String major_death) {
        this.major_death = major_death;
    }

    public String getMajor_capture() {
        return major_capture;
    }

    public void setMajor_capture(String major_capture) {
        this.major_capture = major_capture;
    }

    public String getAttacker_size() {
        return attacker_size;
    }

    public void setAttacker_size(String attacker_size) {
        this.attacker_size = attacker_size;
    }

    public String getDefender_size() {
        return defender_size;
    }

    public void setDefender_size(String defender_size) {
        this.defender_size = defender_size;
    }

    public String getAttacker_commander() {
        return attacker_commander;
    }

    public void setAttacker_commander(String attacker_commander) {
        this.attacker_commander = attacker_commander;
    }

    public String getDefender_commander() {
        return defender_commander;
    }

    public void setDefender_commander(String defender_commander) {
        this.defender_commander = defender_commander;
    }

    public String getSummer() {
        return summer;
    }

    public void setSummer(String summer) {
        this.summer = summer;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
