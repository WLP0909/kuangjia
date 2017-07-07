/**
 * Created by WLP on 2017/7/1.
 */
function dele() {
    if (!confirm("确认删除信息？")){
        window.event.returnValue=false;
    }
}

$(document).ready(function () {
    $("#save").click(function () {
        var eid = $("#no").val();
        alert("员工编号为:"+eid);
        window.close();
    })
})
$(document).ready(function () {
    $("#form").validate({
        rules:{
            ename:{
                required:true,
                maxlength:5
            }
        },
        message:{
            ename:"必填，长度不得超过5"
        }
    })
})