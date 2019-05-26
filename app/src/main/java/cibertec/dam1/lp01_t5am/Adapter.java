package cibertec.dam1.lp01_t5am;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Producto> lista;

    public Adapter(Context context, int layout, List<Producto> lista) {
        this.context = context;
        this.layout = layout;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return this.lista.size();
    }

    @Override
    public Object getItem(int position) {
        return this.lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = LayoutInflater.from(this.context);
        v = inflater.inflate(R.layout.list_item, null);

        Producto p = this.lista.get(position);

        TextView producto = v.findViewById(R.id.tvProducto);
        TextView precio = v.findViewById(R.id.tvPrecio);
        ImageView foto = v.findViewById(R.id.ivFoto);

        producto.setText(p.getProducto());
        precio.setText(p.getPrecio());

        int icono = this.context.getResources().getIdentifier(p.getFoto(), "mipmap", context.getPackageName());
        foto.setImageResource(icono);

        return v;

    }
}
