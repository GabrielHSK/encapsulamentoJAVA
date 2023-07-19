package scr;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void sexo(String sexo){
        if (sexo == "F"){
            this.sexo = "Feminino";
        }
        else{
            this.sexo = "Masculino";
        }
         }

       public String getSexo() {
        return sexo;
    }

public void imprimirPessoa(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }
}