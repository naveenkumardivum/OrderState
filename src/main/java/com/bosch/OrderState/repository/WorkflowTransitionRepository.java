package com.bosch.OrderState.repository;

import com.bosch.OrderState.model.OrderWorkflowTransition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkflowTransitionRepository extends JpaRepository<OrderWorkflowTransition, String> {


}
