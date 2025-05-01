package br.dio;

import br.dio.persistence.migration.MigrationStrategy;
import br.dio.ui.MainMenu;

import java.sql.SQLException;

import static br.dio.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
