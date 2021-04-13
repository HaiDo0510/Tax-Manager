package org.o7planning.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "organization_tax")
public class OrganizationTaxEntity extends BaseEntity{

    @Column(name = "code_tax")
    private String codeTax;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "year_of_incorporation")
    private Integer yearOfIncorporation;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "recent_date_payment")
    private Date recentDatePayment;
}
