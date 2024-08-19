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
    public partial class frm12 : Form
    {
        public frm12()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double a, b, c, x1, x2;
            a = double.Parse(txtN1.Text);
            b = double.Parse(txtN2.Text);
            c = double.Parse(txtN3.Text);

            x1 = (-b + Math.Sqrt((b * b) - 4 * a * c)) / (2 * a);
            x2 = (-b - Math.Sqrt((b * b) - 4 * a * c)) / (2 * a);

            txtN4.Text = x1.ToString();
            txtN5.Text = x2.ToString();
        }
    }
}
