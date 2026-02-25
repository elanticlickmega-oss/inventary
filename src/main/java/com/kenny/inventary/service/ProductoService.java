package com.kenny.inventary.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.kenny.inventary.entity.Producto;
import com.kenny.inventary.repository.ProductoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository productoRepository;

    // GET - Listar todos
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    // POST - Guardar
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    // PUT - Actualizar
    public Producto actualizar(Long id, Producto producto) {
        Producto existente = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        existente.setNombre(producto.getNombre());
        existente.setCantidad(producto.getCantidad());
        existente.setPrecio(producto.getPrecio());

        return productoRepository.save(existente);
    }

    // DELETE - Eliminar
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}
