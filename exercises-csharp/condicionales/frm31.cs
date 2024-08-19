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
    public partial class frm31 : Form
    {
        public frm31()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int horas = int.Parse(txtHoras.Text);

            double pension = (txtCategorias.Equals("a") ? 21 : txtCategorias.Equals("b") ? 19.5 : txtCategorias.Equals("c") ? 17 : txtCategorias.Equals("d") ? 15.5 : 0);

            double sbruto = pension * horas;

            double descuento = sbruto > 2500 ? 0.2 * sbruto : 0.15 * sbruto;


            txtSbruto.Text = sbruto.ToString("0.#0");
            txtDescuento.Text = descuento.ToString("0.#0");
            txtSneto.Text = (sbruto - descuento).ToString("0.#0");
        }
    }
}
