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
    public partial class frm11 : Form
    {
        public frm11()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            int c = 0;
            for (int i = 100; i <= 999; i++) {

                int n1 = i / 100;
                int n2 = i / 10 - n1 * 10;
                int n3 = i % 10;

                if (n1 == n3) { c++; }

                txtResultado.Text = " " + c;
            }
        }
    }
}
