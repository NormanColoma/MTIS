$(document).ready(function () {
    $("#pay-method-list").change(function () {
        var method = $("#pay-method-list option:selected").val();
        if (method == "Tarjeta de crédito") {
            $(".iban").hide();
            $(".credit-card").show();
        } else if (method == "Cuenta bancaria") {
            $(".credit-card").hide();
            $(".iban").show();
        }
        else {
            $(".credit-card").hide();
            $(".iban").hide();
        }
    })
})