using CentrosDeportivos.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace CentrosDeportivos.Controllers
{
    public class BookingController : Controller
    {
        // GET: Booking
        public ActionResult Create()
        {
            CentrosDeportivos.SportCenterService.SportCenterService sc = new CentrosDeportivos.SportCenterService.SportCenterService();
            List<CentrosDeportivos.SportCenterService.SportCenter> centers = new List<CentrosDeportivos.SportCenterService.SportCenter>(sc.getSportCenters());
            return View(centers);
        }
    }
}