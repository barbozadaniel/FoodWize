$(document).ready(function () {
    $('#btnLogout').click(function () {
        window.location.href = '/FoodLogin/FoodLogin';
    });

    $('#tblPriceCheck').dataTable({});
    $('#tblAnalysis').dataTable({});
    
});

$('#btnCheck').click(function () {
    $('#divPriceCheck').show();
    $('#ttttt').html("Ingredients for " + $('#ddRecipeList').val() );
    
});

$('#btnFinalOrder').click(function () {
    $('#messageDiv').show();
    //window.location.href = '/ManagerDashboard/ManagerDashboard';
});