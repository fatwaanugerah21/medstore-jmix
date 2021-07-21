package com.company.medstore.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Table(name = "LOT")
@JmixEntity
@Entity
public class Lot {

    @Column(name = "UUID", nullable = false)
    @JmixGeneratedValue
    @Id
    private UUID uuid;

    @Column(nullable = false)
    @JmixProperty(mandatory = true)
    @InstanceName
    @NotNull
    private Date exp_date;

    @Column(nullable = false)
    @JmixProperty(mandatory = true)
    @NotNull
    private Integer quantity;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getExp_date() {
        return exp_date;
    }

    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }

}