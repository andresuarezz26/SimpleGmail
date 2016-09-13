package com.icesi.gmailsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import adapter.MailAdapter;
import model.Mail;
import utils.DividerItemDecoration;

public class MainActivity extends AppCompatActivity {

    //Parametros
    private RecyclerView mRecyclerView;
    private MailAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList <Mail> listaMails;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main );

        //Inicializar el recyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);

        //Setear el layoutManager
        mRecyclerView.setLayoutManager(mLayoutManager);

        listaMails = new ArrayList<Mail>(  );

        crearMails( );

        mRecyclerView.addItemDecoration( new DividerItemDecoration( this, LinearLayoutManager.VERTICAL ) );


        //Inicializar el Adapter con la lista de datos del clima
        adapter = new MailAdapter(listaMails);

        //asignar el adapter al RecyclerView
        mRecyclerView.setAdapter(adapter);
    }

    public void crearMails ()
    {

        //Crear los mails
        Mail mail1= new Mail.MailBuilder()
                .imagenFavorito( R.mipmap.ic_launcher )
                .imagenRemitente( R.mipmap.mark )
                .nombreRemitente( "Mark Zuckerberg" )
                .asunto( "Necesito alguien como usted en Facebook" )
                .inicioMail( "Hola Javier, de verdad que necesito alguien que maneje Meta4" )
                .fecha("4:00 pm")
                .build();

        Mail mail2= new Mail.MailBuilder()
                .imagenFavorito( R.mipmap.ic_launcher )
                .imagenRemitente( R.mipmap.mark )
                .nombreRemitente( "Mark Zuckerberg" )
                .asunto( "Re: Oferta Meta4" )
                .inicioMail( "Hola Javier, te queremos contratarar porque se nos fue nuestro experto en Meta4" )
                .fecha("3:55 pm")
                .build();

        Mail mail3= new Mail.MailBuilder()
                .imagenFavorito( R.mipmap.ic_launcher )
                .imagenRemitente( R.mipmap.mark )
                .nombreRemitente( "Mark Zuckerberg" )
                .asunto( "Oferta Meta4 " )
                .inicioMail( "Hola Javier, te queremos contrata..." )
                .fecha("3:50 pm")
                .build();

        Mail mail4= new Mail.MailBuilder()
                .imagenFavorito( R.mipmap.ic_launcher )
                .imagenRemitente( R.mipmap.messi )
                .nombreRemitente( "Lio Messi" )
                .asunto( "Partido " )
                .inicioMail( "Hola Javi, cuándo me sacas un equipito ?" )
                .fecha("3:30 pm")
                .build();

        Mail mail5= new Mail.MailBuilder()
                .imagenFavorito( R.mipmap.favorito_seleccionado )
                .imagenRemitente( R.mipmap.santos )
                .nombreRemitente( "Juan Ma" )
                .asunto( "Vota por el Sí " )
                .inicioMail( "El próximo 23 te espero para que votes por la paz Javi" )
                .fecha("3:20 pm")
                .build();

        //Agregar los mails a la lista de mails
        listaMails.add(mail1);
        listaMails.add(mail2);
        listaMails.add(mail3);
        listaMails.add(mail4);
        listaMails.add(mail5);
        listaMails.add(mail3);
        listaMails.add(mail3);
        listaMails.add(mail5);
        listaMails.add(mail4);
        listaMails.add(mail5);
        listaMails.add(mail2);
        listaMails.add(mail5);
        listaMails.add(mail3);
        listaMails.add(mail4);
        listaMails.add(mail5);
        listaMails.add(mail5);

    }
}
