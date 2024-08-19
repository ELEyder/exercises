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
    public partial class frm01 : Form
    {
        public frm01()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int cantidad = int.Parse( txtCantidad.Text );

            int precio = cantidad <= 25 ? 27 : cantidad >= 51 ? 23 : 25;

            txtImporte.Text = "" + cantidad * precio;
            txtUnidad.Text = "" + precio;
            txtDescuento.Text = "" + (cantidad >= 51 ? 0.15 * cantidad * precio : 0.05 * cantidad * precio).ToString("0.#0");
            txtTotal.Text = "" + (cantidad >= 51 ? 85 * cantidad * precio / 100 : 95 * cantidad * precio / 100).ToString("0.#0") ;
        }
    }
}
