using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace CentrosDeportivos.Controllers.API
{
    public class SportCenterController : ApiController
    {
        public IHttpActionResult getSports(int id) //Servicio REST
        {
            CentrosDeportivos.SportCenterService.SportCenterService sc = new CentrosDeportivos.SportCenterService.SportCenterService();
            List<CentrosDeportivos.SportCenterService.Sport> sports = new List<CentrosDeportivos.SportCenterService.Sport>(sc.getSports(id));
            return Ok(sports);
        }
    }
}
