using CentrosDeportivos.Models;
using Microsoft.AspNet.Identity;
using Microsoft.Owin;
using Microsoft.Owin.Security;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Claims;
using System.Web;
using System.Web.Mvc;

namespace CentrosDeportivos.Controllers
{
    public class AccountController : Controller
    {
        //
        // GET: /Account/
        public ActionResult Register()
        {
            return View();
        }

        public ActionResult Login()
        {
            return View();
        }

        // POST: /Account/Login
        [HttpPost]
        [AllowAnonymous]
        [ValidateAntiForgeryToken]
        public ActionResult Login(LoginViewModel model, string returnUrl)
        {
            if (ModelState.IsValid)
            {
                CentrosDeportivos.MembershipService.MembershipService mService = new MembershipService.MembershipService();
                bool user = mService.validateMember(model.Email, model.Password);
                if (user)
                {
                    var identity = new ClaimsIdentity(new[] {
                            new Claim(ClaimTypes.Name, model.Email),
                        },
                        DefaultAuthenticationTypes.ApplicationCookie,
                        ClaimTypes.Name, ClaimTypes.Role);

                    //Necesario crear el interfaz para poder tener acceso a la operación SignIn
                    IOwinContext owinContext = HttpContext.GetOwinContext();
                    IAuthenticationManager authenticationManager = owinContext.Authentication;
                    authenticationManager.SignIn(new AuthenticationProperties
                    {
                        IsPersistent = model.RememberMe
                    }, identity);
                    return RedirectToAction("index", "home");
                }
                else
                {
                    ModelState.AddModelError("", "Nombre de usuario o contraseña no válidos.");
                }
            }

            // Si llegamos a este punto, es que se ha producido un error y volvemos a mostrar el formulario
            return View(model);
        }

        public ActionResult LogOff()
        {
            IOwinContext owinContext = HttpContext.GetOwinContext();
            IAuthenticationManager authenticationManager = owinContext.Authentication;
            authenticationManager.SignOut();
            return RedirectToAction("Index", "Home");
        }

        [HttpPost]
        [AllowAnonymous]
        [ValidateAntiForgeryToken]
        public ActionResult Register(RegisterViewModel model, string returnUrl)
        {
            if (ModelState.IsValid)
            {
                CentrosDeportivos.MembershipService.MembershipService mService = new MembershipService.MembershipService();
                CentrosDeportivos.MembershipService.Member miembro= new MembershipService.Member();
               
             
                miembro.name = model.Name;
                miembro.NIF = model.DNI;
                miembro.email = "mtis@ejemplo.com";
                miembro.password = model.Password;
                miembro.VIP = false;
                miembro.surname = "";
                miembro.Province = "";
                miembro.City = "";
                bool res;
                string message;
                message = mService.registerMember(miembro, out res);
                if (res)
                {
                    
                    return RedirectToAction("index", "home");
                }
                else
                {
                    ModelState.AddModelError("", "Registro incorrecto");
                }
            }

            // Si llegamos a este punto, es que se ha producido un error y volvemos a mostrar el formulario
            return View(model);
        }
       
	}
}