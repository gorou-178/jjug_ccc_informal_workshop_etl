package com.example.demo.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jlg_code", length = 6, nullable = false)
    private String jlgCode;

    @Column(name = "old_postal_code", length = 5, nullable = false)
    private String oldPostalCode;

    @Column(name = "postal_code", length = 7, nullable = false)
    private String postalCode;

    @Column(name = "prefecture_kana", length = 50, nullable = false)
    private String prefectureKana;

    @Column(name = "city_kana", length = 50, nullable = false)
    private String cityKana;

    @Column(name = "town_kana", length = 50, nullable = false)
    private String townKana;

    @Column(name = "prefecture", length = 50, nullable = false)
    private String prefecture;

    @Column(name = "city", length = 50, nullable = false)
    private String city;

    @Column(name = "town", length = 50, nullable = false)
    private String town;

    @Column(name = "multiple_postal_codes", length = 1, nullable = false)
    private char multiplePostalCodes;

    @Column(name = "special_town_name", length = 1, nullable = false)
    private char specialTownName;

    @Column(name = "has_chome", length = 1, nullable = false)
    private char hasChome;

    @Column(name = "multiple_towns", length = 1, nullable = false)
    private char multipleTowns;

    @Column(name = "update_status", length = 1, nullable = false)
    private char updateStatus;

    @Column(name = "update_reason", length = 1, nullable = false)
    private char updateReason;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJlgCode() {
        return jlgCode;
    }

    public void setJlgCode(String jlgCode) {
        this.jlgCode = jlgCode;
    }

    public String getOldPostalCode() {
        return oldPostalCode;
    }

    public void setOldPostalCode(String oldPostalCode) {
        this.oldPostalCode = oldPostalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPrefectureKana() {
        return prefectureKana;
    }

    public void setPrefectureKana(String prefectureKana) {
        this.prefectureKana = prefectureKana;
    }

    public String getCityKana() {
        return cityKana;
    }

    public void setCityKana(String cityKana) {
        this.cityKana = cityKana;
    }

    public String getTownKana() {
        return townKana;
    }

    public void setTownKana(String townKana) {
        this.townKana = townKana;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public char getMultiplePostalCodes() {
        return multiplePostalCodes;
    }

    public void setMultiplePostalCodes(char multiplePostalCodes) {
        this.multiplePostalCodes = multiplePostalCodes;
    }

    public char getSpecialTownName() {
        return specialTownName;
    }

    public void setSpecialTownName(char specialTownName) {
        this.specialTownName = specialTownName;
    }

    public char getHasChome() {
        return hasChome;
    }

    public void setHasChome(char hasChome) {
        this.hasChome = hasChome;
    }

    public char getMultipleTowns() {
        return multipleTowns;
    }

    public void setMultipleTowns(char multipleTowns) {
        this.multipleTowns = multipleTowns;
    }

    public char getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(char updateStatus) {
        this.updateStatus = updateStatus;
    }

    public char getUpdateReason() {
        return updateReason;
    }

    public void setUpdateReason(char updateReason) {
        this.updateReason = updateReason;
    }
}
