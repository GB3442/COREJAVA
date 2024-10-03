package Polymorphism;

import java.sql.*;
public class TestConncetion
{
    public static void main(String[] args) throws Exception{

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url="jdbc:oracle:thin:@localhost:1521:orcl";


            Connection con=DriverManager.getConnection(url,"govind","bhosle");

            if(con!=null){
                System.out.println("Conncetion is established");
            }
            else{
                System.out.println("Conncetion is not established");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
