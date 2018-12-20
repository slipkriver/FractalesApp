
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 align="center">REGISTRO DE FRACTAL </h2>
        <form action="">
              <table border ="1" width="250" align="center">
                  <tr>
                      <td>Codigo:</td>
                      <td><input type="text" name="txtCod"</td>
                  </tr>
                   <tr>
                      <td>Tipo:</td>
                      <td><input type="text" name="txtTip"</td>
                  </tr>
                   <tr>
                      <td>Nombre:</td>
                      <td><input type="text" name="txtNom"</td>
                  </tr>
                   <tr>
                      <td>Descipción:</td>
                      <td><input type="text" name="txtDes"</td>
                  </tr>
                  <tr>
                      <th colspan="2">
                          <input type="submit" name="btnguardar" value="Guardar Fractal"></td>
                  </tr>
            </table>
              
              </form>
        <% 
        if (request.getParameter("btnguardar")!=null){ 
        String cod=request.getParameter("txtCod");
        String tipo=request.getParameter("txtTip");
        String nom=request.getParameter("txtNom");
        String des=request.getParameter("txtDes");
        
        
        String user="postgres";
        String password ="fractales";
        String driver="org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/fractalesBD"; 
        
        Connection conn=null;
        ResultSet rs=null;
        Statement sta=null;
        try {
        Class.forName(driver);
        conn=DriverManager.getConnection(url,user,password);
        sta=conn.createStatement();
        sta.executeUpdate("insert into fractal values('"+cod+"','"+nom+"','"+tipo+"','"+des+"')");
        out.print("Exito al conectar");
        }catch (Exception e){out.print(e+"");
        out.print("Error al conectar");}       
        }
        %>
    </body>
</html>
