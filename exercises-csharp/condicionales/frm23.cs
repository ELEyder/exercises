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
    public partial class frm23 : Form
    {
        public frm23()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {

            double matematica = int.Parse(txtMat.Text);
            double fisica = int.Parse(txtFisica.Text);
            double promedio = (matematica + fisica) / 2;
            int pmatematica = (int)(matematica > 17 ? matematica * 3 : matematica);
            int pfisica = (int)(matematica > 15 ? fisica * 2 : fisica / 2);


            txtPropina.Text = (pfisica + pmatematica).ToString("0.#0");
            txtObsequio.Text = (promedio > 16 ? "Reloj" : "Sin Obsequio");
        }
    }
}
