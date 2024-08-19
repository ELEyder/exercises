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
    public partial class frm01 : Form
    {
        public frm01()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int varones = int.Parse(txtV.Text);
            int mujeres = int.Parse(txtV.Text);

            int total = varones + mujeres;

            double pvarones = total / varones;
            double pmujeres = total / mujeres;

            txtPV.Text = pvarones.ToString();
            txtPM.Text = pmujeres.ToString();
        }
    }
}
