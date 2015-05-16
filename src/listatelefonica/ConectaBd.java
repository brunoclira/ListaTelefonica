package listatelefonica;

import java.sql.*;//o "*" quer dizer q importa todos os metodos de java.sql
import javax.swing.JOptionPane;

public class ConectaBd {
    
    public static Connection conectabd() throws ClassNotFoundException{
    
       try {
            // TODO add your handling code here:
            
            //Classe que conecta com o BD 
            Class.forName("com.mysql.jdbc.Driver");
            
            //Variável de conexão
            Connection con;
            
            //metodos e parametros para conectar com o Banco de Dados
            //nome do BD , usuário do BD, senha do BD
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/ListaTelefonica", "root", "rootmysql");
            
            //con.statement = con.connection.createStatement();
            //Se conectar conectar com sucesso ele exibe a msg antes de abrir o frame
            //Testar conexão
            //JOptionPane.showMessageDialog(null, "Conexão estabelecida com Banco de Dados!");
                    
            return con;
            
       } catch (SQLException error) {
            
           JOptionPane.showMessageDialog(null,error);
           
           return null;
           
       }
        
    }
    
}
