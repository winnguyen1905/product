package com.winnguyen1905.product.persistance.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonType;

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
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@SuperBuilder
@Table(name = "variations")
public class EProductVariant extends EBaseAudit {
  @Column(name = "variation_price")
  private Double price;

  @Column(name = "sku")
  String sku;

  @Type(JsonType.class)
  @Column(columnDefinition = "jsonb", name = "feature_values")
  private JsonNode featureValues;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private EProduct product;
}