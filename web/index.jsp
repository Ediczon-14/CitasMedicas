<%-- 
    Document   : index
    Created on : 12-may-2021, 14:59:12
    Author     : edicz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/style2.css">
    <title>Clinica Arequipa</title>
  </head>
  <body>
    <!-- header -->
    
    <nav class="navbar navbar-expand-lg navbar-light bg-primary">
        <a class="navbar-brand " href="index.jsp"><img src="img/logoAQP.png" width="100" height="80" alt=""><strong>Clinica Arequipa</strong></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto"></ul>
            <form class="form-inline my-2 my-lg-0 form-inline">
                <a class="nav-link" href="https://www.facebook.com/clinicarequipa/"><img src="img/img_fb.png" width="30" height="30" alt=""></a>
                <a class="nav-link" href="https://twitter.com/ClinicaArequipa"><img src="img/img_tw.png" width="30" height="30" alt=""></a>
            </form>
        </div>
    </nav>
    
    <main id="main">
        <div id="carousel" class="carousel slide carousel-fade" data-ride="carousel" data-pause="false">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/banner1.jpg" width="1000" height="800">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="img/banner2.jpg" width="1000" height="800">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="img/banner3.jpg" width="1000" height="800">
                </div>
                <div class="overlay">
                    <div class="container">
                        <div class="row align-items-center">
                            <div class="col-sm text-center">
                                <h1><i class="icon-user"></i></h1>
                                <a class="btn btn-primary mr-2" href="loginPaciente.jsp">Paciente</a>
                            </div>
                            <div class="col-sm text-center">
                                <h1><i class="icon-user-tie"></i></h1>
                                <a class="btn btn-primary mr-2" href="loginDoctor.jsp">Doctor</a>
                            </div>
                            <div class="col-sm text-center">
                                <h1><i class="icon-office"></i></h1>
                                <a class="btn btn-primary mr-2" href="loginAdmin.jsp">Administración</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <footer class="bg-primary text-white text-center text-lg-start">
        <!-- Grid container -->
        <div class="container p-4">
          <!--Grid row-->
          <div class="row">
            <!--Grid column-->
            <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
              <h5 class="text-uppercase">Nosotros</h5>

              <p>
                Clínica Arequipa S.A. se inauguró el 24 de junio 1972, la misma que ha venido funcionando de forma ininterrumpida por mas de 47 años.
                Somos una institución privada, dedicada a la Prestación de servicios de salud. Contamos con un staff de Médicos reconocidos,
                en diferentes especialidades, así, como personal capacitado y calificado para atender y garantizar el cuidado de la salud de
                los pacientes que nos visitan.
              </p>
            </div>
            <!--Grid column-->

            <!--Grid column-->
            <div class="col-lg-3 col-md-4 mb-4 mb-md-0">
                <h5 class="text-uppercase">Contáctanos</h5>
               
                <p><i class="icon-location"> </i>Esquina Puente Grau con Av. Bolognesi S/N Cercado. Arequipa Perú</p>
                <p><i class="icon-envelop"></i> info@example.com</p>
                <p><i class="icon-phone"></i> + 01 234 567 88</p>
                <p><i class="icon-phone"></i> + 01 234 567 89</p>
            </div>
            <!--Grid column-->

            <!--Grid column-->
            <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
                    <a class="nav-link" href="https://www.facebook.com/clinicarequipa/"><img src="img/like.png" width="100" height="100" alt=""></a>
            </div>
            <!--Grid column-->
          </div>
          <!--Grid row-->
        </div>
        <!-- Grid container -->

        <!-- Copyright -->
        <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
          © 2020 Copyright:
          <a class="text-white" href="#"></a>
        </div>
    </footer>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>