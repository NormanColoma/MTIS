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
    }
}