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
    public partial class frm27 : Form
    {
        public frm27()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int monto = int.Parse(txtMonto.Text);
            double sbruto = 600 + monto * 0.15;
            double descuento = sbruto > 1800 ? 0.1 * sbruto : sbruto * 0.05;


            txtSbruto.Text = sbruto.ToString("0.#0");
            txtDescuento.Text = descuento.ToString("0.#0");
            txtSneto.Text = (sbruto - descuento).ToString("0.#0");
            txtObsequio.Text = (monto > 100 ? "3" : "1");

        }
    }
}
