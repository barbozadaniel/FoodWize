using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ASP_IOTWebsite.Controllers
{
    public class NotifyController : Controller
    {
        // GET: Notify
        public ActionResult Notify()
        {
            return View("Notify");
        }
    }
}