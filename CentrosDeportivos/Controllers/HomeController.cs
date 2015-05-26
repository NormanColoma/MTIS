using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace CentrosDeportivos.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Centers()
        {
            CentrosDeportivos.SportCenterService.SportCenterService sc = new CentrosDeportivos.SportCenterService.SportCenterService();
            List<CentrosDeportivos.SportCenterService.SportCenter> centers = new List<CentrosDeportivos.SportCenterService.SportCenter>(sc.getSportCenters());
            foreach (CentrosDeportivos.SportCenterService.SportCenter center in centers)
            {
                center.sports = sc.getSports(center.id);
            }
            return View(centers);
        }

        public ActionResult Getbookings()
        {
            CentrosDeportivos.SportCenterService.SportCenterService sc = new CentrosDeportivos.SportCenterService.SportCenterService();
            List<CentrosDeportivos.SportCenterService.SportCenter> centers = new List<CentrosDeportivos.SportCenterService.SportCenter>(sc.getSportCenters());
            return View(centers);
        }

    }
}