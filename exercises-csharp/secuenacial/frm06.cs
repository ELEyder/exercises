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
    public partial class frm06 : Form
    {
        public frm06()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int altura = int.Parse(txtA.Text);
            int radio = int.Parse(txtR.Text);

            double area = 2 * 3.1416 * radio * (radio + altura);
            double volumen = 3.1416 * (radio * radio) * altura;

            txtAt.Text = area.ToString();
            txtV.Text = volumen.ToString();
        }
    }
}
