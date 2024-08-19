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
    public partial class frm13 : Form
    {
        public frm13()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int suma = 0;
            int n = int.Parse(txtVariablen.Text);

            for (int i = 0; i < n + 1; i++)
            {
                if (i % 3 == 0 && i % 5 != 0)
                {
                    suma += i;
                }
            }

            txtResultado.Text = suma + "";
        }
    }
}
