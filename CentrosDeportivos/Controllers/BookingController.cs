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

        public ActionResult PayMethod(int id_sport, int id_field, string date, string time)
        {
            ViewData["id_sport"] = id_sport;
            ViewData["id_field"] = id_field;
            ViewData["date"] = date+" "+time+":00";
            return View();
        }

        [HttpPost]
        public ActionResult PayMethod(PayMethodViewModel model)
        {
            if (ModelState.IsValid)
            {
                if (model.PayMethod.Equals("Selecciona el método de pago"))
                    ModelState.AddModelError("", "Debe seleccionar un método de pago");
                else
                {
                    //TODO - Aquí añadir las comprobaciones del servicio BPEL 
                    return RedirectToAction("Created", "Booking");
                }
            
            }
            return View(model);
        }

        public ActionResult Created()
        {
            return View();
        }
    }
}