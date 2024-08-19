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
    public partial class frm22 : Form
    {
        public frm22()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int a = int.Parse(txtA.Text);
            int b = int.Parse(txtB.Text);
            double da = a > 50 ? 0.15 * a * 25 : 0;
            double db = b > 60 ? 0.1 * b * 30 : 0;


            txtImporte.Text = ("" + (a * 25 + b * 30));
            txtDescuento.Text = (da + db + "");
            txtTotal.Text =((a * 25 - da) + (b * 30 - db) + "");

        }
    }
}
