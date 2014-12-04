
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author IRLEI
 */
public class Banco {
    
   private static String SENHA = "123456"; 
   private static String USER   = "root";
   private static String BANCO = "jdbc:mysql://localhost:3306/teste";
   
    public static void exibeCargo(JComboBox comboBox) throws SQLException {      
        try {
            Connection conexao  = DriverManager.getConnection(BANCO,USER,SENHA);            
            ResultSet rs = conexao.createStatement().executeQuery("SELECT cargo FROM empresa_teste"); // SELECIONE OS DADOS DA TABELA QUE VOCE QUER MOSTRAR
            while (rs.next()) {
                comboBox.addItem(rs.getString("cargo")); //CARREGANDO A COMBOBOX COM OS DADOS
             }  
            conexao.close();
        } catch (SQLException e) {
            
            
            JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR!\n VEREFIQUE SE:\nO Driver do MySql conector foi adicionado ao projeto;\n"
                    + "A tabela enpresa_teste foi criada com o scriptsql presente no projeto;\n"
                    + "Usuario e senha estão corretos;\n\n"
                    + ""
                    + "Resumo:\nConexão:   "+BANCO+"\n User:   "+USER+"\nSenha:  "+SENHA+""); 

        }        
    }
}
    
       
