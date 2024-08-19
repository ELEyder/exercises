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
    public partial class frm04 : Form
    {
        public frm04()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double alturaPies = double.Parse(txtE1.Text);
            double alturaPul = double.Parse(txtE2.Text);

            double alturaPiesMetros = alturaPies * 0.30480;
            double alturaPulMetros = alturaPul * 0.0254;
            double alturaTotal = alturaPiesMetros + alturaPulMetros;

            txtT.Text = alturaTotal.ToString();
        }
    }
}
