package org.o7planning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Configuration")
public class ConfigurationEntity extends BaseEntity{

    @Column(name = "parameter5_10")
    private Double parameter5_10;

    @Column(name = "parameter10_18")
    private Double parameter10_18;

    @Column(name = "parameter18_32")
    private Double parameter18_32;

    @Column(name = "parameter32_52")
    private Double parameter32_52;

    @Column(name = "parameter52_80")
    private Double parameter52_80;

    @Column(name = "parameter80")
    private Double parameter80;

    public ConfigurationEntity() {
    }

    public ConfigurationEntity(Double parameter5_10, Double parameter10_18, Double parameter18_32, Double parameter32_52, Double parameter52_80, Double parameter80) {
        this.parameter5_10 = parameter5_10;
        this.parameter10_18 = parameter10_18;
        this.parameter18_32 = parameter18_32;
        this.parameter32_52 = parameter32_52;
        this.parameter52_80 = parameter52_80;
        this.parameter80 = parameter80;
    }

    public Double getParameter5_10() {
        return parameter5_10;
    }

    public void setParameter5_10(Double parameter5_10) {
        this.parameter5_10 = parameter5_10;
    }

    public Double getParameter10_18() {
        return parameter10_18;
    }

    public void setParameter10_18(Double parameter10_18) {
        this.parameter10_18 = parameter10_18;
    }

    public Double getParameter18_32() {
        return parameter18_32;
    }

    public void setParameter18_32(Double parameter18_32) {
        this.parameter18_32 = parameter18_32;
    }

    public Double getParameter32_52() {
        return parameter32_52;
    }

    public void setParameter32_52(Double parameter32_52) {
        this.parameter32_52 = parameter32_52;
    }

    public Double getParameter52_80() {
        return parameter52_80;
    }

    public void setParameter52_80(Double parameter52_80) {
        this.parameter52_80 = parameter52_80;
    }

    public Double getParameter80() {
        return parameter80;
    }

    public void setParameter80(Double parameter80) {
        this.parameter80 = parameter80;
    }
}
