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
            return View();
        }
    }
}