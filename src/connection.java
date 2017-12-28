/*
 * Main.java
 *
 * Created on November 3, 2005, 10:13 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author  shrirang_m
 */
 public class connection {
        public  connection con = null;
	private String driver = "jdbc";
	private String url="jdbc:mysql://localhost:3306/mysql";
	private ResultSet rst = null;
	private Statement stmt = null;

    /** Creates a new instance of connection_class */
    public connection() {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con = (connection) DriverManager.getConnection(url,"root","root");
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
			stmt = con.createStatement();
                        
           }
           
	public ResultSet executeQuery(String query) 
    {   try
        {   System.out.println(query)   ;
            rst = stmt.executeQuery(query);
            System.out.println("Executed Succesfully")   ;
        }
        catch(java.sql.SQLException sqle)
        {    sqle.printStackTrace()  ;
                System.out.println( this);
        }
        return rst;
    }

	public void executeUpdate(String query) 
    {   try 
        {   System.out.println(query)   ;
            stmt.executeUpdate(query);
            System.out.println("Executed Succesfully")   ;
        }
        catch(java.sql.SQLException sqle)
        {    sqle.printStackTrace()  ;
            // System.out.println( this);
        }
    }
 
        
        public connection getConnection()
        {
            return con;
        }

    private Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 
    
    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args)
    {
       connection  p=new connection();
       ResultSet rt=p.executeQuery("select * from db");
        try{
       rt.next();
        do
        {
           //System.out.println("gfskkfhn"); 
            System.out.print(rt.getObject(1)+"\t");
            //System.out.print(rt.getObject(2)+"\t");
         //   System.out.print(rt.getObject(3)+"\t");
           // System.out.print(rt.getObject(4)+"\t");
            //System.out.println("");
        }while(p.rst.next());
        }
        catch(Exception e)
        {
            
        }
    }
    
}
