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
    public partial class frm18 : Form
    {
        public frm18()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            double donacion = int.Parse(txtDonacion.Text);
            double salud = (donacion >= 10000 ? 0.3 * donacion : 0.25 * donacion);
            double comedor = (donacion >= 10000 ? 0.5 * donacion : 0.6 * donacion);
            double escuela = (donacion >= 10000 ? 0.2 * donacion : 0.15 * donacion);


 
            txtSalud.Text = salud.ToString("0.#0");
            txtComedor.Text = comedor.ToString("0.#0");
            txtBolsa.Text = escuela.ToString("0.#0");
        }
    }
}
