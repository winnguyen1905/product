package com.winnguyen1905.technologystore.entity;
import java.util.ArrayList;
import java.util.List;

 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "variations")
public class VariationEntity extends BaseEntityAudit {
    @Column(name = "variation_price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
    private List<InventoryEntity> inventories = new ArrayList<>();
}