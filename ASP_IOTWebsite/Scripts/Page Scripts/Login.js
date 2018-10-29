$(document).ready(function () {
    $('#btnLogin').click(function(){
        alert('Login Successful');
        if ($('#ddRoleType').val() == "Vendor") {
            window.location.href = '/Vendor/VendorDemand';
        }
        else if ($('#ddRoleType').val() == "Manager") {
            window.location.href = '/ManagerDashboard/ManagerDashboard';
        }
        else if ($('#ddRoleType').val() == "FreeFood") {
            window.location.href = '/FreeFood/FreeFood';
        }
    });
});