package cibertec.dam1.lp01_t5am;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lista;
    private ArrayList<Producto> listaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.llenarDatos();

        this.lista = (ListView) findViewById(R.id.lvLista);
        this.lista.setOnItemClickListener(this);

        Adapter adapter = new Adapter(this, R.layout.list_item, this.listaProductos);
        this.lista.setAdapter(adapter);
    }

    private void llenarDatos(){

        this.listaProductos = new ArrayList<Producto>();

        Producto producto = new Producto("Fresa","S/. 9.40","fresa", "Fruta", "10");
        this.listaProductos.add(producto);

        producto = new Producto("Galleta","S/. 0.50", "galleta", "Golosina", "50");
        this.listaProductos.add(producto);

        producto = new Producto("Gaseosa","S/. 5.00","gaseosa", "Bebida","30");
        this.listaProductos.add(producto);

        producto = new Producto("Leche", "S/. 3.40","leche", "Lacteo", "30");
        this.listaProductos.add(producto);

        producto = new Producto("Papaya", "S/. 5.50","papaya","Fruta", "30");
        this.listaProductos.add(producto);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Producto producto = this.listaProductos.get(position);

        Intent i = new Intent(this, DetalleActivity.class);
        i.putExtra("producto", producto.getProducto());
        i.putExtra("precio", producto.getPrecio());
        i.putExtra("foto", producto.getFoto());
        i.putExtra("tipo", producto.getTipo());
        i.putExtra("stock", producto.getStock());

        startActivity(i);
    }
}
