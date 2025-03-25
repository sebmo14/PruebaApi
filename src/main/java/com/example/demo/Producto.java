package com.example.demo;
import java.util.UUID;

public class Producto {
    private String id, nombreProducto, tipoProducto;
    private int valorProducto;

    public Producto() {
        this.id = UUID.randomUUID().toString();
    }

    public Producto(String nombreProducto, String tipoProducto, int valorProducto) {
        this.id = UUID.randomUUID().toString();
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.valorProducto = valorProducto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }
}
