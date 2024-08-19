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
    public partial class frm14 : Form
    {
        public frm14()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int divisores = 0;
            int n = int.Parse(txtVariablen.Text);

            for (int i = 1; i < n + 1; i++)
            {
                if (n % i == 0)
                {
                    divisores += 1;
                    if (divisores > 2)
                    {
                        txtResultado.Text = ("No es primo");
                        break;
                    }
                }
            }

            if (divisores == 2) { txtResultado.Text = ("Es primo"); };
        }
    }
}
