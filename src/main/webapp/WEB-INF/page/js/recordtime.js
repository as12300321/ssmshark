var app3 = new Vue({
        el:'#app3',
        data:{
            message: 'ssssssssssssssssssssssssssssssssssssssss\v\tsssss'
        }
    }
);
setTimeout(function () {            //定时器
    app3.$data.message = "bye world";  //VUE选择器
}, 5000);
