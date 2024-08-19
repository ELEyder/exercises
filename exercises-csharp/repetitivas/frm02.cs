using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Fp.repetitivas
{
    public partial class frm02 : Form
    {
        public frm02()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int N1 = int.Parse(txtN1.Text);
            int N2 = int.Parse(txtN2.Text);

            for (int Nx = N1; N2 > 1; N1 += Nx, N2--) ;

            txtProducto.Text = ("" + N1);
        }
    }
}
