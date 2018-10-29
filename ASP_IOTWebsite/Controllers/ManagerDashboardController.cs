using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ASP_IOTWebsite.Controllers
{
    public class ManagerDashboardController : Controller
    {
        // GET: ManagerDashboard
        public ActionResult ManagerDashboard()
        {
            return View("ManagerDashboard");
        }
    }
}