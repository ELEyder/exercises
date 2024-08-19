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
    public partial class frm09 : Form
    {
        public frm09()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int altura = int.Parse(txtNumero.Text);


            for (int i = 1; i <= altura * 2; i++)
            {
                txaRpta.AppendText("* ");
            }
            txaRpta.AppendText("\n");

            for (int x = 0; x < altura - 2; x++)
            {
                for (int i = 0; i <= altura * 4 - 2; i++)
                {
                    if (i == 0 || i == altura * 4 - 2) { txaRpta.AppendText("*"); }
                    else { txaRpta.AppendText(" "); }
                }
            txaRpta.AppendText("\n");
            }

            for (int i = 1; i <= altura * 2; i++)
            {
                txaRpta.AppendText("* ");
            }

        }
    }
}
