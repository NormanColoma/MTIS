$(document).ready(function () {
    $(".search-teams").click(function () {
        var sport = $(".sports option:selected").text();
        getTeams(sport);
    })
})

function getTeams(sport) {
    var port = location.port; //Obtenemos el puerto
    var uri = "http://localhost:" + port + "/api/Matchmaking/getTeams/" + sport; //Dirección del servicio REST
    $.getJSON(uri) //Hacemos petición GET al servicio
        .done(function (data) {
            alert(data.length)
            //var teams = data;  //Obtenemos los datos
            //addSports(sports)   //Llamamos a la función para que haga lo que proceda

        })
        .fail(function (jqXHR, textStatus, err) {  //Si hay error mostramos un mensaje

        });
}