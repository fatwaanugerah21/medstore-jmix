package com.company.medstore.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "IMPORT_TO_BIG_STORAGE")
@Entity
public class ImportToBigStorage {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull(message = "{msg://ImportToBigStorage.products.validation.NotNull}")
    @OneToMany(mappedBy = "importToBigStorage")
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}