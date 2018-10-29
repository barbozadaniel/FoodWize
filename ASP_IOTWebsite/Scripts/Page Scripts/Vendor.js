$(document).ready(function () {
    $('#tblVendorDemand').dataTable({});

    $('#btnLogout').click(function () {
        window.location.href = '/FoodLogin/FoodLogin';
    });
});

$('#btn1').click(function () {
    $('#messageDiv').show();
    //window.location.href = '/ManagerDashboard/ManagerDashboard';
});