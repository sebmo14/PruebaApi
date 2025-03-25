package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;


    @Repository
    public class ProductoRepository {
        private final List<Producto> baseDeDatos = new ArrayList<>();

        public Producto save(Producto producto) {
            baseDeDatos.add(producto);
            return producto;
        }

        public Producto findById(String id) {
            for (Producto producto : baseDeDatos) {
                if (producto.getId().equals(id)) {
                    return producto;
                }
            }
            return null;
        }

        public List<Producto> findAll() {
            return new ArrayList<>(baseDeDatos);
        }

        public void deleteById(String id) {
            for (int i = 0; i < baseDeDatos.size(); i++) {
                if (baseDeDatos.get(i).getId().equals(id)) {
                    baseDeDatos.remove(i);
                    return;
                }
            }
        }

        public Producto update(Producto producto) {
            for (int i = 0; i < baseDeDatos.size(); i++) {
                if (baseDeDatos.get(i).getId().equals(producto.getId())) {
                    baseDeDatos.set(i, producto);
                    return producto;
                }
            }
            return null;
        }

        public List<Producto> buscarPorFiltros(String nombreProducto, String tipoProducto) {
            List<Producto> resultado = new ArrayList<>();
            for (Producto producto : baseDeDatos) {
                boolean coincideNombre = (nombreProducto == null ||
                        producto.getNombreProducto().contains(nombreProducto));
                boolean coincideEmail = (tipoProducto == null ||
                        producto.getTipoProducto().contains(tipoProducto));
                if (coincideNombre && coincideEmail) {
                    resultado.add(producto);
                }
            }
            return resultado;
        }


    }

