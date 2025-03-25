package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductoService {
    private final ProductoRepository productoRepository;
    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
        initSampleData();
    }
    private void initSampleData() {
        Producto p1 = new Producto("Silla", "Mueble", 50);
        Producto p2 = new Producto("Plato", "Plato", 50);
        Producto p3 = new Producto("Manzana", "Fruta", 5);

        save(p1);
        save(p2);
        save(p3);


    }
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }
    public Producto findById(String id) {
        return productoRepository.findById(id);
    }
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }
    public Producto update(Producto producto) {
        return productoRepository.update(producto);
    }
    public void deleteById(String id) {
        productoRepository.deleteById(id);
    }
    public List<Producto> buscarPorFiltros(String nombreProducto, String tipoProducto) {
        return productoRepository.buscarPorFiltros(nombreProducto, tipoProducto);
    }
}




