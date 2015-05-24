using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.Http;

namespace CentrosDeportivos
{
    public static class WebApiConfig
    {
        public static void Register(HttpConfiguration config)
        {
            // Configuración y servicios de API web

            // Rutas de API web
            config.MapHttpAttributeRoutes();

            config.Routes.MapHttpRoute(
                name: "DefaultApi",
                routeTemplate: "api/{controller}/{id}",
                defaults: new { id = RouteParameter.Optional }
            );

            config.Routes.MapHttpRoute(
                name: "sportCenter",
                routeTemplate: "api/{controller}/{action}/{id}",
                defaults: new { id = RouteParameter.Optional }
            );

            /**config.Routes.MapHttpRoute(
                name: "getFields",
                routeTemplate: "api/{controller}/{action}/{id_sport}/{id_sc}/{fecha}",
                defaults: new { id = RouteParameter.Optional }
            );**/
        }
    }
}
