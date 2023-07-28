package Constructorr;

public class Character {


        private String nombrePersonaje;
        private int vida;

        private int damage;

        private int costoElixir;

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCostoElixir() {
        return costoElixir;
    }

    public void setCostoElixir(int costoElixir) {
        this.costoElixir = costoElixir;
    }

    public Character(String nombrePersonaje, int vida, int damage, int costoElixir) {
        this.nombrePersonaje = nombrePersonaje;
        this.vida = vida;
        this.damage = damage;
        this.costoElixir = costoElixir;
    }

    {

    }

}
