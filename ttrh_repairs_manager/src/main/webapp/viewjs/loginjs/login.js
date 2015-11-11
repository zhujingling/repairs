$(function() {

	var bUser = true;
	var bPsd = true;
	$("#UName").change(function() {
		if ($(this).val() == "" || $(this).val() == null) {
			bUser = uiInput(this, false);
		}
	});
	$("#UPwd").change(function() {
		if ($(this).val() == "" || $(this).val() == null) {
			bPsd = uiInput(this, false);
		}
	});
	
	function hrefByName(filename) {
        if (filename) {
            window.location.href = "indexview/" + filename;
        }
    }

	function uiInput(id, valid) {
		return valid;
	}
	$("#btnlogin").click(function() {
		if (!bUser) {
			alert("用户名不能为空");
			return;
		}
		if (!bPsd) {
			alert("密码不能为空");
			return;
		}
		if (bUser && bPsd) {
			$.post("../userLogin.do", {
				uName : $("#UName").val(),
				uPwd : $("#UPwd").val()
			}, function(data, status) {
				if (status == "success") {
					var obj = JSON.parse(data);
					window.localStorage["user"]=obj;
					hrefByName("index.do");
				}
			})
		}
	})
})