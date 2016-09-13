package adapter;

/**
 * Created by gerardosuarez on 13/09/16.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.icesi.gmailsimple.R;

import java.util.ArrayList;

import model.Mail;

/**
 * Created by 1143847755 on 02/09/2016.
 */
public class MailAdapter extends RecyclerView.Adapter <MailAdapter.ViewHolder> {

    private ArrayList <Mail> listaMails;

    public MailAdapter(ArrayList <Mail> listaMails)
    {
        this.listaMails = listaMails;
    }

    /**
     * Se "infla" la vista con los elementos del layout que representa cada item del Cardview
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        //Relacionar los elementos graficos del cardview con la clase itemView
        View itemView = LayoutInflater.from( parent.getContext( ) )
                .inflate( R.layout.mail_item, parent, false );
        //Asignar el view que tiene los cardview a nuestra clase ViewHolder
        ViewHolder viewHolder = new ViewHolder( itemView );
        //retornar nuestro viewHolder
        return viewHolder;
    }

    /**
     * Relacionar los elementos del arreglo con el viewHolder
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(MailAdapter.ViewHolder holder, int position)
    {
        holder.imagenRemitente.setBackgroundResource( listaMails.get(position).getImagenRemitente() );
        holder.nombreRemitente.setText( listaMails.get(position).getNombreRemitente() );
        holder.asunto.setText( listaMails.get(position).getAsunto() );
        holder.inicioMail.setText( listaMails.get(position).getInicioMail() );
        holder.fecha.setText( listaMails.get(position).getFecha() );
        holder.imagenFavorito.setBackgroundResource( listaMails.get(position).getImagenFavorito() );
    }

    /**
     * Clase que representa los atributos del CardView
     */
    class ViewHolder extends  RecyclerView.ViewHolder
    {
        public ImageView imagenRemitente;
        public TextView nombreRemitente;
        public TextView asunto;
        public TextView inicioMail;
        public TextView fecha;
        public ImageView imagenFavorito;


        public ViewHolder(View itemView)
        {
            super(itemView);
            //Inicializar los atributos
            imagenRemitente = (ImageView)itemView.findViewById(R.id.imagen_remitente);
            nombreRemitente = (TextView)itemView.findViewById(R.id.texto_nombre_remitente);
            asunto = (TextView)itemView.findViewById(R.id.texto_asunto);
            inicioMail = (TextView)itemView.findViewById(R.id.texto_inicio_mail);
            fecha = (TextView)itemView.findViewById(R.id.texto_fecha);
            imagenFavorito = (ImageView)itemView.findViewById(R.id.imagen_favorito);
        }
    }

    @Override
    public int getItemCount()
    {
        return listaMails.size();
    }
}
