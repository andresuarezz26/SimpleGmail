package model;

/**
 * Created by gerardosuarez on 13/09/16.
 */
public class Mail {
    private int imagenRemitente;
    private String nombreRemitente;
    private String asunto;
    private String inicioMail;
    private String fecha;
    private int imagenFavorito;

    private Mail ( MailBuilder builder)
    {
        this.imagenRemitente = builder.imagenRemitente;
        this.nombreRemitente = builder.nombreRemitente;
        this.asunto = builder.asunto;
        this.inicioMail = builder.inicioMail;
        this.fecha = builder.fecha;
        this.imagenFavorito = builder.imagenFavorito;
    }


    public int getImagenRemitente() {

        return imagenRemitente;
    }

    public void setImagenRemitente( int imagenRemitente ) {

        this.imagenRemitente = imagenRemitente;
    }

    public String getNombreRemitente() {

        return nombreRemitente;
    }

    public void setNombreRemitente( String nombreRemitente ) {

        this.nombreRemitente = nombreRemitente;
    }

    public String getAsunto() {

        return asunto;
    }

    public void setAsunto( String asunto ) {

        this.asunto = asunto;
    }

    public String getInicioMail() {

        return inicioMail;
    }

    public void setInicioMail( String inicioMail ) {

        this.inicioMail = inicioMail;
    }

    public String getFecha() {

        return fecha;
    }

    public void setFecha( String fecha ) {

        this.fecha = fecha;
    }

    public int getImagenFavorito() {

        return imagenFavorito;
    }

    public void setImagenFavorito( int imagenFavorito ) {

        this.imagenFavorito = imagenFavorito;
    }

    public static class MailBuilder
    {
        private int imagenRemitente;
        private String nombreRemitente;
        private String asunto;
        private String inicioMail;
        private String fecha;
        private int imagenFavorito;

        public MailBuilder (){

        }

        public MailBuilder imagenRemitente (int imagenRemitente){
            this.imagenRemitente = imagenRemitente;
            return this;
        }

        public MailBuilder imagenFavorito (int imagenFavorito){
            this.imagenFavorito = imagenFavorito;
            return this;
        }

        public MailBuilder nombreRemitente (String nombreRemitente){
            this.nombreRemitente = nombreRemitente;
            return this;
        }

        public MailBuilder asunto (String asunto){
            this.asunto = asunto;
            return this;
        }
        public MailBuilder inicioMail (String inicioMail){
            this.inicioMail = inicioMail;
            return this;
        }
        public MailBuilder fecha (String fecha){
            this.fecha = fecha;
            return this;
        }

        public Mail build(){
            return new Mail(this);
        }
    }



}
