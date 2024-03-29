package com.emsi.billingservice.entities;

import com.emsi.billingservice.model.CustomerModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;

    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
    private Long customerID;

    @Transient
    private CustomerModel customerModel;
}
