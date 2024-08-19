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
    public partial class frm32 : Form
    {
        public frm32()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            double promedio = int.Parse(txtPromedio.Text);

            string descuento = "";
            if (promedio > 0 && promedio <= 13.99) descuento = "0%";
            if (promedio >= 14 && promedio <= 15.99) descuento = "10%";
            if (promedio >= 16 && promedio <= 17.99) descuento = "12%";
            if (promedio >= 18 && promedio <= 20) descuento = "15%";

            txtDescuento.Text = (descuento);
            txtPension.Text = (txtCategorias.Equals("a") ? "$550" : txtCategorias.Equals("b") ? "$500" : txtCategorias.Equals("c") ? "$450" : txtCategorias.Equals("d") ? "$400" : "error");
        }
    }
}
