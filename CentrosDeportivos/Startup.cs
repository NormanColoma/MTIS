using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(CentrosDeportivos.Startup))]
namespace CentrosDeportivos
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
