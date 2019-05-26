package cibertec.dam1.lp01_t5am;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView tvProducto, tvTipo, tvStock, tvPrecio;
    ImageView ivFoto;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        this.tvProducto = findViewById(R.id.producto);
        this.tvTipo = findViewById(R.id.tipo);
        this.tvStock = findViewById(R.id.stock);
        this.tvPrecio = findViewById(R.id.precio);
        this.ivFoto = findViewById(R.id.foto);

        Bundle bundle = getIntent().getExtras();
        String producto = bundle.getString("producto");
        String tipo = bundle.getString("tipo");
        String stock = bundle.getString("stock");
        String precio = bundle.getString("precio");
        int foto = this.getResources().getIdentifier(bundle.getString("foto"), "mipmap", getPackageName());
        this.ivFoto.setImageResource(foto);

        this.tvProducto.setText(producto);
        this.tvPrecio.setText(precio);
        this.tvStock.setText(stock);
        this.tvTipo.setText(tipo);
        this.ivFoto.setImageResource(foto);

        /*
        2.- Inicializar los componentes del activity_detalle que han sido declarados en el paso 1
        3.- Obtener el objeto Bundle del Intent
        4.- Asignar los valores obtenidos del objeto Bundle a los componentes respectivos
        5.- Para mostrar la foto apoyarse en estas dos lineas de codigo

            int idFoto = this.getResources().getIdentifier(bundle.getString("nombreFoto"), "mipmap", getPackageName());
            this.ivDetalleFoto.setImageResource(idFoto);

            Reemplazar el "nombreFoto" y ivDetalleFoto por los nombres que hayan puesto en sus proyectos
         */


    }
}
