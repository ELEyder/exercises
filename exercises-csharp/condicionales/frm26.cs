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
    public partial class frm26 : Form
    {
        public frm26()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int monto = int.Parse(txtMonto.Text);
            double prestamo = monto > 5000 ? 0.3 * monto * 1.1 : 0.2 * monto * 1.1;

            txtPrestamo.Text = prestamo.ToString("0.#0");
            txtPagar.Text = (monto - prestamo).ToString("0.#0");

        }
    }
}
