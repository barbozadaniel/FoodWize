$(document).ready(function () {
    $('#btnLogout').click(function () {
        window.location.href = '/FoodLogin/FoodLogin';
    });

    $('#tblRecipe').dataTable({});
});

$('#btnAdd').click(function () {
    debugger;
    if ($('#txtRecIngred').val() == "") {
        $('#txtRecIngred').val($('#ddchkIngredients').val());
    }
    else {
        $('#txtRecIngred').val($('#txtRecIngred').val() + ", " + $('#ddchkIngredients').val());
    }
    
    if ($('#txtRecComp').val() == "") {
        $('#txtRecComp').val($('#txtValue').val());
    }
    else {
        $('#txtRecComp').val($('#txtRecComp').val() + ", " + $('#txtValue').val());
    }
});
var num = 7;
$('#btnAddRecipe').click(function () {
    AddRecipe($('#txtRecName').val(), $('#ddRecCat').val(), $('#txtRecIngred').val(), $('#txtRecComp').val());
});

function AddRecipe(ingName, ingQty, ingUnit, ingLocation) {
    var table = $('#tblRecipe').DataTable();
    var rowNode = table
        .row.add([num + 1, ingName, ingQty, ingUnit, ingLocation])
        .draw()
        .node();

    //$(rowNode)
    //    .css('color', 'red')
    //    .animate({ color: 'black' });
    return true;
}
