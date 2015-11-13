<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="initial-scale=1, maximum-scale=1, user-scalable=no, width=device-width">
<title>登录页面</title>
<link href="../bootstrap-3.3.5-dist/css/bootstrap.css" rel="stylesheet" />
<link href="../css/style.css" rel="stylesheet" />
<script type="text/javascript"
	src="../viewjs/commonjs/jquery-2.1.4.min.js"></script>
<script type="text/javascript"
	src="../bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../viewjs/loginjs/login.js"></script>
</head>
<body>
	<div class="container">
		<div class="row" style="margin-top: 20%">
			<div class="col-md-6 col-sm-12 col-xs-12 col-md-offset-3">
				<div class="panel panel-default loginpanel">
					<div class="panel-heading">
						<h2 class="panel-title" style="text-align: center;">登录</h2>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12 col-xs-12">
								<form class="bs-example bs-example-form" role="form" onsubmit="return false;">
									<center>
										<div class="input-group">
											<span class="input-group-addon" style="width: 35%">用户名</span>
											<input type="text" id="UName" class="form-control"
												placeholder="请输入用户名">
										</div>
										<br>
										<div class="input-group">
											<span class="input-group-addon" style="width: 35%">密码</span>
											<input type="password" id="UPwd" class="form-control"
												placeholder="请输入密码">
										</div>
										<br>
										<div class="form-group">
											<button type="submit" class="btn btn-success "
												id="btnlogin">登录</button>&nbsp;&nbsp;&nbsp;&nbsp;
													<button type="submit" class="btn btn-success "
												id="btnreset">重置</button>
										</div>						
									</center>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>