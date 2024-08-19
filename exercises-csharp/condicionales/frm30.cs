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
    public partial class frm30 : Form
    {
        public frm30()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int cuota = int.Parse(txtCuota.Text);
            int dia = int.Parse(txtDia.Text);

            double recarga = 0;
            double descuento = 0;

            if (dia <= 10)
            {
                if (5 > cuota * 0.02) { descuento = 5; }
                if (cuota * 0.02 > 5) { descuento = 0.02; }
            }
            if (10 < dia && dia <= 20)
            {
                descuento = 0;
            }
            if (20 < dia && dia <= 31)
            {
                if (10 > cuota * 0.03) { recarga = 10; }
                if (cuota * 0.03 > 10) { recarga = cuota * 0.03; }
            }


            double total = cuota - descuento + recarga;

            txtDescuento.Text = (descuento == 0 ? recarga : descuento).ToString("0.#0"); 
            txtTotal.Text = total.ToString("0.#0");
        }
    }
}
