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
    public partial class frm06 : Form
    {
        public frm06()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int numero = int.Parse(txtNumero.Text);
            int limite = int.Parse(txtLimite.Text);


            txaRpta.AppendText(" ");
            for (int i = 1; i <= limite; i++)
                txaRpta.AppendText("" + numero + " x " + i + " = " + (numero * i) + "\n");
        }
    }
}
