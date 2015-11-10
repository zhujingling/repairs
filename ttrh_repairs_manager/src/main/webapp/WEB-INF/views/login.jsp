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
<script type="text/javascript"
	src="../viewjs/commonjs/jquery-2.1.4.min.js"></script>
<script type="text/javascript"
	src="../bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row" style="margin-top: 20%">
			<div class="col-md-6 col-sm-12 col-xs-12 col-md-offset-3">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title" style="text-align: center;">登录</h3>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12 col-xs-12">
								<form class="form-horizontal" role="form">
									<div class="form-group">
										<label for="firstname" class="col-sm-2 control-label">名字</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="firstname"
												placeholder="请输入名字">
										</div>
									</div>
									<div class="form-group">
										<label for="lastname" class="col-sm-2 control-label">姓</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="lastname"
												placeholder="请输入姓">
										</div>
									</div>
									<div class="form-group">
										<div class="col-sm-offset-2 col-sm-10">
											<div class="checkbox">
												<label> <input type="checkbox"> 请记住我
												</label>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-sm-offset-2 col-sm-10">
											<button type="submit" class="btn btn-default">登录</button>
										</div>
									</div>
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