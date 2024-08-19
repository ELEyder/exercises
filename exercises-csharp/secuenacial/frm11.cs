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
    public partial class frm11 : Form
    {
        public frm11()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string num1, num2, num3, num4;

            num1 = txtN1.Text;
            num2 = txtN2.Text;

            txtN3.Text = (num2[2].ToString() + num1[1].ToString() + num2[0].ToString()).ToString();
            txtN4.Text = (num1[2].ToString() + num2[1].ToString() + num1[0].ToString()).ToString();

        }
    }
}
