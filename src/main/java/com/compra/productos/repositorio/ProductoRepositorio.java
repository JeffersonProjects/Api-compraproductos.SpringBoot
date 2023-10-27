package com.compra.productos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compra.productos.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
