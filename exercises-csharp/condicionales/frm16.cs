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
    public partial class frm16 : Form
    {
        public frm16()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int costo = int.Parse(txtCosto.Text);
            int ingresos = int.Parse(txtIngresos.Text);

            double inicial = (ingresos > 1250 ? 0.3 * costo : 0.15 * costo);
            double mensual = (ingresos > 1250 ? 0.7 * costo / 75 : 0.85 * costo / 120);

 
            txtCuotaInicial.Text = inicial.ToString("0.#0");
            txtCuotaMensual.Text = mensual.ToString("0.#0") ;
        }
    }
}
