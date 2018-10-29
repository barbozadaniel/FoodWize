using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(ASP_IOTWebsite.Startup))]
namespace ASP_IOTWebsite
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
