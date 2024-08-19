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
    public partial class frm08 : Form
    {
        public frm08()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int aprobado = int.Parse(txt1.Text);


            int propina = 0;
            switch (aprobado)
            {
                case 0:
                    propina = 20;
                    break;
                case 1:
                    propina = 25;
                    break;
                case 2:
                    propina = 30;
                    break;
                case 3:
                    propina = 35;
                    break;
            }

            txt2.Text = ("" + propina);
        }
    }
}
