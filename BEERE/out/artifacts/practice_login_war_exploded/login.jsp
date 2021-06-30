<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
    <style>
        input{
            border-radius: 5px;
        }
        .login{
            margin: 200px auto;
        }
    </style>

    <script>
        if(${flag eq "noUser" }){
            alert("不存在该用户");
        }
        if( ${flag eq "wrong"}){
            alert("用户名或密码错误");
        }
    </script>
</head>
<body>
      <center><h1>登陆页面</h1></center>
      <div class="login">
      <form  name="form1" method="post">
          <table border="2px" align="center" height="200px" width="300px" bgcolor="white">
              <tr>
                  <td><font face="华文行楷" size="4">用户名</font></td>
                  <td><input type="text" name="account" id="account"></td>
              </tr>
              <tr>
                  <td><font face="华文行楷" size="4">密码</font></td>
                  <td><input type="password" name="password" id="password"></td>
              </tr>
              <tr>
                  <td colspan="2" align="center">
                      <input type="button" class="loginIt" value="登陆">&nbsp;&nbsp;&nbsp;&nbsp;
                      <input type="reset" value="重置">
                  </td>
              </tr>
              <tr>
                  <td align="center">
                      <font face="华文行楷" size="4">记住我一周</font>
                  </td>
                  <td align="center">
                      <input type="checkbox" name="isChecked" value="1"/>&nbsp;&nbsp;&nbsp;&nbsp;
                  </td>
              </tr>
          </table>
      </form>
      </div>
</body>
<script>
    let click = document.querySelector('.loginIt');
    click.onclick=function () {
        let account = document.getElementById("account").value;
        let password = document.getElementById("password").value;
        if(account==""||password==""){
            window.alert("请输入用户名或密码");
        }
        else {
            document.form1.action='http://localhost:8080/practice_login_war_exploded/user/login';
            document.form1.submit();
        }
    }
</script>
</html>
