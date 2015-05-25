using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Routing;

namespace CentrosDeportivos
{
    public class RouteConfig
    {
        public static void RegisterRoutes(RouteCollection routes)
        {
            routes.IgnoreRoute("{resource}.axd/{*pathInfo}");

            routes.MapRoute(
                name: "Default",
                url: "{controller}/{action}/{id}",
                defaults: new { controller = "Home", action = "Index", id = UrlParameter.Optional }
            );
            routes.MapRoute(
                name: "Booking PayMethod",
                url: "{controller}/{action}/sport/{id_sport}/field/{id_field}/date/{date}/time/{time}",
                defaults: new { controller = "Home", action = "Index", id_sport = UrlParameter.Optional, id_field = UrlParameter.Optional, date = UrlParameter.Optional, time = UrlParameter.Optional }
            );
        }
    }
}
