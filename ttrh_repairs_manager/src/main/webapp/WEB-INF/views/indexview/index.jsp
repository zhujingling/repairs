<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="initial-scale=1, maximum-scale=1, user-scalable=no, width=device-width">
<link href="../css/style.css" rel="stylesheet" />
<link href="../css/sidebar.css" rel="stylesheet" />
<link href="../bootstrap-3.3.5-dist/css/bootstrap.min.css"
	rel="stylesheet" />
<script type="text/javascript"
	src="../viewjs/commonjs/jquery-2.1.4.min.js"></script>
<script type="text/javascript"
	src="../bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../viewjs/indexjs/index.js"></script>
<title>报修系统</title>
</head>
<body>

	<div class="container">


		<div class="row">
			<div id="wrapper">
				<!-- Sidebar -->
				<div id="sidebar-wrapper">
					<ul class="sidebar-nav">
						<li class="sidebar-brand"><a href="#"> Start Bootstrap </a></li>
						<li><a href="#">Dashboard</a></li>
						<li><a href="#">Shortcuts</a></li>
						<li><a href="#">Overview</a></li>
						<li><a href="#">Events</a></li>
						<li><a href="#">About</a></li>
						<li><a href="#">Services</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
				</div>
				<!-- /#sidebar-wrapper -->

				<!-- Page Content -->
				<div id="page-content-wrapper">
					<div class="row">
						<nav class="navbar navbar-default" role="navigation">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target="#example-navbar-collapse">
								<span class="sr-only">切换导航</span> <span class="icon-bar"></span>
								<span class="icon-bar"></span> <span class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="#">报修系统</a>
						</div>
						<div class="collapse navbar-collapse" id="example-navbar-collapse">
							<ul class="nav navbar-nav navbar-right">
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown"> 个人信息 <b class="caret"></b>
								</a>
									<ul class="dropdown-menu">
										<li><a href="#">个人信息</a></li>
										<li><a href="#">修改信息</a></li>
										<li><a href="#">登出</a></li>
									</ul></li>

							</ul>
						</div>
						</nav>
					</div>
					<div class="container-fluid">
						<div class="row">
							<div class="col-lg-12">
								<h1>Simple Sidebar</h1>
								<p>This template has a responsive menu toggling system. The
									menu will appear collapsed on smaller screens, and will appear
									non-collapsed on larger screens. When toggled using the button
									below, the menu will appear/disappear. On small screens, the
									page content will be pushed off canvas.</p>
								<p>
									Make sure to keep all page content within the
									<code>#page-content-wrapper</code>
									.
								</p>
								<a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle
									Menu</a>
							</div>
						</div>
					</div>
				</div>
				<!-- /#page-content-wrapper -->

			</div>
			<!-- /#wrapper -->

			<!-- jQuery -->
			<script src="js/jquery.js"></script>

			<!-- Bootstrap Core JavaScript -->
			<script src="js/bootstrap.min.js"></script>

			<!-- Menu Toggle Script -->
			<script>
				$("#menu-toggle").click(function(e) {
					e.preventDefault();
					$("#wrapper").toggleClass("toggled");
				});
			</script>
		</div>
</body>
</html>