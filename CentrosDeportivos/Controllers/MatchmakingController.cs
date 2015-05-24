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
    }
}