<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>

<body>
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">
                     
            <div class="mb-md-5 mt-md-4 pb-5">

								<form action="log" method="post">

									<h2 class="fw-bold mb-2 text-uppercase">Login</h2>
									<p class="text-white-50 mb-5">Please enter your login and
										password!</p>

									<div class="form-outline form-white mb-4">
										<input type="email" name="email" id="typeEmailX"
											class="form-control form-control-lg" /> <label
											class="form-label" for="typeEmailX">Email</label>
									</div>

									<div class="form-outline form-white mb-4">
										<input type="password" name="password" id="typePasswordX"
											class="form-control form-control-lg" /> <label
											class="form-label" for="typePasswordX">Password</label>
									</div>

									<p class="small mb-5 pb-lg-2">
										<a class="text-white-50" href="#!">Forgot password?</a>
									</p>

									<input type="submit" name="Submit" value="SUBMIT" />

									<div
										class="d-flex justify-content-center text-center mt-4 pt-1">
										<a href="#!" class="text-white"><i
											class="fab fa-facebook-f fa-lg"></i></a> <a href="#!"
											class="text-white"><i
											class="fab fa-twitter fa-lg mx-4 px-2"></i></a> <a href="#!"
											class="text-white"><i class="fab fa-google fa-lg"></i></a>
									</div>
							</div>

            <div>
              <p class="mb-0">Don't have an account? <a href="#!" class="text-white-50 fw-bold">Sign Up</a>
              </p>
            
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>
</body>
</html>