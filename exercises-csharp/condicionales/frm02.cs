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
    public partial class frm02 : Form
    {
        public frm02()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int cantidad = int.Parse( txtCantidad.Text );
            int importe = 20 * cantidad;
            float descuento = 0;
            int caramelos = 0;

            if (importe > 0 && importe <= 500) { descuento = 12 * importe / 100; }
            if (importe > 500 && importe <= 700) { descuento = 14 * importe / 100; }
            if (importe > 700) { descuento = 16 * importe / 100; }

            if (cantidad > 0 && cantidad <= 50) { caramelos = 5; }
            if (cantidad > 51 && cantidad <= 100) { caramelos = 10; }
            if (cantidad > 100) { caramelos = 15; }

            double total = importe - descuento;

            txtImporte.Text = "" + importe;
            txtDescuento.Text = "" + descuento;
            txtTotal.Text = "" + total;
            txtCaramelos.Text = "" + caramelos;
        }
    }
}
