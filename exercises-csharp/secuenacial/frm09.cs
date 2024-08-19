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
    public partial class frm09 : Form
    {
        public frm09()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int numero = int.Parse(txtN.Text);

            int c1 = (int)(numero / 1000); numero %= 1000;
            int c2 = (int)(numero / 100); numero %= 100;
            int c3 = (int)(numero / 10);
            int c4 = (int)(numero % 10);

            int sum = c1 + c2 + c3 + c4;

            txtS.Text = sum.ToString();
        }
    }
}
