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
    public partial class frm04 : Form
    {
        public frm04()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            double a = int.Parse(txt1.Text);
            double b = int.Parse(txt2.Text);
            double c = int.Parse(txt3.Text);

            if (c > 10 && c <= 18) { c = c + 2; }
            if (c == 19) { c = c + 1; }
            if (c == 20) { c = c + 0; }
            else { c = c + 0; }

            double promedio = (a + b + c) / 3;

            txtF.Text = "" + promedio;

        }
    }
}
