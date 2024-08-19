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
    public partial class frm07 : Form
    {
        public frm07()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int b = int.Parse(txtBase.Text);
            int altura = int.Parse(txtBase.Text);

            int area = b * altura;
            int perimetro = 2 * (b + altura);

            txtArea.Text = area.ToString();
            txtPeri.Text = perimetro.ToString();
        }
    }
}
