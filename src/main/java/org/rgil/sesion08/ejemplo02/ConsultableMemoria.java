package org.rgil.sesion08.ejemplo02;

public class ConsultableMemoria implements Consultable {

    private Usuario[] usuarios;
    private int numUsuarios;

    ConsultableMemoria() {
        usuarios = new Usuario[10];
        numUsuarios = 0;
    }

    @Override
    public Usuario[] findAll() {
        return usuarios;
    }

    @Override
    public Usuario findByID(int id) {
        return usuarios[id];
    }

    @Override
    public int save(Usuario usuario) {
        usuarios[numUsuarios] = usuario;
        usuario.setId(numUsuarios);
        numUsuarios++;
        return numUsuarios;
    }

    @Override
    public boolean update(int id, Usuario usuario) {
        usuarios[id] = usuario;
        return true;
    }

    @Override
    public boolean delete(int id) {
        return true;
    }
}
