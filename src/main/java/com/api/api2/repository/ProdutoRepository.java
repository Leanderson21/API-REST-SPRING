package com.api.api2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api2.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
