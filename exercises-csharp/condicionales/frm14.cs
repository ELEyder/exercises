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
    public partial class frm14 : Form
    {
        public frm14()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int tarjeta = int.Parse(txtTarjeta.Text);
            int monto = int.Parse(txtMonto.Text);
            double descuento = 0;

            if (tarjeta >= 100 || tarjeta / 2 == 0) descuento = 0.15 * monto;
            else descuento = 0.05 * monto;

            txtDescuento.Text = (descuento + "");
            txtTotal.Text = ("" + (monto - descuento));

        }
    }
}
