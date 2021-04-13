package org.o7planning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Taxpayer")
public class TaxpayerEntity extends BaseEntity {

    @Column(name = "code_tax")
    private String codeTax;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birth_day")
    private Date birthDay;

    @Column(name = "address")
    private String address;

    @Column(name = "cmt")
    private String cmt;

    @Column(name = "recent_date_payment")
    private Date recentDatePayment;

    public TaxpayerEntity() {
    }

    public TaxpayerEntity(String codeTax, String fullName, Date birthDay, String address, String cmt, Date recentDatePayment) {
        this.codeTax = codeTax;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
        this.cmt = cmt;
        this.recentDatePayment = recentDatePayment;
    }

    public String getCodeTax() {
        return codeTax;
    }

    public void setCodeTax(String codeTax) {
        this.codeTax = codeTax;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public Date getRecentDatePayment() {
        return recentDatePayment;
    }

    public void setRecentDatePayment(Date recentDatePayment) {
        this.recentDatePayment = recentDatePayment;
    }
}
