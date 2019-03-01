/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojava;

/**
 *
 * @author TI431
 */
public class Contato {

	private int Codigo;
	private String Nome;
	private String CPF;
	private String Fone;
        private char Sexo;
public void setNome(String n){
Nome=n;
}
public String getNome(){
return Nome;
}


public void setCodigo(int codigo){
Codigo=codigo;
}
public int getCodigo(){
return Codigo;
}


public void setCPF(String cpf){
CPF=cpf;
}
public String getCPF(){
return CPF;
}


public void setFone(String f){
Fone=f;
}
public String getFone(){
return Fone;
}

    /**
     * @return the Sexo
     */
    public char getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }


}
