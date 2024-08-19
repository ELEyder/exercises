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
    public partial class frm10 : Form
    {
        public frm10()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int num, x1, x2, x3, x4, final;
            num = int.Parse(txtN.Text);

            x1 = num % 10;
            num = (num - x1) / 10;
            x2 = num % 10;
            num = (num - x2) / 10;
            x3 = num % 10;
            num = (num - x3) / 10;
            x4 = num % 10;
            num = (num - x4) / 10;

            x1 = x1 * 1000;
            x2 = x2 * 100;
            x3 = x3 * 10;
            int sum = x1 + x2 + x3 + x4;
            txtS.Text = sum.ToString();
        }
    }
}
