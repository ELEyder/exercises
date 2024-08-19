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
    public partial class frm08 : Form
    {
        public frm08()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int numero = int.Parse(txtNumero.Text);
            int potencia = int.Parse(txtPotencia.Text);




            for (int i = numero; i <= numero * potencia; i += numero)
            {
            }

            txtRpta.Text = (Math.Pow(numero, potencia) + "");
        }
    }
}
