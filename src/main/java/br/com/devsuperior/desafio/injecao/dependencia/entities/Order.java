package br.com.devsuperior.desafio.injecao.dependencia.entities;

public class Order {

    private int code;
    private double basic;
    private double dicount;


    public Order() {

    }

    public Order(int code, double basic, double dicount) {
        this.code = code;
        this.basic = basic;
        this.dicount = dicount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDicount() {
        return dicount;
    }

    public void setDicount(double dicount) {
        this.dicount = dicount;
    }
}
