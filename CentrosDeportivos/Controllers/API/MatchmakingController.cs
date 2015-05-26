using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace CentrosDeportivos.Controllers.API
{
    public class MatchmakingController : ApiController
    {
        public IHttpActionResult getTeams(string id) //Servicio REST
        {
            CentrosDeportivos.TeamService.TeamService ts = new CentrosDeportivos.TeamService.TeamService();
            List<CentrosDeportivos.TeamService.Team> teams = new List<CentrosDeportivos.TeamService.Team>(ts.getTeamsInMatchMaking(id));
            return Ok(teams);
        }
    }
}
