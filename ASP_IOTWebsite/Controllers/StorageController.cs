using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ASP_IOTWebsite.Controllers
{
    public class StorageController : Controller
    {
        // GET: Storage
        public ActionResult Storage()
        {
            return View("Storage");
        }
    }
}