using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace CentrosDeportivos.Controllers
{
    public class MatchmakingController : Controller
    {
        // GET: Matchmaking
        public ActionResult Search()
        {
            return View();
        }

        public ActionResult Register()
        {
            CentrosDeportivos.SportCenterService.SportCenterService sc = new CentrosDeportivos.SportCenterService.SportCenterService();
            List<CentrosDeportivos.SportCenterService.SportCenter> centers = new List<CentrosDeportivos.SportCenterService.SportCenter>(sc.getSportCenters());
            return View(centers);
        }

        public ActionResult createMatch(int id)
        {
            CentrosDeportivos.MembershipService.MembershipService ms = new CentrosDeportivos.MembershipService.MembershipService ();
            String NIF = ms.getNIF(User.Identity.Name);
            CentrosDeportivos.TeamService.TeamService ts = new  CentrosDeportivos.TeamService.TeamService();
            CentrosDeportivos.TeamService.Team team_rival = ts.getTeamByNIF(NIF);
            CentrosDeportivos.TeamService.Team team_owner = ts.getTeam(id);
            CentrosDeportivos.MatchMakingService.MatchMakingService matchs = new CentrosDeportivos.MatchMakingService.MatchMakingService();
            String date = matchs.getMatchSchedule(id);
            int sport_center = matchs.getSportCenter(id);
            int sport = matchs.getSportMatch(id);
            CentrosDeportivos.MatchMakingService.Match match = new CentrosDeportivos.MatchMakingService.Match();
            match.id = 1;
            match.sport = sport;
            match.sportCentre = sport_center;
            match.team1 = team_owner.id;
            match.team2 = team_rival.id;
            match.date = date;
            bool ok;
            string message = matchs.createMatch(match, out ok);
            
            if (ok)
            {
                int id_match = 0;
                List<CentrosDeportivos.MatchMakingService.Match> matchs_availables = new List<CentrosDeportivos.MatchMakingService.Match>(matchs.getMatchsAvailables(team_owner.sport));
                foreach(CentrosDeportivos.MatchMakingService.Match m in matchs_availables){
                    if (m.team1 == match.team1 && m.team2 == match.team2 && m.date == date)
                    {
                        id_match = m.id;
                    }
                }
                ViewData["created"] = "well_created";
                matchs.confirmMatch(id_match);
            }
            else
            {
                ViewData["created"] = "already_created";

            }
            ViewData["message"] = message;
            return View();
        }
    }
}