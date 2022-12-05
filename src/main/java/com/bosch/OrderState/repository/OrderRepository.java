package com.bosch.OrderState.repository;

import com.bosch.OrderState.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<ProductOrder, String> {

    Optional<ProductOrder> findByProductOrderId(String productOrderId);
}
