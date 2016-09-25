<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <style type="text/css">
    	body{
    		padding-top: 60px;
    		padding-bottom: 40px
    		background-color: #F5F5F5;
    	}
    	.form-input{
    		margin-bottom:10px;
    	}
    </style>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<div class="panel panel-primary">
						<div class="panel-heading">
								<strong>登录</strong>
						</div>
						<div class="panel-body">
									<form class="form-group" action="/login" method="post">
										<input type="text" class="form-control  form-input" id="username" name="username" placeholder="用户名"/>
										<input type="password" class="form-control  form-input" id="password" name="password" placeholder="密码"/>
										<div class="row  form-input">
											<div class="col-md-7">
												<input type="text" class="form-control" id="verifycode" name="verifyCode" placeholder="验证码" />
											</div>
											<div class="col-md-5"><img src="../verifyCode/getImg" id="verifyImg"></div>
										</div>
										<div class="row">
											<div class="col-md-6 text-right">
												<button class="btn btn-primary">登录</button>
											</div>
											<div class="col-md-6">
												<button class="btn btn-primary">重置</button>
											</div>
										</div>
									</form>
						</div>
					</div>
					</div>
				</div>
		</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script>
	    $("#verifyImg").on("click", function () {
	        $("#verifyImg").attr("src", "../verifyCode/getImg?t=" + Math.random());
	    });
    </script>
  </body>
</html>