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
    public partial class frm20 : Form
    {
        public frm20()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int a = int.Parse(txtNumero1.Text);
            int b = int.Parse(txtNumero2.Text);
            int c = int.Parse(txtNumero3.Text);

            if (a == b && b == c) txtOrden.Text = ("Iguales");
            else if (a >= b && b >= c && a >= c) txtOrden.Text = ("Descendente");
            else if (a <= b && b <= c && a <= c) txtOrden.Text = ("Ascendente");
            else txtOrden.Text = ("Desorden");

        }
    }
}
