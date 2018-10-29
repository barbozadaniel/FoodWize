using ASP_IOTWebsite.Models;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ASP_IOTWebsite.Controllers
{
    public class HomeController : Controller
    {
        MySql.Data.MySqlClient.MySqlConnection conn;
        string myConnectionString;

        public ActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public ActionResult Index(TempModel tempModel)
        {
            string sqlQuery;
            TempModel output_tempModel = new TempModel();
            //string connectionString = "server=127.0.0.1; uid=root; pwd=admin; database=sys; port=3306";
            //using (SqlConnection sqlConnection = new SqlConnection(connectionString))
            //using (SqlCommand sqlCommand = new SqlCommand("", sqlConnection))
            //{
            //    sqlConnection.Open();
            //    sqlCommand.CommandText = "select Test_Num from testtable;";
            //    sqlCommand.Parameters.AddWithValue("@value", tempModel.value);
            //    SqlDataReader reader = sqlCommand.ExecuteReader();
            //    output_tempModel.value = reader["Test_Num"].ToString();
            //}


            MySqlConnectionStringBuilder conn_string = new MySqlConnectionStringBuilder();
            conn_string.Server = "127.0.0.1";
            conn_string.UserID = "root";
            conn_string.Password = "admin";
            conn_string.Database = "sys";

            using (MySqlConnection conn = new MySqlConnection(conn_string.ToString()))
            using (MySqlCommand cmd = conn.CreateCommand())
            {   
                cmd.CommandText = "select Test_Num from testtable where Test_ID = 2;";
                conn.Open();
                //cmd.Parameters.AddWithValue("@value", tempModel.value);
                int value = (int)cmd.ExecuteScalar();
                //MySqlDataReader reader = cmd.ExecuteScalar();
                //while (reader.Read())
                //{
                //    int a = 0;
                //    a = a + 1;
                //    var b = reader.GetString(0);
                //}
                output_tempModel.value = Convert.ToString(value);
            }

            //output_tempModel.value = "1";

            ViewBag.ErrorMessage = output_tempModel.value;

            return View(output_tempModel);
        }

        public ActionResult About()
        {
            ViewBag.Message = "Your application description page.";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "Your contact page.";

            return View();
        }

        
    }
}