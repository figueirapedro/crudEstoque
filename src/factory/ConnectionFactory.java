// situa em qual package ou ?pacote? est� a classe 
package factory;
// faz as importa��es de classes necess�rias para o funcionamento do programa 

import java.sql.Connection;
// conex�o SQL para Java 
import java.sql.DriverManager;
// driver de conex�o SQL para Java 
import java.sql.SQLException;
// classe para tratamento de exce��es 

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10398590", "sql10398590", "k8Zu6UaKKw");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
