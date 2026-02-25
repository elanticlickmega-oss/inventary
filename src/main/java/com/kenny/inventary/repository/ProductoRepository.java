package com.kenny.inventary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenny.inventary.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}