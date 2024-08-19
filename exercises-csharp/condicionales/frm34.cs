using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Fp.condicionales
{
    public partial class frm34 : Form
    {
        public frm34()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {

            double peso = Double.Parse(txtPeso.Text);
            double estatura = Double.Parse(txtEstatura.Text);

            double IMC = peso / Math.Pow(estatura, 2);

            if (IMC < 20) { txtGrado.Text = ("Delgado"); }
            if (IMC >= 20 && IMC < 25) { txtGrado.Text = ("Normal"); }
            if (IMC >= 26 && IMC < 27) { txtGrado.Text=("Sobrepeso"); }
            if (IMC >= 27) { txtGrado.Text = ("Obesidad"); }

            txtIndice.Text = IMC.ToString("0.#0");
        }
    }
}
