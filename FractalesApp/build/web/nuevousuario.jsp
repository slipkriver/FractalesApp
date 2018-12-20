
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 align="center">NUEVO USUARIO </h2>
        <form action="">
              <table border ="1" width="250" align="center">
                  <tr>
                      <td>Identificador:</td>
                      <td><input type="text" name="txtIde"</td>
                  </tr>
                   <tr>
                      <td>Nombre:</td>
                      <td><input type="text" name="txtNom"</td>
                  </tr>
                   <tr>
                      <td>Área:</td>
                      <td><input type="text" name="txtAre"</td>
                  </tr>
                   <tr>
                      <td>Telefono:</td>
                      <td><input type="text" name="txtTel"</td>
                  </tr>
                  <tr>
                      <td>Edad:</td>
                      <td><input type="text" name="txtEda"</td>
                  </tr>
                  <tr>
                      <td>Correo:</td>
                      <td><input type="text" name="txtCor"</td>
                  </tr>
                  <tr>
                      <th colspan="2">
                          <input type="submit" name="btnguardar" value="Registrarse"></td>
                  </tr>
            </table>
              
              </form>
        <% 
        if (request.getParameter("btnguardar")!=null){ 
        String ide=request.getParameter("txtIde");
        String nom=request.getParameter("txtNom");
        String are=request.getParameter("txtAre");
        String tel=request.getParameter("txtTel");
        String eda=request.getParameter("txtEda");
        String cor=request.getParameter("txtCor");
        
        
        
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
        sta.executeUpdate("insert into usuario values('"+ide+"','"+nom+"','"+are+"','"+tel+"','"+eda+"','"+cor+"')");
        out.print("Exito al conectar");
        }catch (Exception e){out.print(e+"");
        out.print("Error al conectar");}       
        }
        %>
    </body>
</html>