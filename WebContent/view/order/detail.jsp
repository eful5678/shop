<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function a(price){
		var sel = f.quantity.options[f.quantity.selectedIndex].value;
		var q = parseInt(sel);
		var total = q*price;
		f.total_price.value = total;
	}
	
	function b(){
		f.o_state.value="1";
		f.submit()
	}
</script>
</head>
<body>
<form name="f" action="${pageContext.request.contextPath }/order/add" method="post">
<table border="1">
<tr>
<th>��ǰ��</th><td>${p.name }</td>
</tr>
<tr>
<th>����</th><td>${p.price }</td>
</tr>
<tr>
<th>�ֹ�����</th><td><select name="quantity" onchange="a(${p.price })">
<option value="0">��������</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
</select>
</td>
</tr>
<tr>
<th>�����ݾ�</th><td><input type="text" name="total_price"></td>
</tr>
<tr>
<th>��ǰ �̹���</th><td><img src="${p.img }" width="300" height="300"/>
</td>
</tr>
<tr>
<th>��ǰ�󼼼���</th><td>${p.content }</td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="����ֹ�">
<input type="button" value="��ٱ��Ͽ� ���" onclick="b()"></td>
</tr>
</table>
<input type="hidden" name="num" value="${p.num }">
<input type="hidden" name="o_state" value="0">
</form>
</body>
</html>