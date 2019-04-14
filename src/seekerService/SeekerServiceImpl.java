package seekerService;

import utils.Event;
import utils.Provider;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Set;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Created by elainemnkubitu on 11/11/18.
 */
public class SeekerServiceImpl implements SeekerService{

    Connection conn = null;
    Statement stmt = null;

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";



    @Override
    public String addEvent(Event event) {

        try{

            Class.forName(JDBC_DRIVER);
            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            String sql =  "CREATE TABLE   EVENT " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        }
        catch(Exception se){
            se.printStackTrace();
        }
        return "Success";
    }

    @Override
    public void getMyEvents() {

    }

    @Override
    public void deleteMyEvent() {

    }

    @Override
    public void getMySelectedServices() {

    }

    @Override
    public Set<Provider> searchServiceProviders(String service){

        return null;
    }

}
