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
    public partial class frm05 : Form
    {
        public frm05()
        {
            InitializeComponent();
        }

        private void txtNumero_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            button1_Click(sender, e, txaRpta);
        }

        private void button1_Click(object sender, EventArgs e, RichTextBox txaRpta)
        {
            int numero = int.Parse(txtNumero.Text);

            txaRpta.Text = ("");
            for (int i = 1; i < 13; i++)
                txaRpta.AppendText("" + numero + " x " + i + " = " + (numero * i) + "\n"); 
        }

        private void txaRpta_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
