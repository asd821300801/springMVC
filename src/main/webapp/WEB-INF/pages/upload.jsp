<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>附件上传</title>
</head>
<body>
	<form action="doUpload" method="post" enctype="multipart/form-data">
		
		<input type="file" accept="image/gif,image/jpeg,image/png"
			class="file-input" name="photoFile" onchange="preview1(this)" name="file">
			<input type="submit" value="提交"/>
	</form>
	<div id="photoDivId">
			<img id="photoId" name="member.photo_path"
				style="width: 142px; height: 198px;" />
		</div>
</body>

<script type="text/javascript">
	function preview1(file) {
		var prevDiv = document.getElementById('photoDivId');
		if (file.files && file.files[0]) {
			if (window.FileReader) {
				var fr = new FileReader();
			} else {
				alert("Not supported by your browser!");
			}
			var reader = new FileReader();
			reader.onload = function(evt) {
				prevDiv.innerHTML = '<img src="' + evt.target.result + '"/>';
			}
			reader.readAsDataURL(file.files[0]);
		} else {
			prevDiv.innerHTML = '<div class="img"  style="filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';
		}
	}
</script>
</html>