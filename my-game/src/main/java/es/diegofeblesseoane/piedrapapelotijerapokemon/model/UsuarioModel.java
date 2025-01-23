package es.diegofeblesseoane.piedrapapelotijerapokemon.model;

public class UsuarioModel {
    String codigo;
    String nombre;
    //.. cualquier otra propiedad
    // constructores toString equals

    public UsuarioModel(String codigo) {
        this.codigo = codigo;
    }

    public UsuarioModel(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }


    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }


}
