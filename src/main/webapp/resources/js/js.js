/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $('[data-toggle="toggle"]').change(function () {
        $(this).parents().next('.hide').toggle();
    });
});

$(`#checkAll`).click(function () {
    if ($(this).is(":checked")) {
        $("#table-hall input").each(function ()
        {
            $(this).prop("checked", true);
        })
    } else {
        $("#table-hall input").each(function ()
        {
            $(this).prop("checked", false);
        })
    }
})
//})

function deleteSanh(DDTC_id) {
    if (confirm("Are you sure want to delete?") == true) {
        fetch(`/EventCenter/manageHall/${DDTC_id}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(res => {
            if (res.status == 200) {
                let d = document.getElementById(`sanh${DDTC_id}`);
                d.style.display = "none";
            } else
                alert("Something wrong!!!");
        })
    }
}

function deleteChuTri(ChuTri_id) {
    if (confirm("Are you sure want to delete?") == true) {
        fetch(`/EventCenter/manageHost/${ChuTri_id}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(res => {
            if (res.status == 200) {
                let d = document.getElementById(`chutri${ChuTri_id}`);
                d.style.display = "none";
            } else
                alert("Something wrong!!!");
        })
    }
}

function deleteTrangTri(TrangTri_id) {
    if (confirm("Are you sure want to delete?") == true) {
        fetch(`/EventCenter/manageDecor/${TrangTri_id}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(res => {
            if (res.status == 200) {
                let d = document.getElementById(`trangtri${TrangTri_id}`);
                d.style.display = "none";
            } else
                alert("Something wrong!!!");
        })
    }
}

function deleteGiaiTri(GiaiTri_id) {
    if (confirm("Are you sure want to delete?") == true) {
        fetch(`/EventCenter/manageEnt/${GiaiTri_id}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(res => {
            if (res.status == 200) {
                let d = document.getElementById(`giaitri${GiaiTri_id}`);
                d.style.display = "none";
            } else
                alert("Something wrong!!!");
        })
    }
}

function deletePhucVu(PhucVu_id) {
    if (confirm("Are you sure want to delete?") == true) {
        fetch(`/EventCenter/manageServe/${PhucVu_id}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(res => {
            if (res.status == 200) {
                let d = document.getElementById(`phucvu${PhucVu_id}`);
                d.style.display = "none";
            } else
                alert("Something wrong!!!");
        })
    }
}

function deleteNhanVien(NhanVien_id) {
    if (confirm("Are you sure want to delete?") == true) {
        fetch(`/EventCenter/manageEmployee/${NhanVien_id}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(res => {
            if (res.status == 200) {
                let d = document.getElementById(`n${NhanVien_id}`);
                d.style.display = "none";
            } else
                alert("Something wrong!!!");
        })
    }
}