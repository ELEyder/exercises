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
    public partial class frm29 : Form
    {
        public frm29()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {

            int pago = int.Parse(txtPago.Text);
            int horas = int.Parse(txtHoras.Text);
            int sbruto = pago * horas;
            double descuento = sbruto > 1500 ? 0.11 * sbruto : 0;


            txtSbruto.Text = sbruto.ToString("0.#0");
            txtDescuento.Text = descuento.ToString("0.#0");
            txtSneto.Text = (sbruto - descuento).ToString("0.#0");
        }
    }
}
