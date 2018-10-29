$(document).ready(function () {
    $('#btnLogout').click(function () {
        window.location.href = '/FoodLogin/FoodLogin';
    });

    $('#tblStorage').dataTable({});

    //$('#ddchkIngredients').multiple({});
    
});

var ingNum = 13;

function AddIngredient(ingName, ingQty, ingUnit, ingLocation) {
    var table = $('#tblStorage').DataTable();
    var rowNode = table
        .row.add([ingNum + 1, ingName, ingQty, ingUnit, ingLocation])
        .draw()
        .node();

    //$(rowNode)
    //    .css('color', 'red')
    //    .animate({ color: 'black' });
    return true;
}

$('#btnAddIngredient').click(function () {
    AddIngredient($('#txtIngName').val(), $('#txtQuantity').val(), $('#ddUnit').val(), $('#txtShelfLoc').val());
});