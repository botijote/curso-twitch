package org.rgil.sesion08.ejemplo02;

public class ConsutableBBDD implements Consultable{
    @Override
    public Usuario[] findAll() {
        return new Usuario[0];
    }

    @Override
    public Usuario findByID(int id) {
        return null;
    }

    @Override
    public int save(Usuario usuario) {
        return 0;
    }

    @Override
    public boolean update(int id, Usuario usuario) {
        return false;
    }

    @Override
    public boolean delete(int in) {
        return false;
    }
}
