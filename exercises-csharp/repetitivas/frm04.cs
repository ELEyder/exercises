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
    public partial class frm04 : Form
    {
        public frm04()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int numero = int.Parse(txtNumero.Text);





            List<int> divisores = new List<int>();

            int a = 0;
            for (int x = 1; x < numero; x++)
            {
                if (numero % x == 0)
                {
                    a = x;
                    divisores.Add(a);
                }
            }

            txtCantidad.Text = (divisores + "");
        }
    }
}
