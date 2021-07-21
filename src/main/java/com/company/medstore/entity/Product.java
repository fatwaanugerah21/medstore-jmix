package com.company.medstore.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "PRODUCT")
@Entity
public class Product {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME", nullable = false, unique = true)
    @NotNull
    private String name;

    @Column(name = "ABBR", nullable = false, length = 50)
    @NotNull
    private String abbr;

    @Column(name = "BIG_UNIT_QUANTITY")
    private Integer big_unit_quantity;

    @Column(name = "BIG_UNIT_PRICE")
    private Integer big_unit_price;

    @Column(name = "SMALL_UNIT_QUANTITY")
    private Integer small_unit_quantity;

    @Column(name = "SMALL_UNIT_PRICE")
    private Integer small_unit_price;

    @Column(name = "PRODUCT_ABBREVIATION")
    private Integer product_abbreviation;

    @JoinColumn(name = "IMPORT_TO_BIG_STORAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ImportToBigStorage importToBigStorage;

    public ImportToBigStorage getImportToBigStorage() {
        return importToBigStorage;
    }

    public void setImportToBigStorage(ImportToBigStorage importToBigStorage) {
        this.importToBigStorage = importToBigStorage;
    }

    public Integer getProduct_abbreviation() {
        return product_abbreviation;
    }

    public void setProduct_abbreviation(Integer product_abbreviation) {
        this.product_abbreviation = product_abbreviation;
    }

    public Integer getSmall_unit_price() {
        return small_unit_price;
    }

    public void setSmall_unit_price(Integer small_unit_price) {
        this.small_unit_price = small_unit_price;
    }

    public Integer getSmall_unit_quantity() {
        return small_unit_quantity;
    }

    public void setSmall_unit_quantity(Integer small_unit_quantity) {
        this.small_unit_quantity = small_unit_quantity;
    }

    public Integer getBig_unit_price() {
        return big_unit_price;
    }

    public void setBig_unit_price(Integer big_unit_price) {
        this.big_unit_price = big_unit_price;
    }

    public Integer getBig_unit_quantity() {
        return big_unit_quantity;
    }

    public void setBig_unit_quantity(Integer big_unit_quantity) {
        this.big_unit_quantity = big_unit_quantity;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}