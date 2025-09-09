public class VeiculosRegistro {
    private String modelo;
    private String marca;
    private Integer ano;
    private int placa;
    private String cor;
    private Integer id;


    public VeiculosRegistro(String test) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public int getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getId() {
        return id;
    }


    public void mostrarInformacoesCarro(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Id: " + id);
    }

}

