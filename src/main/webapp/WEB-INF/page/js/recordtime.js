
var app3 = new Vue({
        el: '#app3',
        data: {
            record_time: 'sssssssssssssss'
        }
    }
);
setTimeout(function () {            //定时器
    app3.$data.record_time = "bye world";  //VUE选择器
}, 5000);
