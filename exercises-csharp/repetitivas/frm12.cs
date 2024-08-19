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
    public partial class frm12 : Form
    {
        public frm12()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int conteo = 1;
            txaResultado.AppendText("");
            for (int i = 0; i < 10; i++)
            {
                for (int j = conteo; j < conteo + 10; j++)
                {

                    txaResultado.AppendText(j + ", ");
                }
                conteo += 10;
                txaResultado.AppendText("\n");
            }
        }
    }
}
