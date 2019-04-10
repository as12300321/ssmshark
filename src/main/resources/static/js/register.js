
    //加载事件
    $(function () {
        //目的：校验用户名，通过之后提交异步请求进行用户信息注册

        //1.注册表单提交事件
        $("#registerForm").submit(function () {
            //2.校验用户名
            var username = $("#username").val();
            //校验用户名，校验要求用户名字符长度6~18个字符，首字符必须为英文字母，其它字符范围为数字或英文字母或下划线
            var reg=/^[a-zA-Z]\w{5,17}$/;
            if(reg.test(username)){
                //提交异步请求
                var url="/user/register";//UserServlet
                var data=$(this).serialize();//获取表单所有元素数据key1=value1&key2=value2
                var callback = function (resultInfo) {
                    if(resultInfo.flag){
                        //注册成功,跳转register_ok.html
                        location.href="register_ok.html";
                    }else{
                        //发生异常
                        $("#msg").text(resultInfo.errorMsg);
                    }
                };
                var type="json";
                $.post(url,data,callback,type);
            }else{
                alert("用户名验证失败");
            }
            return false;//不让表单提交
        });
    });
function register(){
    $.ajax({
        type:"POST",
        dataType:"json",
        url:"",
        data:$('#form1').serialize(),
        success: function (result) {
            console.log(result);//打印服务端返回的数据(调试用)
            if (result.resultCode == 200) {
                alert("SUCCESS");
            }
            ;
        },
        error : function() {
            alert("异常！");
        }
    });

}
