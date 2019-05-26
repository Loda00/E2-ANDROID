package cibertec.dam1.lp01_t5am;

public class Producto {
    private String producto;
    private String precio;
    private String foto;
    private String tipo;
    private String stock;

    public Producto(String producto, String precio, String foto, String tipo, String stock) {
        this.producto = producto;
        this.precio = precio;
        this.foto = foto;
        this.tipo = tipo;
        this.stock = stock;
    }

    public String getProducto() {
        return producto;
    }

    public String getPrecio() {
        return precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getStock() {
        return stock;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
