using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ASP_IOTWebsite.Controllers
{
    public class FoodLoginController : Controller
    {
        // GET: FoodLogin
        public ActionResult FoodLogin()
        {
            return View("FoodLoginView");
        }
    }
}