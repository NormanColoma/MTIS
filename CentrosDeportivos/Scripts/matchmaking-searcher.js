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
            var teams = data;
            addTeams(teams);
        })
        .fail(function (jqXHR, textStatus, err) {  //Si hay error mostramos un mensaje

        });
}

function addTeams(teams) {
    $(".list-teams-container").find("p").show();
    for (var i = 0; i < teams.length; i++) {
        var team = '<li><div class="team"><a class="'+teams[i].idField+'">' + teams[i].nameField + '</a></div></li>'
        $(".list-teams").append(team);
    }

    $(".list-teams a").click(function () {
        var id = $(this).attr('class');
        var port = location.port; //Obtenemos el puerto
        var uri = "http://localhost:" + port + "/Matchmaking/createMatch/" + id; //Dirección del servicio REST
        window.location.href = uri;
    })
}