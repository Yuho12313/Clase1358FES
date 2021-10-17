/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.modelo;

/**
 *
 * @author joser
 */
public class Empleado {
    private int id;
    private String Nombre;
    private String ApMaterno;
    private String ApPaterno;
    private float SueldoBase;
    private int aniodeingreso;
    private int horas;

    public Empleado() {
    }

    public Empleado(int id, String Nombre, String ApMaterno, String ApPaterno, float SueldoBase, int aniodeingreso, int horas) {
        this.id = id;
        this.Nombre = Nombre;
        this.ApMaterno = ApMaterno;
        this.ApPaterno = ApPaterno;
        this.SueldoBase = SueldoBase;
        this.aniodeingreso = aniodeingreso;
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public float getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(float SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public int getAniodeingreso() {
        return aniodeingreso;
    }

    public void setAniodeingreso(int aniodeingreso) {
        this.aniodeingreso = aniodeingreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + "\n Nombre=" + Nombre + "\n ApMaterno=" + ApMaterno + "\n ApPaterno=" + ApPaterno + "\n SueldoBase=" + SueldoBase + "\n aniodeingreso=" + aniodeingreso + "\n horas=" + horas + "}\n------------------------------------------\n";
    }
    
}
