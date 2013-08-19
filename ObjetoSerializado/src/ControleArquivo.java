
/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Irlei
 */

import java.io.*;
public class ControleArquivo {

    public void salvar(Cliente cliente) {

        try {
            //Gera o arquivo para armazenar o objeto
            FileOutputStream arquivoGrav = new FileOutputStream("D:/java/cliente.bin");
            //Classe responsavel por inserir os objetos
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            //Grava o objeto cliente no arquivo
            objGravar.writeObject(cliente);
            objGravar.flush(); // os dados foram salvos  então vamos "limpar" a memória               
            arquivoGrav.flush();

            objGravar.close();
            arquivoGrav.close(); // fechando o arquivo

            System.out.println("Objeto gravado com sucesso!");
        } catch (Exception e) {
           System.out.println(e.getMessage()); // log do erro
        }

    }

    public Cliente lerArquivo() {

        Cliente cli = null;
        try {
            //Carrega o arquivo
            FileInputStream arquivoLeitura = new FileInputStream("D:/java/cliente.bin");
            //Classe responsavel por recuperar os objetos do arquivo
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            cli = (Cliente) objLeitura.readObject(); // recupara o Objeto 
            objLeitura.close();
            arquivoLeitura.close();// fecha o arquivo
            System.out.println("Objeto recuperado com sucesso!");
            return cli;  // retorna o Objeto do arquivo
        } catch (IOException | ClassNotFoundException e) {
          System.out.println(e.getMessage());// log do erro
        
        }
        return cli; // caso objeto não exita retorna null
    }
}
