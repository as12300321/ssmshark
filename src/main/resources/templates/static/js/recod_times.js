$(function(){
    var min=0;
    var sec=0;
    var ms=0;
    var hour=0;
    var timer=null;
    var count=0;
    //点击第一个按钮
    $('.bnt button:eq(0)').click(function(){
        if($(this).html()=='记次'){
            if(!timer){
                alert("没有开启定时器!");
                return;
            }
            count++;
            var right1="<span class='right'>"+$('#showtime').text()+"</span>";
            var insertStr = "<div><span class='left'>记次"+count+"</span>" +right1+"</div>";

            $("#record").prepend($(insertStr));

        }else{
            min=0;
            sec=0;
            ms=0;
            count=0;
            $('#showtime span:eq(0)').html('00');
            $('#showtime span:eq(2)').html('00');
            $('#showtime span:eq(4)').html('00');
            $('#record').html('');
        }

    });
    //点击第二个按钮
    $('.bnt button:eq(1)').click(function(){
        if($(this).html()=='启动'){
            $(this).html('停止');

            $('.bnt button:eq(0)').html('记次');
            clearInterval(timer);
            timer=setInterval(show,10)
        }else{
            $(this).html('启动');
            $('.bnt button:eq(0)').html('复位');
            clearInterval(timer);
        }
    });
    //生成时间
    function show(){
        ms++;
        if(sec==60){
            min++;sec=0;
        }
        if(ms==100){
            sec++;ms=0;
        }
        if(hour==24){
            hour=0;
        }
        var msStr=ms;
        if(ms<10){
            msStr="0"+ms;
        }
        var secStr=sec;
        if(sec<10){
            secStr="0"+sec;
        }
        var minStr=min;
        if(min<10){
            minStr="0"+min;
        }
        var hourStr=hour;
        if(hourStr<10){
            hourStr="0"+hour;
        }
        $('#showtime span:eq(0)').html(hourStr);
        $('#showtime span:eq(2)').html(minStr);
        $('#showtime span:eq(4)').html(secStr);
        // $('#showtime span:eq(4)').html(msStr);
    }

}),
    $(function(){
        //按钮单击时执行
        $("#testAjax").click(function(){
            var html = $.ajax({
                type: "POST",
                url: "http://localhost:8090/testBoot/getUser/1",
                data: "name=garfield&age=18",
                async: true,
                success:function(data){
                    if(data.success){
                        console.log("searchResult" + data.msg)
                    }else{
                        alert("发生错误："+ data.msg);
                        console.log("出现错误：" + data.msg);

                    }
                },
                error:function(jqXHR){
                    alert("发生错误："+ jqXHR.status);
                }
            }).responseText;
        });
    });