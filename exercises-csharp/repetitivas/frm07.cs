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
    public partial class frm07 : Form
    {
        public frm07()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int numero = int.Parse(txtNumero.Text);



            int factorial = 1;
            for (int i = 1; i <= numero; i++)
                factorial *= i;

            txtFactorial.Text = (factorial + "");

        }
    }
}
