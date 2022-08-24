package com.shakir.jwt_and_angular.repository;

import com.shakir.jwt_and_angular.models.TradeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradesRepo extends JpaRepository<TradeModel, Integer> {


}
