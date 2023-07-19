package org.rgil.sesion08.ejemplo02;

public interface Consultable {
    //buscar toso los usuarios alamcenados
    public Usuario[] findAll();
    // buscar los usuarios por su identificativo
    public Usuario findByID(int id);
    //guardar un usaurio
    public int save(Usuario usuario);
    //Actualizacion de los datos de un usuario
    public boolean update (int id, Usuario usuario);
    //Borrar los datos de un usuario mt su id
    public boolean delete(int id);


}
