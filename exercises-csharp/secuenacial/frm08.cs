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
    public partial class frm08 : Form
    {
        public frm08()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int altura = int.Parse(txtA.Text);
            int radio = int.Parse(txtR.Text);

            double aBase = 3.1416 * (radio * radio);
            double aLateral = 2 * 3.1416 * radio * altura;
            double aTotal = 2 * aBase + aLateral;

            txtB.Text = aBase.ToString();
            txtL.Text = aLateral.ToString();
            txtT.Text = aTotal.ToString();
        }
    }
}
