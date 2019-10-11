<%-- 
    Document   : login
    Created on : Oct 11, 2019, 4:02:36 PM
    Author     : Alexandra Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body>
        
            <div class="container py-5">
                <div class="row">
                    <div class="col-md-12">
                        <h2 class="text-center text-white mb-4">Bootstrap 4 Login Form</h2>
                        <div class="row">
                            <div class="col-md-6 mx-auto">

                                <!-- form card login -->
                                <div class="card rounded-0">
                                    <div class="card-header">
                                        <h3 class="mb-0">Login</h3>
                                    </div>
                                    <div class="card-body">
                                        <form class="form" role="form" autocomplete="off" novalidate="" method="POST" action="LoginController">
                                            <div class="form-group">
                                                <label for="uname1">Username</label>
                                                <input type="text" class="form-control form-control-lg rounded-0" name="txtUser" required="">
                                                <div class="invalid-feedback">Oops, you missed this one.</div>
                                            </div>
                                            <div class="form-group">
                                                <label>Password</label>
                                                <input type="password" class="form-control form-control-lg rounded-0" name="txtPass" required="">
                                                <div class="invalid-feedback">Enter your password too!</div>
                                            </div>
                                            <div>
                                                <label class="custom-control custom-checkbox">
                                                    <input type="checkbox" class="custom-control-input">
                                                    <span class="custom-control-indicator"></span>
                                                </label>
                                            </div>
                                            <button type="submit" class="btn btn-success btn-lg float-right" name="btnIniciar">Iniciar Sesion</button>
                                        </form>
                                    </div>
                                    <!--/card-block-->
                                </div>
                                <!-- /form card login -->

                            </div>


                        </div>
                        <!--/row-->

                    </div>
                    <!--/col-->
                </div>
                <!--/row-->
            </div>
            <!--/container-->
            
            <%
                HttpSession sesion = request.getSession();
                int nivel = 0;
                if(request.getAttribute("nivel") != null){
                    nivel = (Integer)request.getAttribute("nivel");
                    if(nivel == 1){
                        sesion.setAttribute("nombre", request.getAttribute("nivel"));
                        sesion.setAttribute("nivel", nivel);
                        response.sendRedirect("Dashboard.jsp");
                    }
                }
            %>
                    
    </body>
</html>
