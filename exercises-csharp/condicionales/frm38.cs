using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Fp.condicionales
{
    public partial class frm38 : Form
    {
        public frm38()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int año = int.Parse(txtAño.Text);
            int mes = int.Parse(txtMes.Text);

            String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
            txtMes1.Text = (meses[mes - 1]);



            int a = 0;
            if (año % 4 == 0)
            {
                if (año % 100 == 0)
                {
                    if (año % 400 == 0) { txtEstado.Text = ("Bisiesto"); a = 1; }
                    else { txtEstado.Text = ("No Bisiesto"); }
                }
                else { txtEstado.Text = ("Bisiesto"); a = 1; }
            }
            else txtEstado.Text = ("No Bisiesto");

            int[] dias = { 31, a == 1 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            txtDias.Text = (dias[mes - 1] + "");

        }
    }
}
