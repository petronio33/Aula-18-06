/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

/**
 *
 * @author Luciano
 */
public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Sam");
        PessoaJuridica j = new PessoaJuridica("123ME", "9999000");
        PessoaFisica pf = new PessoaFisica("Thais", "9999999");
        System.out.println(j.getNome());
        System.out.println(pf.getNome());
    }

}
