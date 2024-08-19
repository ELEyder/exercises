using System;
using System.Windows.Forms;

namespace Ejercicios.secuencial
{
    public partial class frm13 : Form
    {
        public frm13()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double c1, c2, hipotenusa;

            c1 = double.Parse(txtN1.Text);
            c2 = double.Parse(txtN2.Text);

            hipotenusa = Math.Sqrt((c1 * c1) + (c2 * c2));
        }
    }
}
