using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ASP_IOTWebsite.Controllers
{
    public class VendorController : Controller
    {
        // GET: Vendor
        public ActionResult VendorDemand()
        {
            return View("VendorDemand");
        }
    }
}