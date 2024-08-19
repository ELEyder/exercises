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
    public partial class frm01 : Form
    {
        public frm01()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int dividendo = int.Parse(txtDividendo.Text);
            int divisor = int.Parse(txtDivisor.Text);

            int cociente = 1;
            for (; (dividendo = (dividendo - divisor)) >= divisor; cociente++) ;



            txtCociente.Text = ("" + cociente);
            txtResiduo.Text = ("" + dividendo);
        }
    }
}
