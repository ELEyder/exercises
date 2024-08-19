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
    public partial class frm25 : Form
    {
        public frm25()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {

            int sueldo = int.Parse(txtSueldo.Text);
            int hijos = int.Parse(txtHijos.Text);

            double bonificacion = hijos == 1 ? sueldo * 0.1 : sueldo * 0.125 + (hijos - 1) * 40;
            double total = sueldo + bonificacion;


         
            txtBonificacion.Text = bonificacion.ToString("0.#0");
            txtTotal.Text = total.ToString("0.#0");

        }
    }
}
