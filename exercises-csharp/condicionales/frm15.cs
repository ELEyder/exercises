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
    public partial class frm15 : Form
    {
        public frm15()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int monto = int.Parse(txtMonto.Text);
            double comision = 0;
            double descuento = 0;

            if (monto <= 5000) comision = 0.05 * monto;
            if (monto > 5000 && monto <= 10000) comision = 0.08 * monto;
            if (monto > 10000 && monto <= 20000) comision = 0.1 * monto;
            if (monto > 20000) comision = 0.15 * monto;

            double sueldoBruto = 250 + comision;



            if (monto >= 3500) descuento = 0.15 * sueldoBruto;
            else descuento = 0.08 * sueldoBruto;

 
            txtSueldoBruto.Text = ("" + sueldoBruto);
            txtComision.Text = "" + comision.ToString("0.#0");
            txtSueldoNeto.Text = (sueldoBruto - descuento).ToString("0.#0");
            txtDescuento.Text = "" + descuento.ToString("0.#0");
        }
    }
}
