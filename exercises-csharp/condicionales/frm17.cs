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
    public partial class frm17 : Form
    {
        public frm17()
        {
            InitializeComponent();
        }

        private void frm17_Load(object sender, EventArgs e)
        {

        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int cantidad = int.Parse(txtCantidad.Text);
            double precio = Double.Parse(txtPrecio.Text);

            double monto = cantidad * precio;
            double descuento = (cantidad > 6 ? 0.15 * monto : 0.01 * monto);
            int obsequio = (cantidad >= 30 ? 2 * cantidad / 3 : 0);

            txtMonto.Text = monto.ToString("0.#0");
            txtDescuento.Text = descuento.ToString("0.#0");
            txtTotal.Text = (monto - descuento).ToString("0.#0");
            txtObsequio.Text = ("" + obsequio);

        }
    }
}
