package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;


@Entity
public class PortFolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private Date CreationDate;

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public PortFolio() {
    }

    public PortFolio(Date creationDate) {
        CreationDate = creationDate;
    }
}
