package POO.introducao.exercicioimposto;

public class Imposto {
    private String nome;
    private double salario;
    
    
    public Imposto(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double calcularIrpf(){
        double imposto = 0;
        if (salario <= 1903.98) {
            imposto = 0.0; // Isento
        } else if (salario <= 2826.65) {
            imposto = (salario - 1903.98) * 0.075;
        } else if (salario <= 3751.05) {
            imposto = ((salario - 2826.65) * 0.15) + (2826.65 - 1903.98) * 0.075;
        } else if (salario <= 4664.68) {
            imposto = ((salario - 3751.05) * 0.225) + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        } else {
            imposto = ((salario - 4664.68) * 0.275) + (4664.68 - 3751.05) * 0.225 +
                    (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        }
    return imposto;
    }
        
    }






