<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խ���</title>
</head>
<body>
		<div id="root">
			<header>
				<h1> �Խ���</h1>
			</header>
			<hr />
			 
			<nav>
			  Ȩ - �� �ۼ�
			</nav>
			<hr />
			
			<section id="container">
				<form role="form" method="post" action="/board/write">
					<table>
						<tbody>
							<tr>
								<td>
									<label for="title">����</label><input type="text" id="title" name="title" />
								</td>
							</tr>	
							<tr>
								<td>
									<label for="content">����</label><textarea id="content" name="content" ></textarea>
								</td>
							</tr>
							<tr>
								<td>
									<label for="name">�ۼ���</label><input type="text" id="name" name="name" />
								</td>
							</tr>
							<tr>
								<td>
									<label for="pass">�ۼ���</label><input type="password" id="pass" name="pass" />
								</td>
							</tr>
							<tr>
								<td>
									<label for="writedate">�ۼ���</label><input type="text" id="writedate" name="writedate" />
								</td>
							</tr>
							<tr>
								<td>						
									<button type="submit">�ۼ�</button>
								</td>
							</tr>
						</tbody>			
					</table>
				</form>
			</section>
			<hr />
		</div>
</body>
</html>