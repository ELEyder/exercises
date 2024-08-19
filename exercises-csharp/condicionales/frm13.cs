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
    public partial class frm13 : Form
    {
        public frm13()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int numero = int.Parse(txtNumero.Text);

            int a = numero / 100;
            int b = numero / 10 - a * 10;
            int c = numero - a * 100 - b * 10;

            if (a + 1 == b && b + 1 == c) txtOrden.Text = ("Acendente consecutivo");
            if (a - 1 == b && b - 1 == c) txtOrden.Text = ("Descendente consecutivo");
            else txtOrden.Text = ("Ordinario");
        }
    }
}
