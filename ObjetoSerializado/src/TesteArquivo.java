/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Irlei
 */
public class TesteArquivo {
    public static void main(String[] args) {
    
        Cliente cliente = new Cliente("Irlei", 29, "12345678");
    
        ControleArquivo arq = new ControleArquivo();
        
        arq.salvar(cliente);
        
        
        
        Cliente clienteCadastrado = arq.lerArquivo();
        
        System.out.println(clienteCadastrado.toString());
    }
}
