using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ejercicios.secuencial
{
    public partial class frm03 : Form
    {
        public frm03()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double tramo_1 = double.Parse(txtT1.Text);
            double tramo_2 = double.Parse(txtT2.Text);
            double tramo_3 = double.Parse(txtT3.Text);

            tramo_1 *= 1000;
            tramo_2 /= 3.2808;
            tramo_3 /= 16909;

            double total = tramo_1 + tramo_2 + tramo_3;

            double totalYardas = total * 1.0936;

            txtR1.Text = total.ToString();
            txtR2.Text = totalYardas.ToString();
        }
    }
}
