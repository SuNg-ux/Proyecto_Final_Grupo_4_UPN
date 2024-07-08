package com.icodeap.ecommerce.infrastructure.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ordersproducts")
public class OrderProdcutEntity {
    @EmbeddedId
    private OrderProductPK pk;
    private Integer quantity;

}
