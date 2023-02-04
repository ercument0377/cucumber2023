package stepdefinitions.database_step_definitions;

import com.mongodb.DB;
import io.cucumber.java.en.*;
import utilities.DBUtils;

import java.sql.SQLException;

public class Read_Step_Definitions {
    @Given("user connects to the database")
    public void user_connects_to_the_database() {
        DBUtils.createConnection();
    }
    @Given("gets the {string} from {string} table")
    public void gets_the_from_table(String sutun, String table) {
    String sql = " Select " + sutun + " from "+ table ;

    DBUtils.executeQuery(sql);
    }
    @Given("user reads all of the {string} column data")
    public void user_reads_all_of_the_column_data(String column) throws SQLException {
      DBUtils.getResultset().absolute(6);
       Object sutunData = DBUtils.getResultset().getObject(column);
        System.out.println("sutunData = " + sutunData);

        DBUtils.getResultset().next(); // price in 6.satırındaydık burada 7.satıra geçtık

        Object sutunData7 = DBUtils.getResultset().getObject(column);
        System.out.println("sutunData7 = " + sutunData7);


//datayı string olarak da alabiliriz
      String sutunStringData =  DBUtils.getResultset().getString(column);
        System.out.println("sutunStringData = " + sutunStringData);

        while (DBUtils.getResultset().next()){
            System.out.println(DBUtils.getResultset().getString(column));
        }

    }
    @Then("close the connection")
    public void close_the_connection() {
        DBUtils.closeConnection();

    }



}

