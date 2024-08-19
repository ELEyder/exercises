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
    public partial class frm09 : Form
    {
        public frm09()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int codigo = int.Parse(txtCodigo.Text);
            int cantidad = int.Parse(txtCantidad.Text);
            int precio = 0;
            double descuento = 0;


            switch (codigo)
            {
                case 101:
                    precio = 17;
                    break;
                case 102:
                    precio = 25;
                    break;
                case 103:
                    precio = 16;
                    break;
                case 104:
                    precio = 27;
                    break;
            }

            int importe = precio * cantidad;

            if (cantidad >= 1 && cantidad <= 10) { descuento = 0.05 * importe; }
            if (cantidad >= 11 && cantidad <= 20) { descuento = 0.8 * importe; }
            if (cantidad >= 21 && cantidad <= 30) { descuento = 0.1 * importe; }
            if (cantidad >= 31) { descuento = 0.13 * importe; }

            txtUnidad.Text = ("" + precio);
            txtDescuento.Text = descuento.ToString("0.#0");
            txtImporte.Text = ("" + importe);
            txtTotal.Text = "" +  (importe - descuento).ToString("0.#0") ;

        }
    }
}
